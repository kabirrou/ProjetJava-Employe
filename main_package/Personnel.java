package projetkabirroutizi;

public class Personnel 
{
    private Employe[] personnel;

    private int nbreEmploye;
    private final static int NBR_MAX_EMPLOYE = 520;
    
    public Personnel() 
    {
        personnel = new Employe[NBR_MAX_EMPLOYE];
        nbreEmploye = 0;
    }
 
    public void ajouterEmploye(Employe employe) 
    {

        nbreEmploye++;
        if (nbreEmploye <= NBR_MAX_EMPLOYE) 
        {
            personnel[nbreEmploye - 1] = employe;
        } else 
        {

            System.out.println(-1);
        }
    }
 
    public double salaireMoyen() {

        double som = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {

            som += personnel[i].calculerSalaire();
        }

        return som / nbreEmploye;
    }
 
    public void afficherSalaires() 
    {

        for (int i = 0; i < nbreEmploye; i++) 
        {
            System.out.println( personnel[i].getNom() + " gagne "+ personnel[i].calculerSalaire() + " FCFA.");

        }
    }
}