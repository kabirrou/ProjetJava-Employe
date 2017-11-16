package projetkabirroutizi;


import java.util.Date;

public class Vendeur extends Commercial 
{

    private final static double TAUX_VENDEUR = 0.2;
    private final static int PRIME_VENDEUR = 100;

 
    public Vendeur(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff)
    {
        super(matricule, nom, prenom, age, dateEntreeService, chiffreAff);
    }

 
  
    @Override
    public double calculerSalaire() 
    {
        return (TAUX_VENDEUR * getchiffreAff()) + PRIME_VENDEUR;
    }
 
    public String getDesignation()
        {
            return "Le vendeur ";
        }

}