import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Executor is a framework for managing multi-threading.
    Executor helps us to improve performance and memory efficiency by avoiding creation and deletion of
    threads for every request.
    This maintains thread pools where certain no of worker threads available to serve our request.
*/
public class threadPool implements Runnable{
    private final int x;
    threadPool(int x){
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+ x);
    }

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=1; i<11; i++){
            executor.execute(new threadPool(i));
        }

        executor.shutdown();
    }
}
