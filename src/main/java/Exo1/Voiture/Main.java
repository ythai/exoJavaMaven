package Exo1.Voiture;

public class Main {

    public static void main (String[] args){
        Voiture voiture1 = new Voiture("rouge","Renault", "Megane");
        Voiture voiture2 = new Voiture("bleue","Peugeot", "208");
        Voiture voiture3 = new Voiture("verte","Citroen", "C3");
        voiture1.demarrer();
        voiture2.demarrer();
        voiture3.demarrer();
        voiture1.avancer(70);
        voiture2.avancer(20);
        voiture1.afficher();
        voiture2.afficher();
        voiture3.afficher();
    }
}
