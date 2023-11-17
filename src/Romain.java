import java.util.Random;

public class Romain extends Humain implements Meeting{
    private Grade grade;

    public Romain(String nom, Grade grade) {
        super(nom);
        Random r = new Random();
        this.force = r.nextInt(1,5);
        this.grade = grade;
    }

    public void meet(Romain r) {
        //if ()
          //  System.out.println("Je te salue "+r.grade+r.nom+", je suis "+this.nom);
    }

}
