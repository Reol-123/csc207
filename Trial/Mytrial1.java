public class Mytrial1 implements Mytrial2, Comparable<Mytrial1> {
    private Integer age = 0;
    private String name = "Anonymous";
    
    public Mytrial1(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getAgeDefult() {
        return 0;
    }

    public static String getNameDefult() {
        return "Anonymous";
    }
    public Object[] getInfo() {
        return new Object[]{age, name};
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    @Override
    public int compareTo(Mytrial1 other) {
        if (this.age < other.age) {
            return other.age;
        } else {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Mytrial1 person = new Mytrial1(18, "Reol");
        Mytrial1 person2 = new Mytrial1(20, "John");
        System.out.println("Person 1 Info: ");
        person.display();
        System.out.println("Person 2 Info: ");
        person2.display();
        System.out.println("Comparison Result: " + person.compareTo(person2));
    }
}