package todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {

    public Button newProject = new Button(By.xpath("//*[@id=\"list_holder\"]/div[1]/div[1]/div/button"));
    public TextBox addNameProject = new TextBox(By.xpath("//*[@id=\"edit_project_modal_field_name\"]"));
    public Button addProject = new Button(By.xpath("//*[@id=\"reactist-modal-box-9\"]/form/footer/button[2]"));
}
