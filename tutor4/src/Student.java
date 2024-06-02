public class Student {
    public static int GlobalIndex = 0;
    public String fname;
    public String lname;
    public int IndexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String fname, String lname, int IndexNumber, String email, String address, double[] grades) {
        GlobalIndex++;
        IndexNumber = GlobalIndex;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.grades = grades;

        if (grades.length == 0 || grades.length > 20) {
            throw new RuntimeException("Illegal argument exception");
        }
    }

    public double AverageGrade() {
        double f = 0;
        for (int i = 0; i < grades.length; i++) {
            f = f + grades[i];
        }
        f = f / grades.length;
        double fr = f % 1;
        f -= fr;
        if (fr < 0.5) {
            f = f + 0;
        } else {
            f = f + 0.5;
        }
        return f;
    }
}


