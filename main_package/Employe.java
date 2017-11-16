package projetkabirroutizi;

import java.util.Date;
abstract class Employe 
{

    private String matricule;
    String nom;
    String prenom;
    private int age;
    private Date dateEntreeService = new Date();
 
    public Employe(String matricule, String nom, String prenom, int age, Date dateEntreeService) 
    {

        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntreeService = dateEntreeService;

    }
    public abstract double calculerSalaire();
  
    public String getNom() 
    {
        return ( "l'employe "+ nom + " " + prenom);
    }
}
