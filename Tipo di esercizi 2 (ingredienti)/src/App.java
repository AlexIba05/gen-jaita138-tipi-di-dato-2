import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);

        System.out.println("Qui descriverai il tuo ingrediente");


        System.out.println("Indica il nome dell'ingrediente");
        String ingrediente= sc.nextLine();

        System.out.println("Descrivimelo");
        String descrizione= sc.nextLine();

        System.out.println("Che tipo di ingrediente è? 1) Ingrediente per il salato, 2) Ingrediente per il dolce, 3) Ingrediente per entrambi i casi");
        Byte tipologia= sc.nextByte();
        sc.nextLine();

        System.out.println("L'ingrediente è disponibile?");
        boolean disponibilita= sc.nextBoolean();
        sc.nextLine();

        System.out.println("Quanto costa l'ingrediente?");
        Double costo= sc.nextDouble();
        sc.nextLine();

        System.out.println("Che tipo di allergeni sono presenti?");
        String allergeni= sc.nextLine();

        System.out.println("Come è conservato l'ingrediente?");
        String modConservazione= sc.nextLine();

        System.out.println("Mostrami una foto dell'ingrediente");
        String foto= sc.nextLine();

        // ------------------------------

        System.out.println("------------------------------------------------------------");


        System.out.println("");
        System.out.println("Nome: " + ingrediente );
        System.out.println("");
        System.out.println("Descrizione: " + descrizione );
        System.out.println("");
        System.out.println("Tipologia: " + tipologia );
        System.out.println("");
        System.out.println("Disponibilità: " + disponibilita );
        System.out.println("");
        System.out.println("Costo: " + costo + "Euro" );
        System.out.println("");
        System.out.println("Allergerni: " + allergeni );
        System.out.println("");
        System.out.println("Modalità di conservazione: " + modConservazione );
        System.out.println("");
        System.out.println("Immagine: " + foto );


        sc.close();


    }
}
