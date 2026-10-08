class Solution {
    public boolean isPalindrome(String s) {
  
      
        s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        int j = s.length()-1;
        int i = 0;

        while (j>i ){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }


        return true;
        
    }
}
