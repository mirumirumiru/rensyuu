
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPrint() {
        System.out.println("家族：name=" + name + ", age=" + age);
    }
    
    public void addingAge(int n) {
        this.age += n;
    }

    public static void main(String[] args) {
        Person perosen1 = new Person("太郎", 20);
        perosen1.displayPrint();
    }
}
