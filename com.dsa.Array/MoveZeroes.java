class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //Two pointers approach to not use extra space(array)
        int n=nums.length;
       int insertPosition=0;
       for(int i=0;i<n;i++){
        if(nums[i]!=0){
            nums[insertPosition]=nums[i];
            insertPosition++;
        }
       }
        while(insertPosition<n){
            nums[insertPosition++]=0;
        }
    }
}