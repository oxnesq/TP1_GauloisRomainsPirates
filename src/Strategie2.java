import java.util.TreeSet;

public class Strategie2 extends Bataille {

    public Strategie2(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }


    public void groupeGaulois(){
        TreeSet<Gaulois> lesGauloisForts=new TreeSet<>();
        for (Gaulois g :lesCombatantsGaulois){
                lesGauloisForts.add(g);
        }
    }
    public void affronter(){


    }
}
