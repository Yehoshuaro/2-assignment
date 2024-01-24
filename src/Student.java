public class Student extends Person {

    private double gpa;
    private static final double STIPEND = 36660.00;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? STIPEND : 0.0;
    }
}
