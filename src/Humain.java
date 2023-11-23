public abstract class Humain implements Meeting{
    private String nom;
    private int force;

    public Humain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public Humain(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ ": "+
                "nom='" + nom + '\'' +
                ", force=" + force +'\'';
    }

    @Override
    public abstract void meet(Humain h) ;
}
