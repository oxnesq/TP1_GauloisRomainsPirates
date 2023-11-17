import java.util.ArrayList;

public class CampRomain {
    private ArrayList<Romain> lesRomains = new ArrayList<Romain>();
    private Romain chef;

    public CampRomain(ArrayList<Romain> lesRomains, Romain chef) {
        this.lesRomains = lesRomains;
        this.chef = chef;
    }

    public CampRomain(Romain chef) {
        this.chef = chef;
    }

    public void addRomain(Romain r){
        lesRomains.add(r);
    }

    @Override
    public String toString() {
        return "CampRomain{" +
                "lesRomains=" + lesRomains +
                ", chef=" + chef +
                '}';
    }
}


