// Last updated: 5/14/2026, 11:10:05 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int  result=0;
        for(int i=0;i<operations.length;i++){
         if(operations[i].charAt(1)=='+'){
             result+=1;
         }else{
         result-=1;
        }
       
        }
        return result;
    }
}