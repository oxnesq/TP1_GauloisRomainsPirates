import java.util.Random;

public class Strategie1 extends Bataille {
    public Strategie1(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }

    public void affronter() {
        if (estTerminee()) {
            reinitForce();
            //distribution();
        } else {
            while (!estTerminee()) {
                for (int i = 0; i < getBigSize(); i++) {
                    if (getLesPerdantsRomains().get(i%getLittleSize()).getForce() > 0) {
                        prendreUneBaffe(getGaulois(i%getLittleSize()), getRomain(i%getLittleSize())); // !!!
                        //distribution();
                    }

                }
            }
        }

    }

    public Boolean estTerminee() { // !!!!!
        for (int i = 0; i < getLesPerdantsRomains().size(); i++) {
            if (getRomain(i).getForceBataille() > 0) {
                return false;
            }
        }
        for (int i = 0; i < getLesCombatantsGaulois().size(); i++) {
            if (getGaulois(i).getForce() > 0) {
                return false;
            }
        }
        System.out.println("Le jeu est termine");
        return true;
    }

    public void prendreUneBaffe(Gaulois g, Romain r) {
        r.setForceBataille(((float)r.getForceBataille() - ((float) g.getForce() / 6)));
        System.out.println("le gaulois : " + g + " a baffé " + r);
        g.setForce(((float)Math.max(0, g.getForce() - ((float)r.getForce()))));
    }


}
