import java.util.*;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> aL = new ArrayList<>();
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter element "+i);
            int j = sc.nextInt();
            aL.add(j);
        }
        System.out.println(aL);
        Iterator<Integer> itr = aL.iterator();
        System.out.println("Stored elements in ArrayList");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
