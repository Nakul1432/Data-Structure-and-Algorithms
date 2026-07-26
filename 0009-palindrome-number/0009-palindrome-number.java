class Solution {
    public boolean isPalindrome(int x) {
      
        String str = String.valueOf(x);

        String str1 = new StringBuilder(str).reverse().toString()  ;
        if(!str.equals(str1)){
            return false;
        }
        
        return true;
    }
}
