package questions2.thread;

public class WelcomeThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++) {
        	System.out.println("Welcome");
        	try {
        		Thread.sleep(2000);
        	}catch(InterruptedException e) {
       		 e.printStackTrace();
        }
     }
 }
}