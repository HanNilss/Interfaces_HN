/**
 * Class representing a task, such as a to do list which implements the Priority interface and a Status enumeration.
 * @author Hannes Nilsson
 * @version 1.0
 * Module 2 project
 * CS1313ON
 */
public class Task implements Priority, Comparable<Task>{
	enum Status {
		NOT_STARTED(0),
		IN_PROCESS(50),
		COMPLETE(100);
		
		int statusLevel;
		Status(int statusLevel){
			this.statusLevel = statusLevel;
		}
	}//end enum
		
	/**
	 * Name for task.
	 * Priority for task.
	 */
	private String name;
	private int priority;
	Status status;
	
	/**
	 * Creates a task object and sets the name as a string passed as parameter and sets priority to MIN_PRIORITY
	 * @param name
	 */
	public Task(String name) {
		this.name = name;
		this.priority = MIN_PRIORITY;
		setStatus(status.NOT_STARTED);
	}//end preferred constructor
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	public void setStatus(Status s) {
		status  = s;
	}//end setStatus
	
	public Status getStatus() {
		return this.status;
	}//end getStatus
	
	/**
	 * @return priority
	 */
	public int getPriority(){
		return this.priority;
	}//end getPriority
	
	/**
	 * Sets priority for current task
	 * @param priority to set.
	 */
	public void setPriority(int priority){
		this.priority = priority;
	}//end setPriority
	
	/**
	 * Compares the priority for the current and passed tasks.
	 * 
	 * @param t
	 * @return r , 0, 1, or -1
	 */
	public int compareTo(Task t) {
		int r;
		if (this.getPriority() == t.getPriority()) {
			r = 0;
		}
		else if (this.getPriority() > t.getPriority()) {
			r = 1;
		}
		else if (this.getPriority() > t.getPriority()) {
			r = -1;
		}
		else {
			r = 0;
		}
		return r;
	}//end compareTo

	@Override
	public String toString() {
		return "Task [name=" + getName() + ", priority=" + getPriority() + ", status=" + getStatus() + "]";
	}//end toString
	
}//end class
