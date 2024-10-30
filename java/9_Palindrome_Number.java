/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 */
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        if (solution.isPalindrome(121)){
            System.out.println("Palindromo");}
        else{
            System.out.println("NÃO Palindromo");}
    }
    public boolean isPalindrome(int x) {
        int teste=x;
        if (x<0){
            return false;
        }
        int c=0;
        Stack<Integer> pilha=new Stack<>();
        List<Integer> list=new ArrayList<>();
        while (teste>0){
            int aux=teste%10;
            pilha.push(aux);
            list.add(aux);
            c++;
            teste=teste/10;
        }
        for (int i=0;i<c;i++){
            if (!pilha.pop().equals(list.get(i))){
                return false;
            }
        }
        return true;
    }
}
