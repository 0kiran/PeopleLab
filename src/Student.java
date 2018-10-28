public class Student extends Person {
    private double GPA;
    private String major;
    private String seniorQuote;

    public Student(String firstName, String familyName, double GPA, String major, String seniorQuote){
        super(firstName, familyName);
        this.GPA = GPA;
        this.major = major;
        this.seniorQuote = seniorQuote;
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

    public void setMajor(String major){
        this.major = major;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public String toString(){
        return this.getFirstName() + ", " + this.getFamilyName();
    }

}
