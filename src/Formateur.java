public class Formateur extends Personne {
  double salaire;
   String specialite;
    public Formateur(int id, String nom, String prenom, String email, Classe classe){
        super (id, nom, prenom, email);
        this.salaire = salaire;
        this.specialite = specialite;
    }
    public String getSpecialite(){
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite=specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
            this.salaire = salaire;
    }
}
