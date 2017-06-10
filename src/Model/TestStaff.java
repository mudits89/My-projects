package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Create Staff");
			Staff stf1 = new Staff("Syam",105 , "Sya", 15000.00);
			Staff stf2 = new Staff("Vadivel", 102, "Vadi", 15000.00);
			Staff stf3 = new Staff("Karthik", 101, "Karti", 17000.00);
			Staff stf4 = new Staff("Venkat", 104, "Venki", 10000.00);
			
			ArrayList<Staff> al1 = new ArrayList<Staff>();
			al1.add(stf1);
			al1.add(stf2);
			al1.add(stf3);
			al1.add(stf4);
			System.out.println("This is how the data is normally stored");
			for (Iterator <Staff> iterator = al1.iterator(); iterator.hasNext();) {
				Staff staff = (Staff) iterator.next();
				System.out.println(staff.toString());
			}
			/*Staff stf5 = new Staff("Syam",100 , "Sya", 15000.00);
			if (stf1.equals(stf5)){
				System.out.println("It is the same record as stf1");
			}else {
				System.out.println("Something is not right");
			}*/
			System.out.println("This is how the data is naturally sorted based on id(Comparable) ");
			Collections.sort(al1);
			for (Iterator<Staff> iterator = al1.iterator(); iterator.hasNext();) {
				Staff staff = (Staff) iterator.next();
				System.out.println(staff.toString());
			}
			System.out.println("This is the secondary sort based on comparator ");
			al1.sort(new StaffNameComparator());
			for (Iterator <Staff> iterator = al1.iterator(); iterator.hasNext();) {
				Staff staff = (Staff) iterator.next();
				System.out.println(staff.toString());
			}
			
			System.out.println("This is the secondary sort on NN based on comparator ");
			al1.sort(new StaffNickName());
			for (Iterator <Staff> iterator = al1.iterator(); iterator.hasNext();) {
				Staff staff = (Staff) iterator.next();
				System.out.println(staff.toString());
				
			}
				
			
			
	}

}
