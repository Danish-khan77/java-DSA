import java.util.HashMap;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        //prefix sum 0 is considered at index -1
        map.put(0,-1);
        int sum=0;
        int maxLen=0;
        for(int i=0; i<nums.length; i++){
            //Treat 1 as +1 and 0 as -1
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            else{
                //store first occurency
                map.put(sum,i);
            }    
        }
        return maxLen;
    }
}
