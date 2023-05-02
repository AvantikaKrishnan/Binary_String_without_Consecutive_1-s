# Binary_String_without_Consecutive_1-s

## Recursion

The solution utilizes a global variable count to keep track of the number of Binary strings without consecutive 1's. In the recursive function helper() we call the function twice within the fucntion once by adding '0' and once by adding '1' . When the length of the String reaches the given value length value we check whether it is valid or not using the isSafe function(). If it is the count is incremented.

## DP

The solution simply uses 4 variables o_one, o_zero, n_one,n_zero. 
LOGIC:
0 (Ending with 0): 0  1|00  2| 000  3|
                       |10   | 100   |
                               010   |



1 (Ending with 1): 1|01  1| 001  2| 
                    |     | 101   |
                    
 
2+3 ==> 5 (Answer)
