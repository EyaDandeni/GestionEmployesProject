import Entities.Employe;

import java.util.Comparator;

public class EmployeNomDepartGradeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        // comparer par nomDepartement
        int departementCompare = o1.getNomDepartement().compareTo(o2.getNomDepartement());
        if (departementCompare != 0) {
            return departementCompare;
        }

        // Si les noms et départements sont égaux, comparer par grade
        return o1.getGrade() - o2.getGrade();
    }
}
