package CoreConcept;

public class Threads {

	public static void main(String[] args) {

		Object obj=new Object();
		
		Thread1 td1=new Thread1(obj);
		Thread2 td2=new Thread2(obj);
		
		Thread th1=new Thread(td1);
		Thread th2=new Thread(td2);
		th1.start();
		th2.start();
		
	}

}


class Thread1 implements Runnable{
	private Object obj;
	static boolean flag=false;

	public Thread1(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		
		synchronized (obj) {
			
			while(!flag) {
				for(int i=2;i<=10;i=i+2) {
					
						try {
							
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						System.out.println("Thread "+Thread.currentThread() +" "+i);
						flag=!flag;
					
					notify();
				}
			}
		}
		
	}
	
}

class Thread2 implements Runnable{
	private Object obj;

	public Thread2(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		
		synchronized (obj) {
			
			while(Thread1.flag) {
				for(int i=1;i<=10;i=i+2) {
						try {
							System.out.println("Thread "+Thread.currentThread() +" "+i);
							Thread1.flag=!Thread1.flag;
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						
					notify();
				}
			}
		}
		
	}
	
}
