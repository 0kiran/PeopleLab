public class Teacher extends Person{
    
    //Ricky Zhao
    private String subject, title;

    public Teacher(String firstName, String familyName, String subject, String title){
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    public String getSubject(){
        return subject;
    }

    public String toString(){
        return title +"."+ getFamilyName();
    }
}
