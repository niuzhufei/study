package cn.test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import study.Calculator;
import study.CalculatorImpl;

public class CalculatorTest1 {
    @DataProvider(name = "addition")
    public Object[][] getAdditionPara(){
        //方法入参和期望值
        Object[][] add = {
                {1,2,3},
                {-1,-2,-3},
                {-1,-2,-3}
        };
        return add;
    }
    @Test(groups = "additionTest",dataProvider = "addition")
    public void additionTest(int x,int y,int expectResult){
        //从getAdditionPara方法返回的二维数组中获取的测试用例
        Calculator calculator = new CalculatorImpl();
        int result = calculator.addition(x,y);
        Assert.assertEquals(result,expectResult);
    }
}
