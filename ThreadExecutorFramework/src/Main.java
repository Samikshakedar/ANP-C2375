import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args)throws RuntimeException {
		 //Execute executor=Executor.newSingleThreadExecuted();
		//Execute executor=Executor.newFixThreadExecuted();
         Executor executor=Executors.newScheduledThreadPool(2);
         executor.execute(new CopyTask());
         executor.execute(new SpellcheckTask());
         ExecutorService executorService=Executors.newCachedThreadPool();
         executorService.submit(new DisplayTask());
         
         
	}

}
