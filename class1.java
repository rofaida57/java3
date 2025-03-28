public class Person {
    private String name;
    private int age;
    private boolean employed;

    // Getter لاسترجاع الاسم
    public String getName() {
        return name;
    }

    // Setter لتعيين الاسم
    public void setName(String name) {
        this.name = name;
    }

    // Getter لاسترجاع العمر
    public int getAge() {
        return age;
    }

    // Setter لتعيين العمر
    public void setAge(int age) {
        if (age > 0) { // التحقق من أن العمر موجب
            this.age = age;
        } else {
            System.out.println("العمر غير صالح!");
        }
    }

    // Getter لاسترجاع حالة التوظيف
    public boolean isEmployed() {
        return employed;
    }

    // Setter لتعيين حالة التوظيف
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }
}
