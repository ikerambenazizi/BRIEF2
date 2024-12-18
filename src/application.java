import java.util.ArrayList;
import java.util.Scanner;

public class application {
    static void Menu(){
        System.out.println("******MENU******");
        System.out.println("1-pour Remplir");
        System.out.println("2-pour afficher");
        System.out.println("Saisissez votre choix: ");
    }
    public static  void main(String[] args) {

            int choix = 0;
            Scanner cs =new Scanner(System.in);
            do{
               Menu();

                choix = cs.nextInt();
                cs.nextLine();
                switch(choix){
                    case 1:
                        System.out.println("Saisissez le nom : ");
                        String nom = cs.nextLine();
                        System.out.println("Saisissez le prenom : ");
                        String prenom = cs.nextLine();
                        System.out.println("Saisissez l'e-mail (exemple@gmail.com) : ");
                        String email = cs.nextLine();
                        System.out.println("Saisissez l'ID (des nombres entiers) : ");
                        int id = cs.nextInt();
                }
            }while( choix != 2);

        }
    }