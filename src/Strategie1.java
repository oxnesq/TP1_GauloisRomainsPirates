public class Strategie1 extends Bataille{
    public Strategie1(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }

    public void affronter(){

    }

    public void prendreUneBaffe(Gaulois g,Romain r){
        r.setForce(r.getForce()*1/6);
        System.out.println("le gaulois"+g+"a baffé"+r);
    }


}
