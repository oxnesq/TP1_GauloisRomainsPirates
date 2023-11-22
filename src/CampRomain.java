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

    public Romain getRomain(int i){
        return lesRomains.get(i);
    }

    public Romain romainNom(String s){
        for (Romain r : lesRomains){
            if (r.getNom()==s)
                return r;
        }
        return null;
    }

    public int size(){
        return lesRomains.size();
    }

    @Override
    public String toString() {
        return "CampRomain{" +
                "lesRomains=" + lesRomains +
                ", chef=" + chef +
                '}';
    }
}


