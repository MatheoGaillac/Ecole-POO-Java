package metier;

public class Professeur extends Employe {
    private String specialite;

    public String getSpecialite(){
        return specialite;
    }

    public void setSpecialite(String specialite){
        this.specialite = specialite;
    }

    public Professeur(int id, String prenom, String nom, double salaire, String specialite){
        super(id, prenom, nom, salaire);
        setSpecialite(specialite);
    }
}
