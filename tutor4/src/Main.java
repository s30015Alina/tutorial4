public class Main {
    public static void main(String[] args) {
Student std1 = new Student("fname", "lname", 1, "email", "address", new double[]{2, 2.5, 3, 3.5, 4, 4.5, 5});
        System.out.println(std1.AverageGrade());
        StudentGroup group1 = new StudentGroup();
        group1.myAdd(std1);
    }
}