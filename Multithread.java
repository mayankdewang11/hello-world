// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running

			for(int i=0; i<10; i++) {

				System.out.println ("Thread " + 
				Thread.currentThread().getId() + 
				" is running for " + i + "time");

				Thread.sleep(5000);
			}

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class Multithread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 8; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
		} 
	} 
} 
