public class Student extends Person{
    private String classname;
    private String schoolname;

    public Student(){
    }

    public Student(String id, Adress adress, String name, String age, String classname, String schoolname) {
        super(id, adress, name, age);
        this.classname = classname;
        this.schoolname = schoolname;
    }
}
