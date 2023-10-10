package metier;

import metier.Personne;
public class Etudiant extends Personne {
    private String cne;

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Etudiant(int id, String nom, String prenom, String cne){
        super(id, nom, prenom);
        setCne(cne);
    }
}
