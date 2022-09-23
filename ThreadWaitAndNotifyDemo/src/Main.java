import java.util.List;
import java.util.ArrayList;
public class Main {

public static void main(String[] args){
	  List<Integer> taskList= new ArrayList<Integer>();
	  int max_capacity=5;
	  Producer producer=new Producer(taskList,max_capacity);
	  Thread producerThread=new Thread("producer");
	  Consumer consumer=new Consumer(taskList);
	  Thread consumerThread=new Thread(consumer,"ConsumerThread");
	  producerThread.start();
	  consumerThread.start();
 }
}
