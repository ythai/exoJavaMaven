package Calculatrice;

import java.util.Scanner;

public class Calculatrice
{
    public static double addition(double n1, double n2){
        double somme = n1 + n2;
        return somme;
    }

    public static double produit(double n1, double n2){
        double somme = n1 * n2;
        return somme;
    }

    public static double rapport(double n1, double n2){
        double somme = n1 / n2;
        return somme;
    }

    public static double difference(double n1, double n2){
        double somme = n1 - n2;
        return somme;
    }

    public static double modulo(double n1, double n2){
        double somme = n1 % n2;
        return somme;
    }

    public static void main( String[] args ){
        System.out.println("Veuillez donner une operation mathematique sous la forme (valeur valeur operation)");
        System.out.println("Operations existantes : addition, produit, difference, rapport, modulo");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strtab = str.split(" ");
//        for (String wrd : strtab){
//            System.out.println(wrd);
//        }
        double n1 = Double.parseDouble(strtab[0]);
        double n2 = Double.parseDouble(strtab[1]);
        String operation = strtab[2];
        double resultat = 0;
        switch(operation.toLowerCase())
        {
            case "addition" :
                resultat = addition(n1, n2);
                break;
            case "produit" :
                resultat = produit(n1, n2);
                break;
            case "difference" :
                resultat = difference(n1, n2);
                break;
            case "rapport" :
                resultat = rapport(n1, n2);
                break;
            case "modulo" :
                resultat = modulo(n1 ,n2);
                break;
        }
        System.out.println(operation + " de " + n1 + " et " + n2 + " est " + resultat);
    }
}
