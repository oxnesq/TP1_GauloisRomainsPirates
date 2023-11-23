import java.util.ArrayList;

public abstract class Bataille {
    private CampRomain lesRomains;
    private VillageGaulois lesGaulois;
    private ArrayList<Gaulois> lesCombatantsGaulois;
    private ArrayList<Romain> lesPerdantsRomains;

    public Bataille(CampRomain lesRomains, VillageGaulois lesGaulois) {
        this.lesRomains = lesRomains;
        this.lesGaulois = lesGaulois;
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

    public abstract void affronter();

    public CampRomain getLesRomains() {
        return lesRomains;
    }

    public void setLesRomains(CampRomain lesRomains) {
        this.lesRomains = lesRomains;
    }

    public VillageGaulois getLesGaulois() {
        return lesGaulois;
    }

    public void setLesGaulois(VillageGaulois lesGaulois) {
        this.lesGaulois = lesGaulois;
    }
}
