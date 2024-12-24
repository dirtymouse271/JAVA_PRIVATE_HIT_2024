public class Person {
    protected String id;
    protected Adress adress;
    protected String name;
    protected String age;

    public Person() {
    }

    public Person(String id, Adress adress, String name, String age) {
        this.id = id;
        this.adress = adress;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", adress=" + adress +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
