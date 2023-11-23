public class Gaulois extends Humain implements Comparable<Gaulois> {
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
    public String getMetier(){
        return metier;
    }
    public void meet(Humain g){
       System.out.println("Bonjour, je suis "+ this.getNom() +"\n Bonjour " +this.getNom() +", moi c’est " + g.getNom());
    }

    public String toString(){
        return "Gaulois : "+this.getNom()+" force : " +this.getForce()+ " métier : "+this.getMetier();
    }

    public int compareTo(Gaulois o) {
        int ret = 0;
        if (this.getForce() <= o.getForce())
            ret = -1;
        if (this.getForce() >= o.getForce())
            ret = 1;
        return ret;
    }

}
