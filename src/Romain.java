import java.util.Random;

public class Romain extends Humain implements Meeting{
    private Grade grade;

    public Romain(String nom, Grade grade) {
        super(nom);
        Random r = new Random();
        this.setForce(r.nextInt(1,5));
        this.grade = grade;
    }

    public void meet(Humain r) {
        if ()
            System.out.println("Je te salue "+r.grade+r.getNom()+", je suis "+this.getNom());
    }
}
