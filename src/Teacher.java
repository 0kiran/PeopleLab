public class Teacher extends Person{
    private String subject, title;

    public Teacher(String subject, String title){
        super("","");
        this.subject = subject;
        this.title = title;
    }

    public String getSubject(){
        return subject;
    }

    public String toString(){
        return title + ". " + getFamilyName();
    }
}
