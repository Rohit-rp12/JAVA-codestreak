import java.util.*;
public class overloading1{                       //overloading using data types
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(2,4));
        System.out.println(sum(3.5f,6.7f));
    }
}