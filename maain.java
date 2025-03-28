public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // تعيين القيم باستخدام Setter
        person.setName("Ahmed");
        person.setAge(25);
        person.setEmployed(true);

        // طباعة القيم باستخدام Getter
        System.out.println("Name: " + person.getName());  // Ahmed
        System.out.println("Age: " + person.getAge());    // 25
        System.out.println("Employed: " + person.isEmployed()); // true
    }
}
