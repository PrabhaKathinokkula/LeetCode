// Last updated: 8/13/2026, 5:28:06 PM
class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
            while(l<=r){
                while(l<r && !Character.isLetterOrDigit(s.charAt(l)) ){
                    l++;
                  
                }
                while(l<r && !Character.isLetterOrDigit(s.charAt(r)) ){
                    r--;
                }
                int left=Character.toLowerCase(s.charAt(l));
                int right=Character.toLowerCase(s.charAt(r));

                if(left != right){
                    return false;
                }
                 l++;
                r--;

        
                 

            }
             return true;
        
        
    }
}