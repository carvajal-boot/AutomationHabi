package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class Driver {

	private static WebDriver driverSelenium = null;
	private static Logger logger = Logger.getLogger(Driver.class.getName());
	private static final String ESTATUSOFF = "FALSE";
	private static final String ESTATUSON = "TRUE";


	public WebDriver enLaPagina(String url) {
		getDriverSelenium().get(url);
		return getDriverSelenium();
	}

	public static void scrollBy(int valor) {
		JavascriptExecutor jse = (JavascriptExecutor) getDriverSelenium();
		jse.executeScript("window.scrollBy(0," + valor + ")");

	}

	public static void scrollByMenos() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriverSelenium();
		jse.executeScript("window.scrollBy(0,-90000)");

	}

	public static WebDriver getDriverSelenium() {
		return driverSelenium;
	}

	public static void setDriverSelenium(WebDriver driverSelenium) {
		Driver.driverSelenium = driverSelenium;
	}

}
