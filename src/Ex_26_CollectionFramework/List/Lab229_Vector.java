package Ex_26_CollectionFramework.List;
import java.util.*;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Array

        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));






    }
}
