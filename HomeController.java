package Controllers;

import Collection.ItemMenu;
import com.jfoenix.controls.JFXDrawer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML ImageView CollageLogo;
    @FXML Canvas Graphic;
    @FXML Text SenoidalFunction;
    @FXML HBox StatusBar;
    @FXML VBox MainMenuBar;
    @FXML JFXDrawer GraphicController;

    private List<ItemMenu> itemList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            CollageLogo.setImage(new Image(getClass().getResourceAsStream("/Assets/Media/Pictures/Logo.jpg")));
            itemList = List.of(
                new ItemMenu(getClass().getResourceAsStream("/Assets/Media/Icons/Home_Icon.png"), "Home", 0),
                new ItemMenu(getClass().getResourceAsStream("/Assets/Media/Icons/Save_Icon.png"), "Save", 1));

            for (ItemMenu item: itemList) {
                item.setTextColor("#fff");
                item.setBackgroundColor("#233");
                MainMenuBar.getChildren().addAll(item.getItem());
            }
        } catch (IOException io){
            io.printStackTrace();
        }
    }
}
