/**
 * Interface that gives you access to set Priority
 * @author Jake Holovka
 *Programming Project 2
 */
public interface Priority {

	
	public static final int MED_PRIORITY = 5;
	public static final int MIN_PRIORITY = 1;
	public static final int MAX_PRIORITY = 10;
	
	/**
	 * 
	 * @param A
	 */
	public void setPriority(int A); 
	
	/**
	 * 
	 * @return
	 */
	public int getPriority();
	
}//end interface
