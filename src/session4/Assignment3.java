package session4;
class Employee{
	private String name;
	private int age;
	private int weight;
	private int Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
}
public class Assignment3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Aditya");
		emp1.setAge(25);
		emp1.setWeight(65);
		emp1.setId(10);
		System.out.println("Employee1 details : ");
		System.out.println("Name \t:"+emp1.getName());
		System.out.println("Age \t:"+emp1.getAge());
		System.out.println("Weight \t:"+emp1.getWeight() + "kg");
		System.out.println("ID \t:"+emp1.getId());
	}

}
