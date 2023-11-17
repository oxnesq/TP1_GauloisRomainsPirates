public class Gaulois {
    private String nom;
    private int force;
    private String metier;

    public Gaulois(String nom, String metier){
        this.nom=nom;
        this.metier=metier;
        if (nom=="Obélix"){
            this.force=15;
        }else{
            this.force=1;
        }
    }


}
