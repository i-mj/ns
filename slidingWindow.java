class slidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int []result=new int[n-k+1];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int Max=nums[i];
            for(int j=i;j<k+i;j++){
                if(Max<nums[j]){
                    Max=nums[j];
                }
            }
            result[i]=Max;
        }
        return result;
    
    }
    
    public static void printArray(int[]arr){
    	for(int ele : arr){
    		System.out.print(ele+" ");
    	}
    }

    public static void main(String[] args) {
    	int []arr={1,3,-1,-3,5,3,6,7};
    	int key=3;
    	printArray(maxSlidingWindow(arr,key));
    }
}