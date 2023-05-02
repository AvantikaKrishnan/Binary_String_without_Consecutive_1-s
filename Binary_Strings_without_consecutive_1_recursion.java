import java.util.*;
public class Binary_Strings_without_consecutive_1_recursion {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        helper("",n);
        System.out.println(count);
    }
    public static void helper(String s , int n)
    {
        if(s.length() == n) {
            if(isSafe(s))
                count++;

            return;
        }
        helper(s+"0" , n);
        helper(s+"1",n);
    }
    public static boolean isSafe(String s) {
        int j = 0;
        while(j<s.length()-1)
        {
            if(s.charAt(j) == '1' && s.charAt(j+1) == '1')
                return false;

            j++;
        }
        return true;
    }

}

