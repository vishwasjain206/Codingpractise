package vishwas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadprocessinglearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService threadpool = Executors.newFixedThreadPool(10);
		threadpool.submit(() -> System.out.println("abc"));
	
		
	}

}
