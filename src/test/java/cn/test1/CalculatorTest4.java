package cn.test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import study.Calculator;
import study.CalculatorImpl;

public class CalculatorTest4 {
    @DataProvider(name = "remainder")
    public Object[][] getRemainderPara(){
        Object[][] remainder ={
                {6,3,0},
                {20,5,0}

        };
        return remainder;
    }
    @Test(groups = "remainderTest",dataProvider = "remainder")
    public void remainderTest(int x,int y,int expectResult){
        Calculator calculator =new CalculatorImpl();
           try {
               int result = calculator.remainder(x, y);
               Assert.assertEquals(result, expectResult);
           }catch (ArithmeticException e){
               System.out.println("除数不能为0");
           }


    }
}
