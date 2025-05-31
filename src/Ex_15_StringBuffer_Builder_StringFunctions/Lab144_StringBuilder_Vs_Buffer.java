package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Salma";
        String s1 = new String("Salma");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Salma");
        StringBuilder stringBuilder = new StringBuilder("Salma");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());





    }
}
