// Last updated: 09/07/2026, 09:31:06
class Solution {
    public String greatestLetter(String s) {

       HashSet<Character> hs=new HashSet<Character>();
       for(char c:s.toCharArray()){
        hs.add(c);}
       for(char i='Z';i>='A';i--){
        if(hs.contains(i) &hs.contains(Character.toLowerCase(i))){
            return String.valueOf(i);
        }}
       return "";
       }}
