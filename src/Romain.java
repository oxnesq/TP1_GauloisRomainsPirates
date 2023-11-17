import java.util.Random;

public class Romain implements Meeting{
    private String nom;
    private int force;
    private Grade grade;

    public Romain(String nom, Grade grade) {
        this.nom = nom;
        Random r = new Random();
        this.force = r.nextInt(1,5);
        this.grade = grade;
    }

    public void meet() {
        //if ()
          //  "Je te salue "+g.grade+g.nom+", je suis "+this.nom;
    }

}
