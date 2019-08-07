package cn.test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import study.Calculator;
import study.CalculatorImpl;

public class CalculatorTest2 {
    @DataProvider(name = "subtraction")
    public Object[][] getSubtractionPara(){
        Object[][] sub = {
                {6,4,2},
                {2,0,2},
                {-2,-1,-1}
        };
        return sub;
    }
    @Test(groups = "subtractionTest",dataProvider ="subtraction" )
    public void subtractionTest(int x,int y,int expectResult){
        Calculator calculator = new CalculatorImpl();
        int result = calculator.subtraction(x,y);
        System.out.print("result="+result);
        Assert.assertEquals(result,expectResult);
    }
}
