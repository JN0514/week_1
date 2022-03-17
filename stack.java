import java.util.*;
public class stack {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer> stack  = new Stack<>();
        for(int i =1 ; i<=6; i++){
            System.out.println("Enter element "+i);
            stack.push(sc.nextInt());
        }
        System.out.println("Before removing: "+ stack);
        System.out.println("Remove 2 elements");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("After removing: "+ stack);
        for(int i: stack){
            System.out.println(i);
        }
    }
}
