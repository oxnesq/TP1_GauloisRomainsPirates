import java.util.ArrayList;

public abstract class Bataille {
    private CampRomain lesRomains;
    private VillageGaulois lesGaulois;

    public Bataille(CampRomain lesRomains, VillageGaulois lesGaulois) {
        this.lesRomains = lesRomains;
        this.lesGaulois = lesGaulois;
    }

    public abstract void affronter();
}
