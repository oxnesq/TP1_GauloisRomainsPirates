import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bataille");

        Random r = new Random();

        Gaulois abraracourcix = new Gaulois ("Abraracourcix", "chef");
        VillageGaulois villageGaulois=new VillageGaulois(abraracourcix);
        Gaulois agecanonix = new Gaulois ("Agecanonix", "retraité");
        villageGaulois=new VillageGaulois(agecanonix);
        villageGaulois.addGaulois(new Gaulois("Assurancetourix", "barde"));
        villageGaulois.addGaulois(new Gaulois("Bonemine", "femme du chef"));
        villageGaulois.addGaulois(new Gaulois("Astérix", "héros"));
        villageGaulois.addGaulois(new Gaulois("Obélix", "tailleur de menhir"));
        villageGaulois.addGaulois(new Gaulois("Cétautomatix", "forgeron"));
        villageGaulois.addGaulois(new Gaulois("Tragicomix", "beau gosse"));
        villageGaulois.addGaulois(new Gaulois("Ordralbabétix", "poissonnier"));
        villageGaulois.addGaulois(new Gaulois("Falbala", "fiancée"));
        Druide panoramix= new Druide("Panoramix", "druide", 2,8);
        villageGaulois.addGaulois(panoramix);

        System.out.println(villageGaulois);
        abraracourcix.meet(villageGaulois.getGaulois(r.nextInt(villageGaulois.size()-1)));

        panoramix.distribuerPotion(abraracourcix);
        panoramix.distribuerPotion(agecanonix);
        System.out.println(abraracourcix.getForce());
        System.out.println(agecanonix.getForce());

        for (Gaulois g : villageGaulois.getLesGaulois()){
            panoramix.distribuerPotion(g);
            System.out.println(g.getForce());
        }


        Romain caius = new Romain ("Caius Obtus", Grade.CHEF);
        CampRomain campRomain=new CampRomain(caius);

        campRomain.addRomain(new Romain("Brutus", Grade.CENTURION));
        campRomain.addRomain(new Romain("Briseradius",Grade.LEGIONNAIRE));
        campRomain.addRomain(new Romain("Caligula", Grade.LEGIONNAIRE));
        campRomain.addRomain(new Romain("Minus", Grade.LEGIONNAIRE));
        campRomain.addRomain(new Romain("Chorus", Grade.CENTURION));
        campRomain.addRomain(new Romain("Milexcus", Grade.LEGIONNAIRE));

        System.out.println(campRomain);
        caius.meet(campRomain.getRomain(r.nextInt(campRomain.size()-1)));


    }

}