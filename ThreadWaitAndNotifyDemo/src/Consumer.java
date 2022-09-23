import java.util.List;
public class Consumer implements Runnable {
     private List taskList;
     Consumer(List<Integer> taskList) {
    	 this.taskList=taskList;
     }
public void run() {
	while(true) {
		System.out.println("Consumer Thread Run Invoked");
		consume();
	}
}
private void consume() {
	synchronized (taskList) {
		while(taskList.isEmpty()) {
			System.out.println("TaskList is empty. Therefore,"
			    	+Thread.currentThread().getName()+"is waiting");
			try {
				taskList.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("Consumer Thread sleeping");
			Thread.sleep(1000);
			}catch (InterruptedException e) {
				
			}
	}
}
}
