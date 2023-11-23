import java.util.ArrayList;
import java.util.Random;

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

    public Gaulois getChef(){

        return chef;
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

    public void distribution() {
        Random r = new Random();
        int pot = r.nextInt(getDruide().min,getDruide().max);
        for (Gaulois g:lesGaulois){
            getDruide().distribuerPotion(g, pot);
        }


    }

    public Druide getDruide(){
        for (Gaulois g  : lesGaulois){
            if (g instanceof Druide) return (Druide) g;
        }
        return null;
    }


}
