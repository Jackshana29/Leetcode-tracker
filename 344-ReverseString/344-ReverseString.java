// Last updated: 09/07/2026, 09:31:46
class Solution {
    public void reverseString(char[] s) {
      String s1="";
      for(char a:s){
        s1+=a;
      }  
      int k=s1.length()-1;
      for(int i=0;i<s1.length();i++){
        s[i]=s1.charAt(k);
        k--;
      }
    }
}