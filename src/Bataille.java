import java.util.ArrayList;

public abstract class Bataille {
    private CampRomain lesRomains;
    private VillageGaulois lesGaulois;

    public Bataille(CampRomain lesRomains, VillageGaulois lesGaulois) {
        this.lesRomains = lesRomains;
        this.lesGaulois = lesGaulois;
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
