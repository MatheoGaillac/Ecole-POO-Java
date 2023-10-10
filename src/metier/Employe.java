package metier;

public class Employe extends Personne {
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Employe (int id, String prenom, String nom, double salaire){
        super (id, prenom, nom);
        setSalaire(salaire);
    }
}
