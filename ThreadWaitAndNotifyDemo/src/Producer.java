import java.util.ArrayList;
import java.util.List;
public class Producer 
{
    private List taskList;
    private int max_capacity;
    Producer(List<Integer> taskList,int max_capacity) 
    {
	this.taskList=taskList;
	this.max_capacity=max_capacity;
    }
    public void run() {
    	int counter=1;
    	while(true) {
    		produce(counter++);
    	}
    }
    private void produce(int i) {
      synchronized (taskList) {
    	while(taskList.size()==max_capacity);{
    		System.out.println("TaskList is full. Therefore,"
    	+Thread.currentThread().getName()+"is waiting");
    		try {
    			taskList.wait();
    		}catch (InterruptedException e) {
    			 e.printStackTrace();
    		}
    	}
    	taskList.add(i);
    	System.out.println("Produced:"+i);
    	taskList.notifyAll();
    	}
    }
}
