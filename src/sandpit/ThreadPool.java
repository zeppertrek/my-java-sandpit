package sandpit;

public class ThreadPool {

	public static void main(String[] args) {
		// By default, evet java app will have 1 thread spawned by main()
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);

		// change the name of the thread
		t.setName("My Sandpit Thread");
		System.out.println("After name change: " + t);

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
