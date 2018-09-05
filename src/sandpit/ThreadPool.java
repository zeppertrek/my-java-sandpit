package sandpit;

public class ThreadPool {

	public static void main(String[] args) {
		// By default, evet java app will have 1 thread spawned by main()
		 Thread t = Thread.currentThread();
		 System.out.println("Current thread: " + t);
	}

}
