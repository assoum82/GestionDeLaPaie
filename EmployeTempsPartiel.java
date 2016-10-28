/**
 * Created by moha on 28/10/16.
 */
public class EmployeTempsPartiel extends Employe {
    private double salaireheure;
    private double heure;

    public EmployeTempsPartiel(String nom,String fonction,double salaireheure,double heure){
        super(nom,fonction);
        this.salaireheure=salaireheure;
        this.heure=heure;
        setSalaire(salaireheure*heure);
    }

}
