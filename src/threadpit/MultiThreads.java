// This is the main class that will spawn multiple child threads
// 
// Assume that there is a single socket in the house
// The following devices use this single socket
//





package threadpit;

public class MultiThreads {

	public static void main(String[] args) {
		// By default, event java app will have 1 thread spawned by main()
		Thread t = Thread.currentThread();
		System.out.println("Current thread (Main): " + t);



		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				//  sleep( ) method causes the thread from which it is called to suspend execution for the
				// specified period of milliseconds
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

	}

}
