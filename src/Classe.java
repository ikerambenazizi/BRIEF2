import java.util.ArrayList;
import java.util.Scanner;




public class Classe {
    private String nom;
    Formateur formateur;




    Scanner sc = new Scanner(System.in);




    public Classe(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
    }
    public Classe(){




    }
    public Classe( String nom){
        this.nom = nom;




    }




    public String getNom() {
        return nom;
    }




    public void setNom(String nom) {
        this.nom = nom;
    }




    public Formateur getFormateur() {
        return formateur;
    }




    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }








    public void  GestionClasse(ArrayList<Classe> classe) {




        System.out.println("----Menu Classe----");
        System.out.println("1. Ajouter une classe");
        System.out.println("2. Modifier une classe");
        System.out.println("3. Supprimer une  classe");
        System.out.println("4. Afficher les classes");
        System.out.println("5.Quitter");
        System.out.println("Veuillez saisir votre choix : ");
        int choix = sc.nextInt();
        Classe c = new Classe();
        switch (choix) {
            case 1:




                c.AjouterClasse(classe);
                break;
            case 2 :
                c.ModifierClasse(classe);
                break;
            case 3 :
                c.SupprimerClasse(classe);
                break;
            case 4 : c.AfficherClasses(classe);
                break;












            default:
                System.out.println("Chois invalide !!");
        }
    }




    public void AjouterClasse(ArrayList<Classe> classe) {
        System.out.println("entrer nom du classe");
        String nomclasse = sc.nextLine();
        Classe c = new Classe(nomclasse,null);
        classe.add(c);
        System.out.println("classe ajouter avec succes ! ");




















    }
    //MOdifier
    private  void ModifierClasse(ArrayList<Classe> classes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom de la classe modifeir:  ");
        String nomclasse = sc.nextLine();
        sc.nextLine();








        Classe classe = new Classe();
        if (classe.getNom().equals(nomclasse)) {
            System.out.print("Nouveau Nom: ");
            classe.setNom(sc.nextLine());
            System.out.println("Classe modifiée !");
            return;




        }
        System.out.println("Classe introuvable !");
    }




    private  void SupprimerClasse(ArrayList<Classe> classes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom de la classe a supprimer:  ");
        String nomclasse = sc.nextLine();
        sc.nextLine();








//        classes.removeIf(classe -> classe.getNom().equals(nomclasse));
        Classe classe = new Classe() ;
        if(classe.getNom().equals(nomclasse)){
            classes.remove(classe);
        }
        System.out.println("Classe supprimée !");
    }








    public void AfficherClasses(ArrayList<Classe> classes) {
        for (Classe classe : classes) {
            System.out.println(classe.getNom());
        }
    }
    public Classe rechercheClasse(String nom,ArrayList<Classe> classes) {
        for (Classe c : classes ) {
            if (c.getNom().equals(nom)) return c;




        }
        return null;
    }








}
