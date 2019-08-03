import java.util.*;

public class ScoatereTVA {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
       // double sumaCuTVA;
      // double TVA;
     //   double sumaFaraTva;

        System.out.print("Introduceti suma initiala: ");
        double sumaCuTVA=input.nextDouble();
        System.out.print("Introduceti procent TVA: ");
        double TVA=((input.nextDouble())/100)+1;
        double TVAdinSumaInitiala= sumaCuTVA/TVA;
        double sumaFaraTva=sumaCuTVA-TVAdinSumaInitiala;
        System.out.print("Valoarea TVA este: ");
        System.out.printf("%.2f",sumaFaraTva);
        System.out.println();
        System.out.print("Suma fara TVA este: ");
        System.out.printf("%.2f",TVAdinSumaInitiala);



    }


}
