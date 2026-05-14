// Last updated: 5/14/2026, 11:10:08 PM
class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x)
     {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
         if(words[i].contains(""+x))
         res.add(i);
        }
        return res;
     }
}