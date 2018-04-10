package Controllers;

import com.jfoenix.controls.JFXRippler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.io.InputStream;

public class ItemController{
    @FXML JFXRippler ClickEffect;
    @FXML AnchorPane Item;
    @FXML ImageView ImageIcon;
    @FXML Text Title;


    public void setImageStream(InputStream file){ ImageIcon.setImage(new Image(file)); }

    public void setTitle(String str) { Title.setText(str); }

    public void setItemColor(String color) { Item.setStyle("-fx-background-color: " + color + ";");}

    public void setTitleColor(Paint color){ Title.setFill(color); }

    public String getText(){ return Title.getText(); }
}
