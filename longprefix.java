
public String longestCommonPrefix(String[] strs) {
     String long= "";
     if(strs.length>0){
         long = strs[0];
     }
     for(int i=1; i<strs.length; i++){
         String analyzing = strs[i];
         int j=0;
         for(; j<Math.min(long.length(), strs[i].length()); j++){
             if(long.charAt(j) != analyzing.charAt(j)){
                 break;
             }
         }
         long= strs[i].substring(0, j);
     }
     return long;
}   
