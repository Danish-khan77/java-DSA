class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                decreasing = false;
            }
            if(nums[i]>nums[i+1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
public class main{
    public static void main(String args[]){
    int[] nums = {1,2,2,36};
    Solution sol = new Solution();
    if(sol.isMonotonic(nums)){
        System.out.println("Monotonic array");
    }
    else{
        System.out.println("Not Monotic array");
    }
}
}
