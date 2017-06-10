
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Create student");
			Student s1 = new Student("Mudit", 4, "Mudi", 1200.00);
			Student s2 = new Student("Kishore", 3, "Kishu", 1300.00);
			Student s3 = new Student("Jaya", 2, "Jaya", 1200.00);
			Student s4 = new Student("Vidyut", 1, "Vidu", 1300.00);
			
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			System.out.println("How data is stored");
			for (Iterator <Student> iterator = al.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
				
			}
			/*Student s5 = new Student("Mudit", 1, "Mudi", 1200.00);
				if (s1.equals (s5)){
					System.out.println("It is the same record as s1");
				}
				else{
					System.out.println("Something is wrong");
				}*/
			System.out.println("This is how the data is naturally sorted based on id (Comparable)");
				Collections.sort(al);
			for (Iterator <Student> iterator = al.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
				
			}
			System.out.println("This is the secondary sort based on comparator");
			al.sort(new StudentNameComparator());
			for (Iterator <Student> iterator = al.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
				
			}
			System.out.println("This is the secondary sort on NN based on comparator");
			al.sort(new StudentNickNameComparator());
			for (Iterator <Student> iterator = al.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
				
			}
	}

}
