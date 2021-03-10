package todoLy;

import controls.Button;
import controls.Control;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td[contains(.,'Add New Project') and @class='ProjItemContent']"));
    public Button addButton= new Button(By.xpath("//input[@id='NewProjNameButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//input[@id='NewProjNameInput']"));

    public Button clickUpdateProject = new Button(By.xpath("//li[last()]//td[contains(.,'CleanProject') and @class='ProjItemContent']"));
    public Button dropdown = new Button(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public Button editProject = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#edit']"));
    public TextBox nameTextBox= new TextBox(By.id("ItemEditTextbox"));
    public Control update = new Button(By.xpath("//li//div[@id='ProjectEditDiv']/*[@id=\"ItemEditSubmit\"]"));
    public Control updateVerify = new Control(By.xpath("//div[@id='CurrentProjectTitle']"));

    public Button clickDeleteProject = new Button(By.xpath("//li[last()]//td[contains(.,'CleanProject') and @class='ProjItemContent']"));
    public Button delete = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#delete']"));
    public Button deleteVerify = new Button(By.xpath("//div[@id=\"ProjectListPlaceHolder\"]//li[last()]"));

    public Button selectProjectCesar = new Button(By.xpath("//li//td[contains(.,'ProjectCesar') and @class='ProjItemContent']"));

    public LeftSection(){}
}
