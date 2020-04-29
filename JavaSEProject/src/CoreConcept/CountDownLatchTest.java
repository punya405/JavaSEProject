package CoreConcept;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {

		CountDownLatch coundDownLatch=new CountDownLatch(3);
		System.out.println(" CoundDown has been created with count");
		new Thread(new MyRunnable(coundDownLatch)).start();
		
		
		try {
			coundDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count has been released to zero "+Thread.currentThread().getName()+" thread ended");
	}

}

class MyRunnable implements Runnable {

	CountDownLatch coundDown;

	public MyRunnable(CountDownLatch coundDown) {
		super();
		this.coundDown = coundDown;
	}

	@Override
	public void run() {

		for (int i = 2; i >= 0; i--) {
			System.out.println(Thread.currentThread().getName() + " has released latch count to " + i);

		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		coundDown.countDown();
	}

}
