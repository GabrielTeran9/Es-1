import java.util.ArrayList;
import java.util.Scanner;

public class BuoniPropositi {
public static void main(String[] args) throws Exception {
    ArrayList<String> propositi = new ArrayList<>();
    propositi.add("fare più attività fisica");
    propositi.add("esercitarsi su Java");
    propositi.add("mangiare più sano");
    propositi.add("fare piu economia");
    propositi.add("imparare a suonare il piano");
    gestisciPropositi(propositi);
    } 
    public static void gestisciPropositi(ArrayList<String> propositi) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> nonConseguiti = new ArrayList<>(propositi);
        
    while (!nonConseguiti.isEmpty()) {
    System.out.println("\nI tuoi buoni propositi non ancora conseguiti:");
            
    for (int i = 0; i < nonConseguiti.size(); i++) {
        System.out.println((i + 1) + ". " + nonConseguiti.get(i));
    }
    System.out.print("\nInserisci il numero del proposito che hai conseguito (0 per terminare): ");
    int scelta = scanner.nextInt();
    if (scelta == 0) {break;
    }
    if (scelta >= 1 && scelta <= nonConseguiti.size()) {
    String conseguito = nonConseguiti.remove(scelta - 1);  // Rimuovi il proposito conseguito dalla lista
    System.out.println("\nBravo! Hai conseguito: '" + conseguito + "'");
    } else {
    System.out.println("Scelta non valida. Riprova.");
    }
    }
    System.out.println("\nCongratulazioni! Hai conseguito tutti i tuoi buoni propositi!");
        
scanner.close();
    }
}
