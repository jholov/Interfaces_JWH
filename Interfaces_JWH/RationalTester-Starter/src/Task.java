/**
 * This class represents Task and allows you to compare priorities
 * @author Jake Holovka
 *Programming Problem 2
 */


public class Task implements Priority, Comparable<Task> {

	enum Status {NOT_STARTED, IN_PROGRESS, COMPLETE}
	
	private final String name;
	private int priority;
	public Status Stat;
	
	/**
	 * 
	 * @param name
	 */
	public Task(String name) {
		
		this.name = name;
		setPriority(MIN_PRIORITY);
		setStatus(Status.NOT_STARTED);
		
	}//end constructor
	
	/**
	 * 
	 * @param status
	 */
	public void setStatus(Status status) {
		
		this.Stat = status;
		
	}//end setStatus
	
	/**
	 * 
	 * @return
	 */
	public Status getStatus() {
		
		return Stat;
		
	}//end getStatus
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * 
	 * @return
	 */
	public int getPriority() {
		return priority;
	}//end getPriority
	
	/**
	 * 
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	/**
	 * 
	 * @return
	 */
	public int compareTo(Task op2) {
	
		if(priority==op2.priority) 
		{	
			return 1;
			
		}
		else
			
			return 0;
	
	}//end compareTo
	
	/**
	 * 
	 * @return
	 */
	public String toString() {
		
		return "Task: "+name+ " Priority: "+ priority+" Status: "+Stat;
		
	}//end toString
	
}//end class
