// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class Multithread {
	public static void main(String[] args)
	{
		MultithreadingDemo obj = new MultithreadingDemo();
		System.out.println("Prev obj");
		obj.start();
	
		int n = 4; // Number of threads
		System.out.println("new obj");
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}
