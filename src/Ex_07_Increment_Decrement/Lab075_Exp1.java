package Ex_07_Increment_Decrement;

public class Lab075_Exp1 {
    public static void main (String args[]){
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> ExpA ->  10 , a -> 11
        // +
        // ++a -> ExpB ->  12 , a -> 12
// Example 2
        int a1 = 10;
        System.out.println(++a1 + ++a1);
        System.out.println(a1);

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12



    }
}
