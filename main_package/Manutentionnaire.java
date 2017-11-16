package projetkabirroutizi;


import java.util.Date;

public class Manutentionnaire extends Employe 
{

    private final static double TAUX_HORAIRE = 65.0;
    private int tempsPasse;

 
    public Manutentionnaire(String matricule, String nom, String prenom, int age, Date dateEntreeService, int tempsPasse) 
    {
        super(matricule, nom, prenom, age, dateEntreeService);
        this.tempsPasse = tempsPasse;
    }
 
    @Override
    public double calculerSalaire() 
    {
        return TAUX_HORAIRE * tempsPasse;
    }
 
    @Override
    public String getNom()
        {
            return ("Le Manutentionnaire "+nom+ "" +prenom );

        }
}
 