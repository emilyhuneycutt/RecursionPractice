import java.io.*;
import java.util.*;
public class FactorialPractice {

    static int factorial (int n)
    {
        if (n==0 || n == 1)
            return 1;

        return n * factorial (n - 1);
    }

    public static void main(String[] args){
        int ans = factorial(7);
        System.out.println("Factorial of 5 is:"+" "+ans);
    }
}
