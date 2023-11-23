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
            System.out.println("Je te salue " +(mieuxGrade((Romain) r, this)) + ", je suis " + (moinsGrade((Romain) r, this).getNom()));
    }

    public Romain mieuxGrade(Romain r1, Romain r2) {
        if (Math.max(r1.grade.getValueGrade(),r2.grade.getValueGrade())==r1.grade.getValueGrade()){
            return r2;
        } else if (Math.max(r1.grade.getValueGrade(),r2.grade.getValueGrade())==r2.grade.getValueGrade()) {
            return r1;
        } else {
            return null;
        }
    }
    public Romain moinsGrade(Romain r1, Romain r2) {
        if (Math.min(r1.grade.getValueGrade(),r2.grade.getValueGrade())==r1.grade.getValueGrade()){
            return r2;
        } else if (Math.min(r1.grade.getValueGrade(),r2.grade.getValueGrade())==r2.grade.getValueGrade()) {
            return r1;
        } else {
            return null;
        }
    }

    public Grade getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "grade= " + grade ;
    }
}
