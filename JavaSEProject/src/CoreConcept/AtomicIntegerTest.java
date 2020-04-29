package CoreConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService exe=Executors.newCachedThreadPool();
		Sharedresource res=new Sharedresource();
		for(int i=0;i<100;i++) {
			exe.execute(new MyThread(res));
		}
		Thread.sleep(2000);
		exe.shutdown();
		System.out.println(res.i);
	}

}

class MyThread extends Thread{
	
	Sharedresource res;
	
	
	
	public MyThread(Sharedresource res) {
		super();
		this.res = res;
	}



	@Override
	public void run() {
		res.increment();
	}
}

class Sharedresource{
	
	AtomicInteger  i=new AtomicInteger(0);
	
	int increment() {
		//synchronized (this) {
			
			return i.incrementAndGet();
		//}
	}
}
