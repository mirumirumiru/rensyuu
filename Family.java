
public class Family {
    String name;
    Person person;

    public Family(String name, Person person) {
		this.name = name;
		this.person = person;
	}


    void displayPrint() {
        System.out.println("苗字：name=" +  name);
        person.displayPrint();
    }

    public static void main(String[] args) {
        Person person = new Person("太郎", 50);
        Family tanaka = new Family("田中",person);
        tanaka.displayPrint();
        person.age = person.age+30;
        System.out.println("30年後は"+ person.age + "ですね");
    }
}
