package questions2.thread;

public class ThankYouThread implements Runnable {

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
         for(int i=1;i<=3;i++) {
        	 System.out.println("Thank you");
        	 try {
        		 Thread.sleep(4000);
        	 }catch(InterruptedException e) {
        		 e.printStackTrace();
        	 }
         }
	}

}
