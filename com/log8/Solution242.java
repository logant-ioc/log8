package com.log8;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(null==s||null==t){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }
        int[] tt=new int[26];
        for(int i=0;i<s.length();i++){
            tt[s.charAt(i)-'a']++;
            tt[t.charAt(i)-'a']--;
        }

        for(int j=0;j<tt.length;j++){
            if(tt[j]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="abc";
        String t="bac";
        Solution242 s242 = new Solution242();
        System.out.println(s242.isAnagram(s, t));
    }
}
