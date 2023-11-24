import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Strategie2 extends Bataille {
    private TreeMap<Gaulois, Float> groupes;

    public Strategie2(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
        groupes= new TreeMap<Gaulois, Float>();
        for (Gaulois g :lesCombatantsGaulois){
                groupes.put(g, g.getForce());
        }
    }

    public void affronter(){
        for (int i =0; i<getBigSize();i++){
            if (>15){
                prendreUneBaffe(f);
            }
        }

    }
}
