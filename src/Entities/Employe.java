package Entities;


import java.util.Comparator;

public class Employe implements Comparable<Employe>{
    int id;
    String nom;
    String prenom;
    String nomDepartement;
    int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Employe( int id,int grade,String nom,String prenom,String nomDepartement) {
        this.id=id;
        this.grade = grade;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
    }
    public Employe(){

    }



    @Override
    public boolean equals(Object obj) {
        boolean res=false;

        if (obj == null ) {
             res=false;
        }

        if(obj instanceof Employe)
        {
            Employe employe = (Employe) obj;
            if(this.getNom().equals(employe.getNom()) &&
                    this.getId()== employe.getId())
            {
                res=true;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }


    @Override
    public int compareTo(Employe employe) {
        return this.id - employe.id;
    }

}
