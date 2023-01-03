package Exo1.Voiture;

public class Voiture {
    String couleur;
    String marque;
    String modele;
    int compteur = 0;
    boolean demarre = false;

    public Voiture(String couleur, String marque, String modele){
        this.couleur = couleur;
        this.marque = marque;
        this.modele = modele;
    }

    public Voiture(){}

    public void demarrer(){
        demarre = true;
    }

    public void avancer(int km){
        compteur += km;
    }

    public void arreter(){
        demarre = false;
    }

    public void afficher(){
        System.out.println("-- Infos sur la voiture --");
        System.out.println("couleur : " + couleur);
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("compteur : " + compteur);
        System.out.println("Moteur demarre ? : " + demarre);
    }
}
