package masaSoftware.pages;

import masaSoftware.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasaSoftwarePage {

    public MasaSoftwarePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/company']")
    public WebElement companyButton;

    @FindBy(xpath = "//h2[.='Company']")
    public WebElement headerTitle;

    @FindBy(xpath = "//a[.=' Services ']")
    public WebElement servicesButton;

    @FindBy(xpath = "//h3[.='Consultancy']")
    public WebElement consultancySegment;

    @FindBy(xpath = "//i[@class='fa fa-globe']")
    public WebElement globeIcon;

    @FindBy(xpath = "//a[.=' Türkçe']")
    public WebElement turkceIcon;

    @FindBy(xpath = "//a[.='Hakkımızda']")
    public WebElement hakkimizdaTitle;


}
