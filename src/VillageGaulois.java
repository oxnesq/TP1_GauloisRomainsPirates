import java.util.ArrayList;

public class VillageGaulois {

    private ArrayList<Gaulois> lesGaulois = new ArrayList<Gaulois>();
    private Gaulois chef;

    public VillageGaulois(ArrayList<Gaulois> lesGaulois, Gaulois chef) {
        this.lesGaulois = lesGaulois;
        this.chef = chef;
    }

    public void addGaulois(Gaulois g){
        lesGaulois.add(g);
    }
}
