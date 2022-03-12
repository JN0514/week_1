public class MyThread extends Thread{
    MyThread(String x){
        super(x);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running");
    }
    public static void main(String[] args){
        MyThread m = new MyThread("Surya Thread");
        m.start();
        System.out.println("Main Thread is running");
    }
}