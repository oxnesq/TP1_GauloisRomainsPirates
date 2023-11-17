public class Gaulois extends Humain implements Meeting{
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
    public void meet(Humain g){
        String hello="Bonjour, je suis "+ this.getNom() +"\n Bonjour" +this.getNom() +", moi c’est " + g.getNom();
    }

}
