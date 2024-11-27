import Entities.Employe;
import Interfaces.IGestion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    List<Employe>employes=new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
    this.employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (employes.remove(employe)) {
            System.out.println("Employé supprimé : " + employe);
        } else {
            System.out.println("Employé non trouvé ");
        }
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe.toString());
        }
    }


    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new EmployeNomDepartGradeComparator());

        for (Employe employe : employes) {
            System.out.println(employe);
        }

    }

}
