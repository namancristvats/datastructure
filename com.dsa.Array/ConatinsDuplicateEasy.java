class ContainsDuplicateEasy {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        if(map.size()!=nums.length){
            return true;
        }
        return false;
    }
}