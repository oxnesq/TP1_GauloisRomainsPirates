import java.util.Random;

public class Strategie1 extends Bataille {
    public Strategie1(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }

    public void affronter() {
        while (!estTerminee()) {
            for (int i = 0; i < getBigSize(); i++) {
                prendreUneBaffe(getGaulois(i % getLittleSize()), getRomain(i % getLittleSize())); // !!!
                distribution();

            }
        }
        System.out.println("le combat est termine");
        reinitForce();
        distribution();
    }

    public Boolean estTerminee() { // !!!!!
        Boolean bo = true;
        for (int i = 0; i < getLesPerdantsRomains().size(); i++) {
            if (getRomain(i).getForceBataille() > 0) {
                return false;
            }
        }
        if ( bo ==true) return true;
        for (int i = 0; i < getLesCombatantsGaulois().size(); i++) {
            if (getGaulois(i).getForce() > 0) {
                return false;
            }
        }
        return bo;
    }

    public void prendreUneBaffe(Gaulois g, Romain r) {
        if (r.getForceBataille() > 0) {
            r.setForceBataille(((float) Math.max(0, r.getForceBataille() - ((float) g.getForce() / 6))));
            System.out.println("le gaulois : " + g + " a baffé " + r);
            g.setForce(((float) Math.max(0, g.getForce() - ((float) r.getForce()))));
        }
    }


}
