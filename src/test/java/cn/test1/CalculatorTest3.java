package cn.test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import study.Calculator;
import study.CalculatorImpl;

public class CalculatorTest3 {
    @DataProvider(name = "multiplication")
    public Object[][] getMulPara(){
        Object[][] mul ={
                {3,4,12},
                {4,0,0},
                {-1,2,-2}
        };
        return mul;
    }
    @Test(groups = "mulTest",dataProvider = "multiplication")
    public void mulTest(int x,int y,int expectResult){
        Calculator calculator = new CalculatorImpl();
        int result = calculator.multiplication(x,y);
        Assert.assertEquals(result,expectResult);
    }
}
