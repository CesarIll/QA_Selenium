package itemTestClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSession.Session;
import todoLy.CenterSection;
import todoLy.LeftSection;
import todoLy.LoginModal;
import todoLy.MainPage;

public class CRUDItemTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_create_item_todoly() throws InterruptedException {
        String name="Item1";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.selectProjectCesar.click();
        centerSection.textBoxItem.clear();
        centerSection.textBoxItem.set(name);
        centerSection.addButton.click();

        Thread.sleep(2000);

        centerSection.options.click();
        centerSection.edit.click();
        centerSection.textBoxUpdate.clear();
        centerSection.textBoxUpdate.set("Update");
        centerSection.save.click();

        Thread.sleep(2000);

        centerSection.options.click();
        centerSection.delete.click();

        Thread.sleep(2000);
    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
