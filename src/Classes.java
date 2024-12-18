import java.util.ArrayList;
public class Classes {
    private String className;
    Formateurs formateurs;
    ArrayList<Apprenant> apprenants;
    public Classes(String className, Formateurs formateurs, ArrayList<Apprenant> apprenants){
        this.className = className;
        this.formateurs = formateurs;
        this.apprenants = apprenants;
    }
    public String getclassName(){
        return className;
    }
    public void setclassName(String className){
        this.className = className;
    }
    public Formateurs getformateurs(){
        return formateurs;
    }
    public void setformateurs(Formateurs formateurs){
        this.formateurs = formateurs;
    }
    public ArrayList<Apprenant> getapprenants(){
        return apprenants;
    }
    public void setapprenants(ArrayList<Apprenant> apprenants){
        this.apprenants = apprenants;
    }

}
