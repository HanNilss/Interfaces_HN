/**
 * Class representing a task, such as a to do list which implements the Priority interface.
 * @author Hannes Nilsson
 * @version 1.0
 * Module 2 project
 * CS1313ON
 */
public class Process implements Priority, Comparable<Process>{

	/**
	 * Identification for current process
	 * Priority of current process
	 */
	private String processID;
	private int priority;
	
	public Process(String pID) {
		setProcessID(pID);
		setPriority(MIN_PRIORITY);
	}//end preferred constructor
	
	/**
	 * Compares the priority for the current and passed process.
	 * 
	 * @param t
	 * @return r : 0, 1, or -1
	 */
	@Override
	public int compareTo(Process p) {
		
		int r;
		if (this.getPriority() == p.getPriority()) {
			r = 0;
		}
		else if (this.getPriority() > p.getPriority()) {
			r = 1;
		}
		else if (this.getPriority() > p.getPriority()) {
			r = -1;
		}
		else {
			r = 0;
		}
		return r;
	}//end compareTo
	
	/**
	 * @return the processID
	 */
	public String getProcessID() {
		return this.processID;
	}//end getProcessID

	/**
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID

	@Override
	/**
	 * Sets priority for current process
	 * @param priority to set.
	 */
	public void setPriority(int priority) {
		this.priority = priority;
		
	}//end setPriority
	
	/**
	 * @return priority
	 */
	@Override
	public int getPriority() {
		return this.priority;
	}//end getPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
}//end class
