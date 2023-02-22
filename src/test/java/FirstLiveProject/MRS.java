package FirstLiveProject;

import Utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MRS extends UtilityClass {
//    1- Go to "https://demo.openmrs.org/openmrs/login.htm".
//            2- Try to log in with username="Admin" and password="Admin123"
//    without choosing a location and verify that the error
//    message is "You must choose a location!".
//            3- Enter the same username and password.
//            4- Hover over the location names one by one and check if
//    the background color changes.
//            5- Choose one of the locations randomly and click on
//   "Log In" button.
//6- Click on the location icon
//7- Click on every location one by one and check if it is
//    among the locations on the login page and current location changes.
//8- Verify that admin button is displayed
//9- Hover over "Admin" button and verify that "My Account"
//    button is displayed.
//10- Click on "My Account" button and verify that the title of
//    the page is "My Account".
//            11- Click on "My Languages" button.
//12- Verify that the title of the page is "My Languages"
//            13- Select a random language from the drop down menu.
//14- Check and uncheck the boxes one by one. Verify
//    that the box is checked and unchecked each time.
//15- Check all of the boxes and verify that they are all checked
//16- Click on The "Save" button and verify error message is
//    displayed.
//
//            Note: Create a new project. Create your Utility class and add all the methods you need
//            including hard wait in case you need.
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");
        driver.findElement(By.id("loginButton")).click();
        WebElement errorMessage=driver.findElement(By.id("sessionLocationError"));
        System.out.println(errorMessage.getText());
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        //Inpatient Ward//Outpatient Clinic//Pharmacy//Isolation Ward//Laboratory//Registration Desk

        Thread.sleep(2000);


        driver.findElement(By.id("loginButton")).click();






    }
}
