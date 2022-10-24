package Voderm.leetcode;


/**
 * @author: voderm Lee
 * @date: 2022/10/8 17:14
 */
public class Run {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4}; // 输入数组
        Rotate.rotate(prices,2);
        for(int i:prices){
            System.out.print(" "+i);
        }
    }
}

// 删除排序数组中的重复项——双指针
class DeleteDuplicates {
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

// 买股票的最佳时机
class MaxProfit{
    public static int maxProfit(int []prices){
        // 一个prices数组 代表的就是一只股票，每个序号就是当天股票的价格
        // 贪心算法？ 比较相邻数组序号中的价格
        // 如果第一个比第二个小 则 第一个买入，第二个卖出，直到 第二个的下标是数组最后一个。
        int i =0,j = 1;
        int profit = 0;
        for (; j < prices.length; i++,j++) {
            if (prices[i]<prices[j]){
                profit = profit+ (prices[j] - prices[i]);
            }
        }
        return profit;
    }
}

// 给一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
class Rotate{
    //这个方法的空间复杂度是O（1），但时间复杂度却是O（n^2）
    public static void rotate(int[] nums,int k){
        for(int i =1 ; i <= k;i++){
            int temp = nums[nums.length-1];
            for (int j = nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
//class Rotate{
//    //这个方法的空间复杂度是O（n），时间复杂度是O（n）
//    // 创建一个额外的数组，存储转换后的数组。 利用mod运算 标记位置
//    public static void rotate(int[] nums,int k) {
//        int n = nums.length;
//        int[] newNums = new int[n];
//        for(int i = 0;i <n;i++){
//            newNums[(i+k)%n] = nums[i];
//        }
//        System.arraycopy(newNums,0,nums,0,n);
//    }
//}