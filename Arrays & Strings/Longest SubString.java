// Leetcode:5 Longest SubString

import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left=0;
      int right=0;
      int maxsize=0;
      //creation of HashSet
      HashSet <Character> set = new HashSet<>();

      //Sub array iteration with unique words
      for(right = 0 ; right < s.length() ; right++)
      {
        //checking if string char at right pointer has any word which is already in the set
        while(set.contains(s.charAt(right)))
        {
            //removing duplicate
            set.remove(s.charAt(left));
            //updating left pointer
            left++;
        }
        //adding character in subarray
        set.add(s.charAt(right));

        //calculation of maximum size of subarray
        maxsize = Math.max(maxsize , right-left+1);



      }
      return maxsize;

        
        
    }
}