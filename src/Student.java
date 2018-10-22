public class Student extends Person {
    private double GPA;
    private double[] transcript;
    private int absenceCount;

    public Student(String firstName, String familyName, double[] transcript, int absenceCount){
        super(firstName, familyName);
        this.transcript = transcript;
    }
}
