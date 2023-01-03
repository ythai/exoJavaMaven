package Exo1.Voiture;

public class Camion extends Vehicule {

    public Camion(){
        super();
        this.setModele("T440");
    }

    private int charge;

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge=charge;

    }

    public void modifierCharge(int chargeAModifier){
        int chargeFinal = charge + chargeAModifier;
        if(chargeFinal < 0)
            System.out.println("Charge negatif interdite:" + chargeFinal);
        else
            setCharge(chargeFinal);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Charge : " + charge);
    }
}
