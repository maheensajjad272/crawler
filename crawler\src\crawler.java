import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crwaler {
           public static void main(String[] args) {
                    // TODO Auto-generated method stub
              WebDriver f=new FirefoxDriver(); {
             Driver.get("http://www.shophive.com");
               List<WebElement> linksofweb = Driver.findElements(By.tagName("a"));
                  



                for (WebElement myElement : linksofweb){
	         String linkofweb = myElement.getText(); 
	          
           
	        if (linkofweb !="") {


                
				java.util.List<WebElement> price = Driver.findElements(By
						.className("price-box"));
				java.util.List<WebElement> product = Driver.findElements(By
						.className("product-name"));



                            
				try {
					for (int b = 0; b <= product.size(); b++) {

						System.out.println( "Product_name = "
								+ product.get(b).getText() + "\nPrice_name= "
								+ price.get(b).getText());

					}
                                       System.out.println("invalid link");
                                       }
            }
	            
	          } 
		Driver.close();
	}

}


             

	
