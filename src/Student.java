public class Student extends Person {
    
    //Made by Ari Khaytser
    private double GPA;
    private String major;
    private String seniorQuote;
    
    //Constructor sets names using super class, and the other inputted fields. 
    public Student(String firstName, String familyName, double GPA, String major, String seniorQuote){
        super(firstName, familyName);
        this.GPA = GPA;
        this.major = major;
        this.seniorQuote = seniorQuote;
    }

    //returns GPA
    public double getGPA(){
        return this.GPA;
    }
    
    //Sets senior quote
    public void setSeniorQuote(String seniorQuote){
        this.seniorQuote = seniorQuote;
    }

    //return sen. quote
    public String getSeniorQuote(){
        return this.seniorQuote;
    }

    //sets major
    public void setMajor(String major){
        this.major = major;
    }
    
    //gets major
    public String getMajor(){
        return this.major;
    }
    
    //returns the first and last name, seperated by a space. 
    public String toString(){
        return this.getFirstName() +" "+ this.getFamilyName();
    }

}
