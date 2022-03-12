public class RunThread{
    public static void main(String[] args){
        Runnable r = ()->System.out.println(Thread.currentThread().getName()+" is running");
        Thread m= new Thread(r,"Surya Thread");
        m.start();
        System.out.println("Main Thread is running");
    }
}
