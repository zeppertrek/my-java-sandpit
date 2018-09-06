// This class implements the Runnable Interface
package threadpit;

public class simplethreads implements Runnable{

	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	             Thread simpleThread1 = new Thread();
	             simpleThread1.start();
	             Thread simpleThread2 = new Thread();
	             simpleThread1.start();
	    }

	    @Override
	    public void run() {
	        	        
	    }

	}
	
	
