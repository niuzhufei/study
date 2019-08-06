package study;

import study.Calculator;

/**
 * Created by IntelliJ IDEA.
 * User: niuzhufei
 * Date: 2019/7/31
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorImpl implements Calculator {

    //加法运算
    public int addition(int a, int b) {
        return a + b;
    }

    //减法运算
    public int subtraction(int a, int b) {
        return a - b;
    }

    //乘法运算
    public int multiplication(int a, int b) {
        return a * b;
    }

    //取模运算
    public int remainder(int a, int b) {
        return a % b;
    }
}
