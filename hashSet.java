import java.util.*;

public class hashSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hS = new HashSet<>();
        System.out.println("Enter no of Elements:");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("Enter element "+i);
            hS.add(sc.nextInt());
        }
        System.out.println(hS);
        System.out.println("Stored Elements in HashSet");
        Iterator<Integer> itr = hS.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
