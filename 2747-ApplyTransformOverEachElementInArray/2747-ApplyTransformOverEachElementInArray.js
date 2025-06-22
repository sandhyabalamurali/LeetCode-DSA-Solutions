// Last updated: 6/22/2025, 11:02:45 AM
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const arr_ans=[]
    for(let i=0;i<arr.length;i++){
        arr_ans[i]=fn(arr[i],i);
    }
    return arr_ans;
};