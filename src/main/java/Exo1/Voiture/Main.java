package Exo1.Voiture;

public class Main {

    public static void main (String[] args){
        Voiture voiture1 = new Voiture(null,"Renault", "Megane");
        Voiture voiture2 = new Voiture(null,"Peugeot", "208");
        Voiture voiture3 = new Voiture(null,"Citroen", "C3");
        voiture1.demarrer();
        voiture2.demarrer();
        voiture3.demarrer();
        voiture1.avancer(50);
        voiture2.avancer(20);
        voiture1.avancer(20);
        voiture1.afficher();
        voiture2.afficher();
        voiture3.afficher();
    }
}
