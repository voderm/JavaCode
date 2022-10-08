package Voderm.leetcode;

import Voderm.leetcode.solution.DeleteDuplicates;
/**
 * @author: voderm Lee
 * @date: 2022/10/8 17:14
 */
public class Run {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4}; // 输入数组
        int[] expectedNums = new int[0]; // 长度正确的期望答案

        int k = DeleteDuplicates.removeDuplicates(nums); // 调用
        System.out.println("长度为："+k);
        assert k == expectedNums.length; //断言，断言可以看作是异常处理的高级形式。
        //程序员认为在程序执行时， 断言里的布尔表达式 值应该为true。 若该表达式是false，系统就会报告一个错误
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        for (int i: expectedNums)
        {System.out.print(i);}

    }
}
