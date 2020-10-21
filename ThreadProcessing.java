package vishwas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

class Task implements //Runnable,
Callable<Integer>
{

	//@Override
	/*
	 * public void run() { // TODO Auto-generated method stub
	 * 
	 * System.out.println("abc"); try { Thread.sleep(10000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	private int abc = 5;

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1);
		abc++;
		return abc;
		
	}
	
}
public class ThreadProcessing{

	public static void main(String[] args) {
	
		int coreCount = Runtime.getRuntime().availableProcessors();
		//System.out.println(coreCount);
		ExecutorService service = Executors.newFixedThreadPool(1000);
		/*for (int i=0; i < 10 ;i++)
		{
			service.execute(new Task());
		}*/
		List<Future> l1 =new ArrayList<Future>();
		
		for (int i=0; i <1000 ; i++)
		{
		Future<Integer> a = service.submit(new Task());
		l1.add(a);
		}
		
		try {
			for (int i= 0;i<1000;i++)
			{
			try {
				System.out.println(l1.get(i).get(1,TimeUnit.SECONDS));
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				System.out.println("heloo");
			}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	

}
