package projetkabirroutizi;


import java.util.Date;

interface EmployeArisque 
{

    public static final int PRIME = 25000;
}



public class ManutentionnaireArisque extends Manutentionnaire implements EmployeArisque 
{
    public ManutentionnaireArisque(String matricule, String nom, String prenom, int age, Date dateEntreeService, int tempsPasse) 
    {
        super(matricule, nom, prenom, age, dateEntreeService, tempsPasse);
    }
 
    @Override
    public double calculerSalaire() 
    {
        return super.calculerSalaire() + PRIME;
    }

}
 