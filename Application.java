/**
 * Application class to test each method in current package
 * @author Hannes Nilsson
 * @version 1.0
 * Module 2 project
 * CS1313ON
 */
public class Application {

	public static void main(String[] args) {
		Task t1 = new Task("Notepad");
		Task t2	= new Task("Minecraft");
		Process p1 = new Process("111");
		Process p2 = new Process("112");
		
		t1.setPriority(5);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		if (t1.compareTo(t2)>0) {
			System.out.println(t1.getName()+ " has higher priority");
		}
		
		t2.setStatus(t2.status.IN_PROCESS);
		
		t2.setPriority(5);
		System.out.println(t2.toString());
		if (t1.compareTo(t2) == 0) {
			System.out.println(t1.getName()+ " has equal priority to "+ t2.getName());
		}
		
		p1.setPriority(5);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if (p1.compareTo(p2)>0) {
			System.out.println(p1.getProcessID()+ " has higher priority");
		}
		
		p2.setPriority(5);
		System.out.println(p2.toString());
		if (p1.compareTo(p2) == 0) {
			System.out.println(p1.getProcessID()+ " has equal priority to "+ p2.getProcessID());
		}
		
	}//end main

}//end class
