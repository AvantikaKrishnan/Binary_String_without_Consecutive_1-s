import java.util.*;
public class Binary_Strings_without_consecutive_1_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int o_zero = 1;
        int o_one = 1;

        for(int i =2;i<= n;i++)
        {
            int n_zero = o_zero+o_one;
            int n_one = o_zero;

            o_zero = n_zero;
            o_one = n_one;

        }
        System.out.println(o_one+o_zero);
    }
}
