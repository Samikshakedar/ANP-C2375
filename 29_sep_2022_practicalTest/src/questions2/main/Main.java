package questions2.main;

import questions2.thread.ThankYouThread;
import questions2.thread.WelcomeThread;

public class Main {
	
public static void main(String[] args) {
	Thread t1 = new Thread (new WelcomeThread());
	t1.start();
	Thread t2 = new Thread (new ThankYouThread());
	t2.start();
}
}
