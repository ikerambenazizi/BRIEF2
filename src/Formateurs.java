public class Formateurs extends Personne {
  double salaire;
   String specialite;
    public Formateurs(int id, String nom, String prenom, String email, Classes classe){
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
