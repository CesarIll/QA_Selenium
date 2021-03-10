package todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));

    public TextBox textBoxItem = new TextBox(By.xpath("//td/textarea"));
    public Button addButton = new Button(By.xpath("//td/input[@id='NewItemAddButton']"));

    public Button options = new Button(By.xpath("//li[last()]//div/img[@class='ItemMenu' and @src='/Images/dropdown.png']"));
    public Button edit = new Button(By.xpath("//ul[@id='itemContextMenu']//a[contains(.,'Edit') and @href='#edit']"));
    public TextBox textBoxUpdate = new TextBox(By.id("ItemEditTextbox"));
    public Button save = new Button(By.xpath("//img[@src='/Images/save.png']"));

    public Button delete = new Button(By.xpath("//ul[@id='itemContextMenu']//a[contains(.,'Delete')]"));
    public CenterSection(){}
}
