/**
 * Created by moha on 28/10/16.
 */
public class Main {
    public static void main(String args[]){
        Employe employe[]=new Employe[3];
        employe[0] =new Employe("Salim","PDG",100000);
        employe[2] =new EmployeTempsPartiel("Abdelhalim","Agent de securite",150,100);
        employe[1] =new Employerpleintemps("Halima","secretaire",4500,2000);


        for (int i = 0; i <3 ; i++) {
            employe[i].affichecheque();
        }

    }
}
