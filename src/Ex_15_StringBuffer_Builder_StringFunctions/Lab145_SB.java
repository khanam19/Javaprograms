package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Salma");
        stringBuffer.append("Khanam");
        System.out.println(stringBuffer);

        String s1 = "Salma";
        s1 = s1+ "Khanam";
        System.out.println(s1);


    }
}
