import java.util.*;

public class queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=6; i++){
            System.out.println("Enter element "+i);
            q.add(sc.nextInt());
        }
        System.out.print("Before Removing: ");
        System.out.println(q);

        System.out.println("Remove 2 elements");
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.print("After removing: ");
        System.out.println(q);

        for(int i: q){
            System.out.println(i);
        }
    }
}
