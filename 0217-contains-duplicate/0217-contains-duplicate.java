class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
     for(int i :nums){
         if(s.add(i)){
             continue;
         }
         else {
             return true;
         }
     }
     return false;      
    }
}