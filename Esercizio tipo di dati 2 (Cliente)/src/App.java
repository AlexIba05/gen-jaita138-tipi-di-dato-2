import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);

        System.out.println("Salve cliente qui dovrà inserire i dati richiesti, poi vedrà un resoconto finale di tutto quanto");
        System.out.println("");

        System.out.println("Nome del cliente: ");
        String nome= sc.nextLine();

        System.out.println("Cognome del cliente: ");
        String cognome= sc.nextLine();

        System.out.println("Data di nascita del cliente: (dd/MM/yyyy) ");
        String DataNascitaSTR = sc.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate DataNascita= LocalDate.parse(DataNascitaSTR, formatter);

        System.out.println("Numero di telefono del cliente: ");
        String NumeroTelefono= sc.nextLine();

        System.out.println("Aggiunga qui delle note aggiuntive: ");
        String note= sc.nextLine();

        System.out.println("E-mail del cliente: ");
        String mail= sc.nextLine();

        System.out.println("Scelga un username: ");
        String username= sc.nextLine();

        System.out.println("Crei una password: ");
        String password= sc.nextLine();

        System.out.println("Data e ora di iscrizione: [dd/MM/yyyy HH:mm]");
        String dataTimeIscrizioneStr = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataTimeIscrizione = LocalDateTime.parse(dataTimeIscrizioneStr, dateTimeFormatter);

        // ---------------------------------------------------------

        System.out.println("");
        System.out.println("");
        System.out.println("Resoconto dell'account: ");
        System.out.println("");
        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("");
        System.out.println("Cognome: " + cognome);
        System.out.println("");
        System.out.println("Data di nascita: " + DataNascita);
        System.out.println("");
        System.out.println("Numero di telefono: " + NumeroTelefono);
        System.out.println("");
        System.out.println("Note aggiuntive: " + note);
        System.out.println("");
        System.out.println("E-mail: " + mail);
        System.out.println("");
        System.out.println("Username: " + username);
        System.out.println("");
        System.out.println("Password: " + password);
        System.out.println("");
        System.out.println("Data di iscrizione: " + dataTimeIscrizione);
        System.out.println("");

        sc.close();

        




    }
}
