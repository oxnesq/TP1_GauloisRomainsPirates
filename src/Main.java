
public class Main {
    public static void main(String[] args) {
        System.out.println("Bataille");

        Gaulois Abraracourcix = new Gaulois ("Abraracourcix", "chef");
        VillageGaulois Village=new VillageGaulois(Abraracourcix);

        Gaulois Agecanonix = new Gaulois ("Agecanonix", "retraité");
        Village.addGaulois(Agecanonix);
        Village.addGaulois(new Gaulois("Assurancetourix", "barde"));
        Village.addGaulois(new Gaulois("Bonemine", "femme du chef"));
        Village.addGaulois(new Gaulois("Astérix", "héros"));
        Village.addGaulois(new Gaulois("Obélix", "tailleur de menhir"));
        Village.addGaulois(new Gaulois("Cétautomatix", "forgeron"));
        Village.addGaulois(new Gaulois("Tragicomix", "beau gosse"));
        Village.addGaulois(new Gaulois("Ordralbabétix", "poissonnier"));
        Village.addGaulois(new Gaulois("Falbala", "fiancée"));
        Village.addGaulois(new Druide("Panoramix", "druide", 5,8));

        }

}