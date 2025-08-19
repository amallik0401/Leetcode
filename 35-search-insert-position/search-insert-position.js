/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {

    for(let i = 0 ;i < nums.length ; i++){

        if(target <= nums[i]){
            target = i;
            break
        }
        if(i== nums.length - 1)
        {
            target = target > nums[i] ? i+1 : 0;
            break
        }
    }
    
    return target
};