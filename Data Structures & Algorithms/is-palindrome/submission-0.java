class Solution {
    public boolean isPalindrome(String s) {
  
      
        char[] str = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();
        int j = str.length-1;
        int i = 0;
        while (j>i ){
            if (str[i]!=str[j]){
                return false;
            }
            i++;
            j--;
        }


        return true;
        
    }
}
