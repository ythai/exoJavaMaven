package Exo1.Voiture;

public class Main{

    public static void main (String[] args){
        Camion camion1 = new Camion();
        camion1.setModele("T440");
        camion1.setCharge(300);
        camion1.modifierCharge(-50);
        camion1.modifierCharge(-400);
        camion1.afficher();
    }
}
