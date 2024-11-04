package org.help;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Alert at;
	public static JavascriptExecutor js;
	public static Robot r;
	public static FluentWait<WebDriver> f;
	public static Select s;
	public static File file;
	
	public static void openChrome() {
		driver=new ChromeDriver();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void urlTitle() {
		String title = driver.getTitle();
	}
	public static void closeBrowser() {
		driver.quit();

	}
	public static void findWebElement(WebElement element) {
		  driver.findElement(By.xpath("value"));

	}
	public static void passKeys(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void clickElement(WebElement element) {
		element.click();

	}
	public static void fetchText(WebElement element) {
		String text = element.getText();

	}
	public static void fetchAttribute(WebElement element,String name) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}
	public static void windowMaxi() {
		driver.manage().window().maximize();

	}
	
	
	public static void moveElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();

	}
	public static void toDragandDrop(WebElement element1,WebElement element2) {
		a=new Actions(driver);
		a.dragAndDrop(element1, element2).perform();

	}
	
	public static void toContextclick(WebElement element) {
		a=new Actions(driver);
		a.contextClick(element).perform();

	}
	public static void toAccept() {
		Alert at = driver.switchTo().alert();
		at.accept();

	}
	public static void toDismiss() {
		at.dismiss();

	}
	public static void toSendkeys(String value) {
		at.sendKeys(value);
	}
	public static void toGettext() {
		String text = at.getText();
	}
    public static void passValue(WebElement element,String text) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);

	}
	public static void buttonClick(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	public static void toScroll(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView()", element);

	}
	
	public static void toGetScreenshotAs(String location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File(location);
		f.createNewFile();
		FileUtils.copyFile(screenshotAs, f);
		}
	public static void togetWindowhandles(int index) {
		Set<String> id = driver.getWindowHandles();
		List<String>l=new ArrayList();
		l.addAll(id);
		driver.switchTo().window(l.get(index));
		}
	public static void switchToFrame(WebElement rname) {
		driver.switchTo().frame(rname);
		}
	public static void toPressEnter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	public void toPressTab() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
	public static void toCopy() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		}
	public static void toPaste() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		}
	public static void toCut() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		}
	public static void implicitWait(int millis) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));

	}
	    public static void isAlertPresent(int sec,int millis) {
		f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofMillis(millis)).ignoring(Exception.class);
	    at.accept();
	    }
	    public static void toClickElement(WebElement element,int sec,int millis) {
		f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofMillis(millis)).ignoring(Exception.class);
        element.click();
        }
	    public static void toSelectElement(WebElement element,int sec,int millis) {
	    f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofMillis(millis)).ignoring(Exception.class);
	    element.isSelected();
	    }
	    public static void containTitle(String title,int sec,int millis) {
		f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofMillis(millis)).ignoring(Exception.class);
        title.contains(title);
        }
	    public static void valueSelect(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
        }
	    public static void textSelect(WebElement element,String txt) {
			s=new Select(element);
			s.selectByVisibleText(txt);
			}
	    public static void indexSelect(WebElement element,int index) {
	    	s=new Select(element);
	    	s.selectByIndex(index);
	    	}
	    	
	    public static void selectMultiple(WebElement element) {
	    	s=new Select(element);
            boolean select = s.isMultiple();
            System.out.println("DropDown is Multiple"+select);
            }
	    public static void retrieveOptions(WebElement element,String options) {
	    	s=new Select(element);
	    	List<WebElement> option = s.getOptions();
	    	for (int i = 0; i < option.size(); i++) {
				System.out.println(option.get(i).getText());
			}
	    	}
	    public static void toGetAllSelectedOption(WebElement element,String options) {
			s=new Select(element);
			List<WebElement> allSelected = s.getAllSelectedOptions();
			for (int i = 0; i < allSelected.size(); i++) {
				System.out.println(allSelected.get(i).getText());
			}

		}
	    public static void toRefresh() {
			driver.navigate().refresh();

		}
	    public static void goBack() {
			driver.navigate().back();

		}
	    public void goForward() {
			driver.navigate().forward();
        }
	    public static String toGetDatafromExcel(String loc,String sheet,int i,int j) throws IOException {
	    	File f=new File(loc);
	    	FileInputStream fis=new FileInputStream(f);
	    	Workbook book=new XSSFWorkbook(fis);
	    	Sheet s = book.getSheet(sheet);
	    	Row r = s.getRow(i);
	    	Cell c = r.getCell(j);
	    	int type = c.getCellType();
	    	String data="";
	    	if (type==1) {
	    		data = c.getStringCellValue();
				}
	    	else if (DateUtil.isCellDateFormatted(c)) {
	    		Date d = c.getDateCellValue();
	    		SimpleDateFormat sim=new SimpleDateFormat("dd/mm/yyyy");
	    	    data = sim.format(d);
				}
	    	else {
				double d = c.getNumericCellValue();
				long l=(long)d;
				data = String.valueOf(l);
			}
	    	return data;
			

		}
	    public static void executeTime() {
			Date d=new Date();
			System.out.println(d);

		}
	    
	}
	



