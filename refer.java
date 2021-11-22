class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        int val = palindromeNum(head, 0);
        return checkPalindrome(val);
        
    }
    
    public int palindromeNum(ListNode head, int number)
    {
        if(head==null) return number;
        number = number *10 + head.val;
        return palindromeNum(head.next, number);
       
    }
    
    public boolean checkPalindrome(int number)
    {
        int reverse = 0, n = 0;
        while(number>0)
        {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        if(reverse == number) return true;
        else  return false;
    }
}