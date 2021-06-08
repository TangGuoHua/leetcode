package java8;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       String s = "a,b,c";
       System.out.println(Arrays.toString(s.split(",")));
    }
    
    public int reverseBits(int n) {
        System.out.println("input number is : "+n);
        String s = Integer.toBinaryString(n);
        
        System.out.println("input string :    "+ s);
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() < 32) {
            sb.insert(0, '0');
        }
        sb.reverse();
        
        System.out.println("reversed string : "+ sb.toString());
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }

}
