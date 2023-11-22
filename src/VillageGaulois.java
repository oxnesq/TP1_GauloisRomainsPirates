import java.util.ArrayList;

public class VillageGaulois {

    private ArrayList<Gaulois> lesGaulois = new ArrayList<Gaulois>();
    private Gaulois chef;

    public VillageGaulois(Gaulois chef) {
        this.lesGaulois = lesGaulois;
        this.chef = chef;
    }
    public Gaulois getGaulois(int i){

        return lesGaulois.get(i);
    }

    public ArrayList<Gaulois> getLesGaulois(){
        return lesGaulois;
    }

    public int size(){
        return lesGaulois.size();
    }

    public void addGaulois(Gaulois g){
        lesGaulois.add(g);
    }

    public String toString() {
        return "VillageGaulois{" +
                "les Gaulois=" + lesGaulois +
                ", chef=" + chef +
                '}';
    }


}
