public abstract class Humain implements Meeting{
    private String nom;
    private float force;

    public Humain(String nom, float force) {
        this.nom = nom;
        this.force = force;
    }

    public Humain(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public float getForce() {
        return force;
    }

    public void setForce(float force) {
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
