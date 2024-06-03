/**
 * Interface representing priority attributes of a task for example
 * @author Hannes Nilsson
 * @version 1.0
 * Mopdule 2 project
 * CS1313ON
 */
public interface Priority {
		/**
		 * Priority settings
		 */
		final int MED_PRIORITY = 5;
		final int MAX_PRIORITY = 10;
		final int MIN_PRIORITY = 1;
		
		/**
		 * Methods to be used, getters and setters.
		 * @param priority
		 */
		public void setPriority(int priority);
		public int getPriority();
}//end interface
