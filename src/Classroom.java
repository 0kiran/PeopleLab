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

    public double classAverage(){
        double sum = 0;
        for (Student s : students){
            sum += s.getGPA();
        }
        return sum/ students.length;
    }

    public void printClass(){
        System.out.println(teacher.toString());
        System.out.println(teacher.getSubject());
        for (Student s : students){
            System.out.println(s.toString());
        }
    }

}
