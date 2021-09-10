import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(11, "±è¹Î¾Æ", 20));
		list.add(new Student(12, "ÀÌ¹Î¾Æ", 22));
		list.add(new Student(13, "ÃÖ¹Î¾Æ", 23));
		list.add(new Student(14, "ÀÌÁö¾Æ", 26));
		list.add(new Student(15, "ÇÏ¹Î¿ì", 24));
		list.add(new Student(16, "ÀÌÁö¿ì", 27));
		list.add(new Student(17, "¹Ú¹Î¾Æ", 28));
		list.add(new Student(18, "±ÇÁö¾Æ", 21));
		list.add(new Student(19, "¾ÈÁöÀ¯", 20));
		list.add(new Student(10, "ÀÌÁöÀ¯", 19));
		
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
