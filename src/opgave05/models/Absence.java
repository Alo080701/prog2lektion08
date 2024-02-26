package opgave05.models;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        int tæller = 0;
        System.out.print("Elev/Måned  ");
        for (int i = 0; i < absenceSchema[0].length; i++) {
            System.out.print(i + 1 + "  ");
        }
        System.out.println(" ");
        for (int i = 0; i < absenceSchema.length; i++) {
            System.out.print("        " + (i + 1) + " : ");
            tæller = 0;
            while (tæller < absenceSchema[0].length) {
                System.out.print(absenceSchema[i][tæller] + "  ");
                tæller++;
            }
            System.out.println("");
        }

    }

    public int totalAbsence(int studentNumber) {
        int sum = 0;
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            if (absenceSchema[studentNumber - 1][i] > 0) {
                sum += absenceSchema[studentNumber - 1][i];
            }
        }
        return sum;
    }

    public double average(int studentNumber) {
        double sum = 0;
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            if (absenceSchema[studentNumber - 1][i] > 0) {
                sum += absenceSchema[studentNumber - 1][i];
            }
        }
        return sum / 12;
    }

    public int StudentsWithoutAbsence() {
        int antal = 0;
        int count = 0;
        for (int i = 0; i < absenceSchema.length; i++) {
            for (int j = 0; j < absenceSchema[i].length; j++) {
                if (absenceSchema[i][j] == 0) {
                    antal++;
                    if (antal == 12) {
                        count++;
                    }
                }else {
                    antal = 0;
                }

            }
        }
        return count;
    }

    public int mostAbsence() {
        int flest = 0;
        int elev = 0;
        for (int i = 0; i < absenceSchema.length; i++) {
            if (totalAbsence(i+1) > flest);{
                flest = totalAbsence(i+1);
                elev = i;
            }
        }
        return elev;
    }

    public void reset(int studentNumber) {
        int count = 0;
        while (count < absenceSchema[studentNumber-1].length){
            absenceSchema[studentNumber-1][count] = 0;
            count++;
        }
    }
}
