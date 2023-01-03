package Exo1.Voiture;

public class Voiture extends Vehicule {

    public Voiture(){
        super();
        setType("voiture");
        Vehicule.IncrementerNbInstances();
    }

    public static void decrire(){
        System.out.println("Coucou, je suis une voiture");
    }
}
