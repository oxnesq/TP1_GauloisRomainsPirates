import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public abstract class Bataille {
    protected ArrayList<Gaulois> lesCombatantsGaulois;
    protected ArrayList<Romain> lesPerdantsRomains;
    private Druide druide;

    public Bataille(CampRomain lesRomains, VillageGaulois lesGaulois) {
        this.lesCombatantsGaulois=new ArrayList<Gaulois>();
        this.lesPerdantsRomains=new ArrayList<Romain>();

        for (Gaulois g : lesGaulois.getLesGaulois()) {
            if (g.getMetier() != "druide" || g.getMetier() != "chef") {
                lesCombatantsGaulois.add(g);
            } else if (g.getMetier() == "druide"){
                this.druide= (Druide) g;
            }
        }
        for (Romain r : lesRomains.getLesRomains()) {
            if (r.getGrade() != Grade.CHEF) {
                lesPerdantsRomains.add(r);
            }
        }

    }

    public void distribution() {
        Random r = new Random();
        float pot = r.nextInt(getDruide().min, getDruide().max);
        for (Gaulois g : getLesCombatantsGaulois()) {
            if (g.getForce() < 5) {
                g.setForce(g.getForce() + pot);
            }
        }
    }

    public Druide getDruide() {
        for (Gaulois g : getLesCombatantsGaulois()) {
            if (g instanceof Druide) return (Druide) g;
        }
        return null;
    }

    public int getBigSize(){
        if (lesPerdantsRomains.size() > lesCombatantsGaulois.size()){
            return lesPerdantsRomains.size();
        } else if (lesPerdantsRomains.size()< lesCombatantsGaulois.size()) {
            return lesCombatantsGaulois.size();
        } else {
            return 0;
        }

    }public int getLittleSize(){
        if (lesPerdantsRomains.size()< lesCombatantsGaulois.size()){
            return lesPerdantsRomains.size();
        } else if (lesPerdantsRomains.size()> lesCombatantsGaulois.size()) {
            return lesCombatantsGaulois.size();
        } else {
            return 0;
        }

    }

    public Gaulois getGaulois(int i) {
        return getLesCombatantsGaulois().get(i);
    }

    public Romain getRomain(int i){
        return getLesPerdantsRomains().get(i);
    }

    public void reinitForce(){
        for (Romain r : lesPerdantsRomains){
            r.setForceBataille(r.getForce());
        }
    }

    public abstract void affronter();

    public ArrayList<Gaulois> getLesCombatantsGaulois() {
        return lesCombatantsGaulois;
    }

    public void setLesCombatantsGaulois(ArrayList<Gaulois> lesCombatantsGaulois) {
        this.lesCombatantsGaulois = lesCombatantsGaulois;
    }

    public ArrayList<Romain> getLesPerdantsRomains() {
        return lesPerdantsRomains;
    }

    public void setLesPerdantsRomains(ArrayList<Romain> lesPerdantsRomains) {
        this.lesPerdantsRomains = lesPerdantsRomains;
    }

    public void prendreUneBaffe(Gaulois g, Romain r) {
        if (r.getForceBataille() > 0) {
            r.setForceBataille(((float) Math.max(0, r.getForceBataille() - ((float) g.getForce() / 6))));
            System.out.println("le gaulois : " + g + " a baffé " + r);
            g.setForce(((float) Math.max(0, g.getForce() - ((float) r.getForce()))));
        }
    }

}
