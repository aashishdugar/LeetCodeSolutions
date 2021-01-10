/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    var count = 0;
    for(var i = 0; i < nums.length - 1; i++){
        for(var j = nums.length - 1; j > i; j--){
            if( nums[i] == nums[j]) count++;
        }
    }
    
    return count;
    
};