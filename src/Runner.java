public class Runner {

    public static String[] firstNames = {"Liam","Mary","Timothy","Sterling","Sergei","Stanley","Sera","Tera","Terrence",
    "Terrance", "Ronald","Alfred","Arnold","Anna","Benedict","Ber","Burt","Car","Chester","David","Donald","Denver",
    "Des","Eggbert","Eisen","Issen","Ista","Isabelle","Garfield","Gert","Geralt","George","Harold","Harry","Hairy",
    "Karen","Kurt","Kim","Ronald","Tom"};
    public static String[] familyNames = {"Cumberbatch","Poon","Koon","McDonald","Alsace","Friede","Turner","Chen",
    "Makovsky","Hassan","Kyung","Ree","Wry","Werner","Worsace","Bezar","Behoof","Calendar","Table","Spoon","Fork","Knives",
    "Chopsticks","Noot","Poot","Root","Soot","Kriechovsky","Narmek","Chan","Stingray","MantaRay","Femto","Shake","And",
    "Stir","Eat","Greet","Meet","Sleep"};
    
    public static String[] majors = {"Math", "Physics", "BioSci", "Pharm", "SSR", "Software", "College Prep", "Civil", "Electrical Engineering", "Aerospace", "Mechatronics", "Media", "LAS", "Finance"};

    public static void main(String[] args){
        Teacher classTeacher = new Teacher(randomFirstName(), randomFamilyName(),"Computer Science","Mr.");                                      
    }
    
    public static Student randomStudent() {
        Student newStudent = new Student(randomFirstName(), randomLastName(), randomMajor, 0)
    }
                                           
    public static String randomFirstName(){
        return firstNames[(int)(Math.random()*firstNames.length)];
    }
                                           
    public static String randomFamilyName(){
        return familyNames[(int)(Math.random()*familyNames.length)];
    }
                                           
    public static String randomMajor(){
       return majors[(int)(Math.random()*majors.length)];
    }

}
