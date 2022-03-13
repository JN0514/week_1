public class thread_hello extends Thread{
    thread_hello(String x){
        super(x);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" says 'Hello All'");
    }
    public static void main(String[] args){
        Thread thread1 = new thread_hello("thread1");
        Thread thread2 = new thread_hello("thread2");
        Thread thread3 = new thread_hello("thread3");
        Thread thread4 = new thread_hello("thread4");
        Thread thread5 = new thread_hello("thread5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
