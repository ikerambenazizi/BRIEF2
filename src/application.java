import java.util.ArrayList;
import java.util.Scanner;




public class application {


    public static void main(String[] args) {
        ArrayList<Apprenant> apprenants = new ArrayList<>();
        ArrayList<Classe> classes = new ArrayList<>();
        Apprenant apprenant = new Apprenant();
        Classe classe = new Classe();
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1-Gestion Apprenants");
            System.out.println("2-Gestion Formateurs");
            System.out.println("3-Gestion Classes");
            System.out.println("4-Quitter");
            Scanner scanner = new Scanner(System.in);


            System.out.println("Entrer votre choix :");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    apprenant.gestionApprenants(apprenants, classes);
                    break;
                case 2:
                    break;


                case 3:
                    classe.GestionClasse(classes);
                    break;
                case 4:
                    System.out.println("Au revoir ^-^ :");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (choix != 4);
    }
}