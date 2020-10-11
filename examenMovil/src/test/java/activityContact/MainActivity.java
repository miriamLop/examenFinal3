package activityContact;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {
    public Button createContact;
    public TextBox nombreTxt;
    public TextBox apellidoTxt;
    public TextBox numeroTelefonoTxt;
    public Button guardarContact;

    //constructor

    public MainActivity() {

        createContact=new Button(By.id("com.simplemobiletools.contacts:id/fragment_fab"));
        nombreTxt=new TextBox(By.id("com.simplemobiletools.contacts:id/contact_first_name"));
        apellidoTxt=new TextBox(By.id("com.simplemobiletools.contacts:id/contact_surname"));
        numeroTelefonoTxt=new TextBox(By.id("com.simplemobiletools.contacts:id/contact_number"));
        guardarContact=new Button(By.id("com.simplemobiletools.contacts:id/save"));

    }
    //ver si se despliega el contacto creado
    public boolean isDisplayedContact(String contacto)  {

        String locator="//android.widget.TextView[@text='"+contacto+"']";
        Label addContact = new Label(By.xpath(locator));
        return addContact.isDisplayed();
    }


}
