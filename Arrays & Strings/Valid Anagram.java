//LeetCode:3 Valid Anagram

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        int flag = 0;
        if(len1 !=len2)
        return false;

        for(int i = 0; i < len1 ; i++)
        {
         if(s1[i] != s2[i]){
             flag++;
            }
        
        }
        if(flag==0)
        return true;
        else
        return false;
    }
}