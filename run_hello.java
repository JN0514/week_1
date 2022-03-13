public class run_hello implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" says 'Hello India'");
    }
    public static void main(String[] args){
        run_hello r = new run_hello();
        Thread thread1 = new Thread(r,"thread1");
        Thread thread2 = new Thread(r,"thread2");
        Thread thread3 = new Thread(r,"thread3");
        Thread thread4 = new Thread(r,"thread4");
        Thread thread5 = new Thread(r,"thread5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
