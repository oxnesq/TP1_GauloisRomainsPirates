public class Gaulois extends Humain {
    private int force;
    private String metier;
    public Gaulois(String nom, String metier){
        super(nom);
        this.metier=metier;
        if (nom=="Obélix"){
            this.force=15;
        }else{
            this.force=1;
        }
    }


}
