public class Student extends Person {
    private double GPA;
    private double[] transcript;
    private String seniorQuote;

    public Student(String firstName, String familyName, double[] transcript, String seniorQuote){
        super(firstName, familyName);
        this.transcript = transcript;
        this.GPA = setGPA(this.transcript);
        this.seniorQuote = seniorQuote;
    }

    public double setGPA(double[] transcript){
        this.GPA = 0;
        for (double grade : transcript){
            this.GPA += grade;
        }
        this.GPA = this.GPA / transcript.length;
        return this.GPA;
    }

    public double getGPA(){
        return this.GPA;
    }

    public void setSeniorQuote(String seniorQuote){
        this.seniorQuote = seniorQuote;
    }

    public String getSeniorQuote(){
        return this.seniorQuote;
    }

    public void setTranscript(double[] transcript){
        this.transcript = transcript;
    }

    public double[] getTranscript(){
        return this.transcript;
    }

    public String toString(){
        return this.getFirstName() + ", " + this.getFamilyName();
    }

}
