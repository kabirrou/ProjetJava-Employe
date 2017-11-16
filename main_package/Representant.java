package projetkabirroutizi;


import java.util.Date;

abstract class Commercial extends Employe 
{

    private double chiffreAff = 11000.0;
 
    public Commercial(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff)
    {
        //Acces aux attributs de la classe mere avec le mot cle super
        super(matricule, nom, prenom, age, dateEntreeService);
        
        //nouvel attribut specifique a la classe commerciale
        this.chiffreAff = chiffreAff;

    }
 
    public double getchiffreAff()
        {
            return chiffreAff;

        }
 
}
 
/*

                                                    
##              CLASSE VENDEUR                   ##
                                              

*/

 /*classe commercial*/
public class Representant extends Commercial 
{
    private final static double TAUX_REPRESENTANT = 0.2;
    private final static int PRIME_REPRESENTANT = 200;
 
    public Representant(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff) 
    {
        super(matricule, nom, prenom, age, dateEntreeService, chiffreAff);
    }
    // toujour le polymorphisme dynamique: redefinition de la methode 
    @Override
    public double calculerSalaire() 
    {
        return (TAUX_REPRESENTANT * getchiffreAff()) + PRIME_REPRESENTANT;
    }
 
    @Override
    public String getNom()
        {
            return ("Le représentant " + nom+ "" +prenom);
        }
}