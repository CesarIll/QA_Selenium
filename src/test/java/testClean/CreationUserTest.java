package testClean;

import org.junit.Test;
import todoist.LeftSection;
import todoist.MainPage;
import todoist.RegisterSection;
import todoist.SelectTheme;

public class CreationUserTest extends TestBaseTodoist {

    LeftSection leftSection= new LeftSection();
    MainPage mainPage = new MainPage();
    RegisterSection registerSection = new RegisterSection();
    SelectTheme selectTheme = new SelectTheme();
    String email="cesar@illanes.com";
    String name = "Cesar";
    String pwd="password";

    @Test
    public void verify_creation_project(){

        //Registro
        mainPage.registerButton.click();

        //Correo
        registerSection.email.set(email);
        registerSection.registerEmail.click();
        registerSection.name.set(name);
        registerSection.password.set(pwd);
        registerSection.register.click();

        //Tema
        selectTheme.selectTheme.click();

    }
}
