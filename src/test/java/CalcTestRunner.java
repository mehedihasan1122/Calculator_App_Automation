//import config.SeriesDataSet;
//import io.qameta.allure.Allure;
import config.SeriesDataSet;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "calculate series")
    public void doSeries(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String finalResult =calcScreen.CalculateSeries("100/10*5-10+60");
        System.out.println(finalResult);
        Assert.assertEquals(finalResult,"100");


    }

    @Test(priority = 2, dataProvider ="SeriesCSVData", dataProviderClass = SeriesDataSet.class, description = "Calculate Series from CSV")
    public void CSVSeies(String expression, String expected_result){

        CalcScreen calcScreen = new CalcScreen(driver);
        String csvResult = calcScreen.CalculateCSVSeries(expression);
        System.out.println(csvResult);

        Assert.assertEquals(csvResult,expected_result);

    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClear.click();
    }


























//@Test(priority = 1, description = "sum of 2 numbers")
//public void doSum(){
//    CalcScreen calcScreen = new CalcScreen(driver);
//    String sum=calcScreen.doSum();
//    System.out.println(sum);
//
//}



}
