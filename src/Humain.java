public class Humain {
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
        return "Humain{" +
                "nom='" + nom + '\'' +
                ", force=" + force +
                '}';
    }
}
