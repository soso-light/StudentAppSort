import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(11, "��ξ�", 20));
		list.add(new Student(12, "�̹ξ�", 22));
		list.add(new Student(13, "�ֹξ�", 23));
		list.add(new Student(14, "������", 26));
		list.add(new Student(15, "�Ϲο�", 24));
		list.add(new Student(16, "������", 27));
		list.add(new Student(17, "�ڹξ�", 28));
		list.add(new Student(18, "������", 21));
		list.add(new Student(19, "������", 20));
		list.add(new Student(10, "������", 19));
		
		System.out.println("Student list (ordered by name)");
		Collections.sort(list);
		for(Student s: list) {
			System.out.println(s.toString());
		}
		System.out.println("Student list (reverse ordered by name)");
		Collections.sort(list, Collections.reverseOrder());
		for(Student s: list) {
			System.out.println(s.toString());
		}

	}

}
