class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] suff = new int[length];
        int[] pref = new int[length];
        int product = 1;
        for(int i = 0 ; i < length; i++ ){
          pref[i] = product;
          product = product*nums[i];
        }
        product = 1;
        for(int i = length-1; i >= 0; i-- ){
          suff[i] = product;
          product = product*nums[i];
        }
        int res[] = new int[length];
        for(int i = 0 ; i < length ; i++){
          res[i]  = pref[i]*suff[i];
        }

        return res;
    }
}  
