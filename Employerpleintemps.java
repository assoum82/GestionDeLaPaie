/**
 * Created by moha on 28/10/16.
 */


public class Employerpleintemps extends Employe {
    private double salairesemaine;
    private double prime;


    public Employerpleintemps(String nom, String fonction,double salairesemaine,double prime) {
        super(nom, fonction);
        this.prime=prime;
        this.salairesemaine=salairesemaine;
        setSalaire(salairesemaine*4+prime);
    }



}