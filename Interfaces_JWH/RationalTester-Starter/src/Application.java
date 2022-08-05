/**
 * This class tests many objects and compares them
 * @author Jake Holovka
 * Programming Project 2
 */
public class Application {

	public static void main(String[] args) {
		
		//creating new RationalNumbers to test
		System.out.println("RationalNumber");
		RationalNumber r3 = new RationalNumber(2,6);
		RationalNumber r4 = new RationalNumber(5,8);
		
		System.out.println(r3.compareTo(r4));
		System.out.println();
		
		//creating new tasks to tests
		Task t1 = new Task("Shopping");
		Task t2 = new Task("Fishing");
		Task t3 =new Task("Laundry");
				
		t1.setStatus(Task.Status.IN_PROGRESS);
		t1.setPriority(Priority.MAX_PRIORITY);
				
		t2.setStatus(Task.Status.NOT_STARTED);
		t2.setPriority(Priority.MIN_PRIORITY);
				
		t3.setStatus(Task.Status.COMPLETE);
		t3.setPriority(Priority.MAX_PRIORITY);
		
		System.out.println("Task");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println("Different Prioritys: "+t1.compareTo(t2));
		System.out.println("Same Prioritys: "+t1.compareTo(t3));
		System.out.println();
		
		//process tests
		System.out.println("Process");
		Process p1= new Process("MS Word");
		p1.setPriority(Priority.MED_PRIORITY);
		Process p2 = new Process("MS Paint");
		p2.setPriority(Priority.MED_PRIORITY);
		Process p3 = new Process("Outlook");
		p3.setPriority(Priority.MIN_PRIORITY);
				

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
				
		System.out.println("Same Prioritys: "+p1.compareTo(p2));
		System.out.println("Different Prioritys: "+p1.compareTo(p3));
		
		
	}//end main

}//end class
