
public class Main {

	public static void main(String[] args) {
		Family tanaka = new Family("田中", "太郎", 50);
	        tanaka.displayPrint();
	        tanaka.addingAge(30); // 30年
	        int personAge = tanaka.getAge();
	        // System.out.println("30年後は"+ tanaka.person.age + "ですね");
	        System.out.println("30年後は"+ personAge + "ですね");
	}

}
