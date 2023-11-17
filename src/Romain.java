import java.util.Random;

public class Romain extends Humain implements Meeting {
    private Grade grade;

    public Romain(String nom, Grade grade) {
        super(nom);
        Random r = new Random();
        this.setForce(r.nextInt(1, 5));
        this.grade = grade;
    }

    public void meet(Humain r) {
        if (this.mieuxGrade((Romain) r)){
            System.out.println("Je te salue " +((Romain) r).grade + r.getNom() + ", je suis " + this.getNom());
        } else if (!this.mieuxGrade((Romain) r)) {
            System.out.println(" C’est à moi à te saluer " +((Romain) r).grade + r.getNom()+", je suis "+this.getNom());;
        }
    }

    public Boolean mieuxGrade(Romain r) {
        Boolean bo = null;
        if (this.grade.getValueGrade() < r.grade.getValueGrade()) {
            bo = false;
        } else if (this.grade.getValueGrade() > r.grade.getValueGrade()) {
            bo = true;

        }
        return bo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "grade=" + grade ;
    }
}
