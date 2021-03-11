package todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
    public TextBox email = new TextBox(By.xpath("//*[@id=\"email\"]"));
    public Button registerEmail = new Button(By.xpath("//*[@id=\"step_one_submit\"]"));
    public TextBox name = new TextBox(By.xpath("//*[@id=\"full_name\"]"));
    public TextBox password = new TextBox(By.xpath("//*[@id=\"pwd\"]"));
    public Button register = new Button(By.xpath("//*[@id=\"step_two_submit\"]"));
}
