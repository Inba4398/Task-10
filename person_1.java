package Task10;

public class person_1 {
	//created a class called person
	private String name;
	private int age;
	//constructor initialized the attributes and values will get passed
	public person_1(String name, int age) {
		//this keyword is used to mention variable is instance variable not local variable
		this.name =name;
		this.age=age;
	}
	
	public String getName() {
		//used getter methods to access the attributes
		return name;
	}
	
	public int getAge() {
		return age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		person_1 person1 = new person_1("Inba",25);
		//getter method to print the values
		System.out.println(person1.getName() + "--"+ person1.getAge()+ " Years.");
}
}
