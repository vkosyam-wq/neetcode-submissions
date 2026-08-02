class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productArray = new int[n];
        int except = 0;
        int left = 0;
        int right = nums.length - 1;
        while(except < n)
        {
            int prefixProd = 1;
            int suffixProd = 1;
            for(int i = left; i < except; i++)
            {
                prefixProd *= nums[i];
            }
            

            for(int i = right; i > except; i--)
            {
                suffixProd *= nums[i];
            }
            productArray[except] = prefixProd * suffixProd;
            except++;

        }

        return productArray;
        


    }
}  
