/**
 * This class lets you create a Process and compare them
 * @author Jake Holovka
 * Programming Project 2
 */
public class Process implements Priority, Comparable<Process>{

	private final String processID ;
	private int priority = 0;
	
	/**
	 * 
	 * @param name
	 */
	public Process(String name) {
		
		processID = name;
		priority = 0;
		
	}//end constructor

	/**
	 * 
	 * @return 
	 */
	public int compareTo(Process op2) {
		
		if(priority==op2.priority) 
		{
			return 1;
		}
		else
			return 0;
		
	}//end Compare

	/**
	 * 
	 * @param int A
	 */
	public void setPriority(int A) {
		// TODO Auto-generated method stub
		this.priority = A;
	}//end setPriority

	/**
	 * 
	 * @return
	 */
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
		
	}//end getPriority
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public String getProcessID(String name) {
		
		return processID;
		
	}//end getProcessID
	
	/**
	 * 
	 * @return
	 */
	public String toString() {
		
		return "ProcessID: "+processID+ " Priority: "+ priority;
	}//end toString
	
}//end class
