public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom (Student[] students, Teacher teacher){
        this.teacher = teacher;
        this.students = students;
    }

    public String getSubject(){
        return teacher.getSubject();
    }


}
