package Ex_18_Oops_Constructor;

public class Labs162_oops {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;

    }

}

class Baby{
    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }
}
