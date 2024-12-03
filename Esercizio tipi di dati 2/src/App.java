import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.println("Scrivimi il nome del piatto");
        String nome = sc.nextLine();

        
        System.out.println("Descrivimelo");
        String descrizione = sc.nextLine();


        System.out.println("Quanto costa?");
        float costo = sc.nextFloat();


        System.out.println("Il piatto è disponibile?");
        Boolean disponibile = sc.nextBoolean();


        System.out.println("Qual è la tipologia del piatto? 1) Piatto del mattino, 2) Piatto del pomeriggio, 3) Piatto della sera");
        Byte tipologia = sc.nextByte();
        sc.nextLine();


        System.out.println("Elencami gli allegerni del piatto");
        String allergeni = sc.nextLine();


        System.out.println("Quante calorie ha il piatto?");
        short calorie = sc.nextShort();
        sc.nextLine();


        System.out.println("Che tipo di variazioni del piatto ci sono?");
        String variazioni = sc.nextLine();

        System.out.println("Foto del piatto");
        String foto = sc.nextLine();


        

        // ------------------------------------------------------

        System.out.println("");
        System.out.println(" ------------------------------------------------------");


        System.out.println("Nome del piatto: " + nome );
        System.out.println("");
        System.out.println("Descrizione del piatto: " + descrizione );
        System.out.println("");
        System.out.println("Costo del piatto: " + costo );
        System.out.println("");
        System.out.println("Disponibilita del piatto: " + disponibile );
        System.out.println("");
        System.out.println("Tipologia del piatto: " + tipologia );
        System.out.println("");
        System.out.println("Allergeni presenti: " + allergeni );
        System.out.println("");
        System.out.println("Calorie presente: " + calorie + " calorie" );
        System.out.println("");
        System.out.println("Variazioni presenti: " + variazioni );
        System.out.println("");
        System.out.println("Foto del piatto: " + foto );
        System.out.println("");


        sc.close();
    }
}
