package week1.day2;
public class Browser {

   
    public void launchBrowser(String browserName) {
        System.out.println(browserName + " is launched successfully");
    }

   
    public void loadUrl() {
        System.out.println("URL is loaded successfully.");
    }

    public static void main(String[] args) {
       
        Browser browser = new Browser();

       
        browser.launchBrowser("Chrome");
        browser.loadUrl();
    }
}

