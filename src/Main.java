import Entities.Employe;

public class Main {
    public static void main(String[] args) {

        /*  --- Prosit 9 --- */
        Employe e1=new Employe(1,1,"Dandeni","eya","Informatique");
        Employe e2=new Employe(2,2,"Smith","John","Finance");
        Employe e3 = new Employe(3,3, "Salhi", "Alice", "RH");

        SocieteArrayList societe=new SocieteArrayList();
       societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employes \n "+societe.employes+"\n");

        System.out.println("Recherche de Eya par nom -> " + societe.rechercherEmploye("Dandeni"));
        System.out.println("Recherche d'employé e1 -> "+societe.rechercherEmploye(e1)+"\n");

        //societe.supprimerEmploye(e2);
        System.out.println(" \n --- Affichage liste avec méthode displayEmploye() --- ");
        societe.displayEmploye();

        System.out.println("\n --- Liste triée par ID ---  ");
        societe.trierEmployeParId();


        System.out.println("\n --- Liste triée par nom département, et grade ---  ");
        societe.trierEmployeParNomDépartementEtGrade();
        /* -- */

    }
}