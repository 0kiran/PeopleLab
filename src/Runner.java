public class Runner {
    
    //Ricky Zhao
    //List of strings for first names, last names, and senior quotes and majors.
    public static String[] firstNames = {"Liam","Mary","Timothy","Sterling","Sergei","Stanley","Sera","Tera","Terrence",
    "Terrance", "Ronald","Alfred","Arnold","Anna","Benedict","Ber","Burt","Car","Chester","David","Donald","Denver",
    "Des","Eggbert","Eisen","Issen","Ista","Isabelle","Garfield","Gert","Geralt","George","Harold","Harry","Hairy",
    "Karen","Kurt","Kim","Ronald","Tom"};
    public static String[] familyNames = {"Cumberbatch","Poon","Koon","McDonald","Alsace","Friede","Turner","Chen",
    "Makovsky","Hassan","Kyung","Ree","Wry","Werner","Worsace","Bezar","Behoof","Calendar","Table","Spoon","Fork","Knives",
    "Chopsticks","Noot","Poot","Root","Soot","Kriechovsky","Narmek","Chan","Stingray","MantaRay","Femto","Shake","And",
    "Stir","Eat","Greet","Meet","Sleep"};
    
    public static String[] majors = {"Math", "Physics", "BioSci", "Pharm", "SSR", "Software", "College Prep", "Civil", "Electrical Engineering", "Aerospace", "Mechatronics", "Media", "LAS", "Finance"};
    
    public static String[] quotes = {"Winning isn't everything, it's just the only thing that matters", "I have Ligma", "I need to be successful because I like expensive things", "We're going to do everything as seniors to keep this going"};
    
    public static void main(String[] args){
        //creates teacher using random names
        Teacher classTeacher = new Teacher(randomFirstName(), randomFamilyName(),"Computer Science","Mr");
        //creates student list using random names, majors, quotes, and GPAs
        Student[] students = new Student[32];
        for(int i = 0; i < students.length; i++){
            students[i] = randomStudent();
        }
        Classroom classroom = new Classroom(students, classTeacher);
        classroom.printClass();
        System.out.println("The teacher is "+classTeacher+". Their subject is "+classTeacher.getSubject()+".");
        System.out.println("The class's average GPA is" + classroom.classAverage());
    }
    
    //returns random student
    public static Student randomStudent() {
        Student newStudent = new Student(randomFirstName(), randomFamilyName(), Math.random()*2 + 2, randomMajor(), randomQuote());
        return newStudent;
    }
    
    //returns random first name
    public static String randomFirstName(){
        return firstNames[(int)(Math.random()*firstNames.length)];
    }
                               
    //returns random last name
    public static String randomFamilyName(){
        return familyNames[(int)(Math.random()*familyNames.length)];
    }
                              
    //returns random major
    public static String randomMajor(){
       return majors[(int)(Math.random()*majors.length)];
    }
    
    //returns random senior quote
    public static String randomQuote() {
        return quotes[(int)(Math.random()*quotes.length)];
    }
}
