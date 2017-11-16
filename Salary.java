import java.util.Date;
import main_package.Personnel;
import main_package.Representant;
import main_package.Technicien;
import main_package.ManutentionnaireArisque;
import main_package.Manutentionnaire;

class Salary 
{
    private static Date dateEntreeService = new Date();
    
    public static void main(String[] args) 
    { 
        Personnel Personne = new Personnel();

        Personne.ajouterEmploye(new Representant(   "10A95FS", "IGOR", "KONASHENKOV", 25, dateEntreeService, 11000));

        Personne.ajouterEmploye(new Technicien("16B432FS", "DMITRI", "GREDENKO", 28, dateEntreeService, 11000));

        Personne.ajouterEmploye(new Manutentionnaire(   "16B432FS", "BEIDI", "WASSOUO EMMANUEL", 19, dateEntreeService, 11000));


        Personne.ajouterEmploye(new ManutentionnaireArisque(    "16B093", "TCHAFROS", "DE GENEVE", 39, dateEntreeService, 11000));
 
        Personne.afficherSalaires();
        
        System.out.println("Le salaire moyen dans l'entreprise vaut "+ Personne.salaireMoyen() + " FCFA.");
 
    }
}