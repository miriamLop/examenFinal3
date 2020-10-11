package testClean;


import activityContact.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ContactTest {
    MainActivity contactActivity = new MainActivity();

    @Test
    public void verifyAddContact() throws MalformedURLException {
      //los pasos necesarios para crear un nuevo contacto
        System.out.println("---Adicionando nuevo contacto----");
        String nombre="Raul";
        String apellido="Perez";

       contactActivity.createContact.click();
       contactActivity.nombreTxt.type(nombre);
       contactActivity.apellidoTxt.type(apellido);
       contactActivity.numeroTelefonoTxt.type("72589411");
        contactActivity.guardarContact.click();
        //concatenando el nombre y el apellido para que realice la verificacion en el despliegue

        String contactoBuscar=nombre+" "+apellido;

        // Verificacion
        Assert.assertTrue("ERROR, el contacto no esta creado",contactActivity.isDisplayedContact(contactoBuscar));
        System.out.println("contacto Creado: "+contactoBuscar);
    }
    @After
    public void after()throws MalformedURLException{
        System.out.println("Cerrando la aplicacion");
        Session.getInstance().closeSession();
    }
}
