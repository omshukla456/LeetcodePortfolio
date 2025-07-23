//LeetCode :4 Reverse String

class Solution {
    public void reverseString(char[] s) {
        char[] t = new char[s.length];
        int flag=0;
        for(int i=s.length-1 ; i>-1 ; i--)
        {
            t[flag]=s[i];
            flag++;

        }
        for(int i = 0 ; i < t.length ; i++)
        {
            s[i]=t[i];
        }
    
    }
}