import java.util.HashMap;
import java.util.*;

public class hashMap {
    public static void main(String[] args){
        HashMap<Integer, String> studentDB = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student:");
        int n = sc.nextInt();
        for(int i=1; i <= n; i++){
            System.out.println("Enter details of Student "+i);
            int rollNo = sc.nextInt();
            String name = sc.next();
            studentDB.put(rollNo, name);
        }
        System.out.println(studentDB);
        System.out.println("Display student Details");
        for(int i: studentDB.keySet()){
            System.out.println(i+" "+studentDB.get(i));
        }
    }

}
