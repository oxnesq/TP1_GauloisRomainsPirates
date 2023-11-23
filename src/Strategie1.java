public class Strategie1 extends Bataille{
    public Strategie1(CampRomain lesRomains, VillageGaulois lesGaulois) {
        super(lesRomains, lesGaulois);
    }

    public void affronter(){
        for (int i=0; i<getLesGaulois().size();i++){
            if (getLesRomains().getRomain(i).getForce()!=0){

            }

        }
        getLesGaulois().getGaulois()

    }

    public void prendreUneBaffe(Gaulois g,Romain r){
        r.setForce(r.getForce()*1/6);
        System.out.println("le gaulois"+g+"a baffé"+r);
        g.setForce(g.getForce()- r.getForce());
    }


}
