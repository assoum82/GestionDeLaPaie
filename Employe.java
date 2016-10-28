/**
 * Created by moha on 28/10/16.
 */
public class Employe {
    private String nom;
    private String fonction;
    private double salaire;

    public String getFonction() {
        return fonction;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void affichecheque(){
        System.out.println("Payer a l'ordre de "+nom+" ("+fonction+")***"+salaire+" DA");
    }
    public Employe(String nom,String fonction,double salaire){
        this.salaire=salaire;
        this.fonction=fonction;
        this.nom=nom;
    }
    public Employe(String nom,String fonction){
        this.fonction=fonction;
        this.nom=nom;
    }
}
