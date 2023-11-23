public class Strategie1 extends Bataille {
    public Strategie1(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }

    public void affronter() {
        if (estTerminee()) {
            getLesRomains().reinitForce();
            getLesGaulois().distribution();
        }
        while (!estTerminee()) {
            for (int i = 0; i < getLesRomains().size(); i++) {
                if (getLesRomains().getRomain(i).getForce() != 0) {
                    prendreUneBaffe(getLesGaulois().getGaulois(i), getLesRomains().getRomain(i));
                }

            }
        }

    }

    public Boolean estTerminee() {
        for (int i = 0; i < getLesRomains().size(); i++) {
            if (getLesRomains().getRomain(i).getForceBataille() != 0) {
                System.out.println("la");
                return false;
            }
        }
        return true;
    }

    public void prendreUneBaffe(Gaulois g, Romain r) {
        r.setForceBataille(r.getForceBataille() * 1 / 6);
        System.out.println("le gaulois : " + g + " a baffé " + r);
        g.setForce(g.getForce() - r.getForce());
    }


}
