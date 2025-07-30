class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];

       if(strs.length==0) return "";

       for(int i=1 ; i<strs.length; i++){
        String CurrentWord = strs[i];
        while(CurrentWord.indexOf(prefix)!=0){
            prefix = prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()) return "";
        }
       }
       return prefix;
    }
}