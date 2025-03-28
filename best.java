public class Person {
    private String name;
    private int age;
    private boolean employed;

    // Constructor لتعيين القيم عند إنشاء الكائن
    public Person(String name, int age, boolean employed) {
        this.name = name;
        this.age = age;
        this.employed = employed;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isEmployed() { return employed; }
}

// اختبار الكلاس
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmed", 25, true);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Employed: " + person.isEmployed());
    }
}
