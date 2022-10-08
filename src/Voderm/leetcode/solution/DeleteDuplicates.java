package Voderm.leetcode.solution;

/**
 * @author: voderm Lee
 * @date: 2022/10/8 17:17
 */
// 删除排序数组中的重复项——双指针
public class DeleteDuplicates {
    public static int removeDuplicates(int nums[]){
        int p = 0,q = 1;

       while(q<nums.length){
           if (nums[p]==nums[q]){q++;}
           else{
               nums[p+1] = nums[q];
               p++;
               q++;
           }
       }
       return p+1;
    }
}
