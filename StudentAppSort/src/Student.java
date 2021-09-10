
public class Student implements Comparable<Student>{
	private int no;
	private String name;
	private int age;
	
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name +", age=" + age +"]";
	}
	
	
}
