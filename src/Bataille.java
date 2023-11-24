import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public abstract class Bataille {
    protected ArrayList<Gaulois> lesCombatantsGaulois;
    protected ArrayList<Romain> lesPerdantsRomains;

    public Bataille(CampRomain lesRomains, VillageGaulois lesGaulois) {
        this.lesCombatantsGaulois=new ArrayList<>();
        this.lesPerdantsRomains=new ArrayList<>();

        for (Gaulois g : lesGaulois.getLesGaulois()) {
            if (g.getMetier() != "Druide" || g.getMetier() != "Chef") {
                lesCombatantsGaulois.add(g);
            }
        }
        for (Romain r : lesRomains.getLesRomains()) {
            if (r.getGrade() != Grade.CHEF) {
                lesPerdantsRomains.add(r);
            }
        }

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
}
