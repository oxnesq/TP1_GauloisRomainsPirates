import java.util.ArrayList;

public class VillageGaulois {

    private ArrayList<Gaulois> lesGaulois = new ArrayList<Gaulois>();
    private Gaulois chef;

    public VillageGaulois(Gaulois chef) {
        this.lesGaulois = lesGaulois;
        this.chef = chef;
    }

    public void addGaulois(Gaulois g){
        lesGaulois.add(g);
    }

    public String toString(){
        String v="Village: \n";
        for (Gaulois g : lesGaulois){
            v=v+g.toString();
        }
        return v;
    }
}
