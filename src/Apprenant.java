import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {
    private Classe classe;
    private ArrayList<Double> notes;
    private Scanner scanner = new Scanner(System.in);

    public Apprenant(int id, String nom, String prenom, String email, Classe classe, ArrayList<Double> notes) {
        super(id, nom, prenom, email);
        this.classe = classe;
        this.notes = notes;
    }
    public Apprenant() {
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public ArrayList<Double> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }
    @Override
    public String toString() {
        return super.toString() + ", Classe: " + (classe != null ? classe.getNom() : "Aucune") + ", Notes: " + notes;
    }
    public void gestionApprenants(ArrayList<Apprenant> apprenants, ArrayList<Classe> classes) {
        System.out.println("\n--- Gestion des Apprenants ---");
        System.out.println("1. Ajouter un apprenant");
        System.out.println("2. Modifier un apprenant");
        System.out.println("3. Supprimer un apprenant");
        System.out.println("4. Afficher les apprenants");
        System.out.print("Choix: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterApprenant(apprenants, classes);
                break;
            case 2:
                modifierApprenant(apprenants, classes);
                break;
            case 3:
                supprimerApprenant(apprenants);
                break;
            case 4:
                afficherApprenants(apprenants);
                break;
            default:
                System.out.println("Choix invalide !");
        }
    }

    public void ajouterApprenant(ArrayList<Apprenant> apprenants, ArrayList<Classe> classes) {
        int id = apprenants.size() + 1;
        System.out.print("Nom d'apprenant: ");
        String nom = scanner.nextLine();
        System.out.print("Prénom d'apprenant: ");
        String prenom = scanner.nextLine();
        System.out.print("Email d'apprenant: ");
        String email = scanner.nextLine();
        System.out.print("Entrez le nom de la classe: ");
        String classenom = scanner.nextLine();


        Classe classe = rechercherClasseParNom(classenom, classes);
        if (classe == null) {
            System.out.println("Classe introuvable !");
            return;
        }


        ArrayList<Double> notes = new ArrayList<>();
        System.out.println("Entrez les notes (séparées par des espaces) : ");
        String[] notesInput = scanner.nextLine().split(" ");
        try {
            for (String note : notesInput) {
                notes.add(Double.parseDouble(note));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur : Veuillez entrer des notes valides.");
            return;
        }

        apprenants.add(new Apprenant(id, nom, prenom, email, classe, notes));
        System.out.println("Apprenant ajouté !");
    }

    public void modifierApprenant(ArrayList<Apprenant> apprenants, ArrayList<Classe> classes) {
        System.out.print("ID de l'apprenant à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
                System.out.print("Nouveau Nom: ");
                apprenant.setNom(scanner.nextLine());
                System.out.print("Nouveau Prénom: ");
                apprenant.setPrenom(scanner.nextLine());
                System.out.print("Nouvel Email: ");
                apprenant.setEmail(scanner.nextLine());
                System.out.print("Nouvelle Classe: ");
                String classenom = scanner.nextLine();


                Classe classe = rechercherClasseParNom(classenom, classes);
                if (classe == null) {
                    System.out.println("Cette classe n'existe pas !");
                    return;
                }
                apprenant.setClasse(classe);
                System.out.println("Modification avec succès !");
                return;
            }
        }
        System.out.println("Cet apprenant n'existe pas !");
    }


    public void supprimerApprenant(ArrayList<Apprenant> apprenants) {
        System.out.print("ID supprimé: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        if (apprenants.removeIf(apprenant -> apprenant.getId() == id)) {
            System.out.println("Apprenant supprimé !");
        } else {
            System.out.println("Cet apprenant n'existe pas !");
        }
    }


    public void afficherApprenants(ArrayList<Apprenant> apprenants) {
        if (apprenants.isEmpty()) {
            System.out.println("Aucun apprenant trouvé.");
        } else {
            for (Apprenant apprenant : apprenants) {
                System.out.println(apprenant);
            }
        }
    }

    public Classe rechercherClasseParNom(String nom, ArrayList<Classe> classes) {
        for (Classe classe : classes) {
            if (classe.getNom().equalsIgnoreCase(nom)) {
                return classe;
            }
        }
        return null;
    }
}
