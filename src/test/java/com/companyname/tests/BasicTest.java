package com.companyname.tests;

import com.companyname.pages.BasicPage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicTest extends BaseTest{


    @Test(enabled = true)
    public void loadGoogleAndType() {
//        System.setProperty("webdriver.edge.driver", "C:\\GIT-Workspaces\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
        BasicPage basicPage = new BasicPage(driver);
       // driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        //basicPage.clickDontSwitchButton();
        basicPage.typeGoogleTextBox("Hi");

       // System.out.println("Running Java version: " + System.getProperty("java.version"));
    }
/**
    @Test(enabled = false)
    public void sort()
    {
        int [] Num = {4,5,2,6,1};
        for(int i=0; i<Num.length; i++)
        {
            for(int j=i+1; j<Num.length; j++)
            {
                if(Num[i] > Num[j])
                {
                    int temp = Num[i];
                    Num[i] = Num[j];
                    Num[j] = temp;
                }
            }
            System.out.println(Num[i]);
        }
        //System.out.println(Num[1]);
    }
    **/
//@Test(enabled = false)
//    public List<String> printListOfNames()
//    {
//        By names = By.xpath("");
//        List<String> listOfNames = new ArrayList<>();
//
//        for(WebElement element : getElements(names))
//        {
//            listOfNames.add(element.getText());
//        }
//
//        return listOfNames;
//    }

/**
    @Test(enabled = false)
    public void removeDuplicates()
    {
        int [] numbers = {1,1,1,4,4,5,7,2,3,2,2};
        int [] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;

        for(int i=0; i<numbers.length; i++)
        {
            boolean isDuplicate = false;

            for(int j = 0; j < uniqueCount; j++)
            {
                if(numbers[i] == uniqueNumbers[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }
        int[] results = Arrays.copyOf(uniqueNumbers, uniqueCount);

        System.out.println("Numbers without duplicates: "+Arrays.toString(results));
    }
    **/


}
