import java.util.ArrayList;

public class Apprenant extends Personne {
Classes classe;
private ArrayList<Double> notes ;

    public Apprenant(int id, String nom, String prenom, String email, Classes classe) {
        super(id, nom, prenom, email);
        this.classe = classe;
        this.notes= new ArrayList<>();
    }

    public Classes getClasse() {
        return classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }
    public ArrayList<Double> getNotes(){
        return notes;
    }
    public void setNotes(double note){
        notes.add(note);

    }
}
