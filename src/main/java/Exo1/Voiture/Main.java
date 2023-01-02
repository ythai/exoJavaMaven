package Exo1.Voiture;

public class Main {

    public static void main (String[] args){
        Voiture voiture = new Voiture();
        voiture.demarrer();
        voiture.afficher();
        voiture.avancer(10);
        voiture.afficher();
        voiture.arreter();
        voiture.afficher();
    }
}
