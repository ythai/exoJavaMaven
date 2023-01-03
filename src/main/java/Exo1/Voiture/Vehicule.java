package Exo1.Voiture;

public abstract class Vehicule {
    private String couleur;
    private String marque;
    private String modele;
    private int compteur = 0;
    private boolean demarre = false;

    private static int nbInstances = 0;

    private static String type;

    public Vehicule(String couleur, String marque, String modele){
        setCouleur(couleur);
        setMarque(marque);
        setModele(modele);
    }

    public Vehicule(){
        this.couleur = "Blanc";
        this.marque = "Renault";
        this.modele = "Megane";
        this.type = "vehicule";
    }

    public void demarrer(){
        demarre = true;
    }

    public void avancer(int km){
        if(km < 0)
            System.out.println("Le compteur doit toujours être incrémenté donc pas de valeur negatif : " + km);
        else
            compteur += km;
    }

    public void arreter(){
        demarre = false;
    }

    public void afficher(){
        System.out.println("-- Infos sur le véhicule --");
        System.out.println("type : " + type);
        System.out.println("couleur : " + couleur);
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("compteur : " + compteur);
        System.out.println("Moteur demarre ? : " + demarre);
    }

    public static void IncrementerNbInstances(){
        setNbInstances(getNbInstances()+1);
    }

    public static void decrire(){
        System.out.println("Coucou, je suis un vehicule");
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if(couleur.equalsIgnoreCase("bleu") || couleur.equalsIgnoreCase("blanc") || couleur.equalsIgnoreCase("rouge"))
            this.couleur = couleur;
        else
            System.out.println("La couleur doit être « bleu », « blanc » ou « rouge » or vous avez selectionne du " + couleur);
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque){
        if(marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Dacia"))
            this.marque = marque;
        else
            System.out.println("La marque doit être « Renault » ou « Dacia » or vous avez selectionne du " + marque);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getNbInstances() {
        return nbInstances;
    }

    public static void setNbInstances(int nbInstances) {
        Vehicule.nbInstances = nbInstances;
    }
}

