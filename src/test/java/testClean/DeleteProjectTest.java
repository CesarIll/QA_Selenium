package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSession.Session;
import todoLy.CenterSection;
import todoLy.LeftSection;
import todoLy.LoginModal;
import todoLy.MainPage;

public class DeleteProjectTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_delete_project_todoly() throws InterruptedException {
        String name="CleanProject";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());

        leftSection.clickDeleteProject.click();
        leftSection.dropdown.click();
        leftSection.delete.click();
        Session.getSession().getDriver().switchTo().alert().accept();

        Thread.sleep(2000);
        Assert.assertFalse("Error en la eliminación", name.equals(leftSection.deleteVerify.getText()));

    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }

}
