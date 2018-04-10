package Collection;

import Controllers.ItemController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

import java.io.IOException;
import java.io.InputStream;

public class ItemMenu {
    private ItemController controller;
    private AnchorPane item;
    private int index;

    public ItemMenu(InputStream Image, String title, int index) throws IOException {
        var loader = new FXMLLoader();
        loader.load(getClass().getResource("/Assets/Item_Layout.fxml"));

        controller = loader.getController();
        item = loader.getRoot();
        controller.setImageStream(Image);
        controller.setTitle(title);
        this.index = index;
    }


    public void setTitle(String Title){
        controller.setTitle(Title);
    }

    public void setImage(InputStream Image){
        controller.setImageStream(Image);
    }

    public void setTextColor(String color) {
        controller.setTitleColor(Paint.valueOf(color));
    }

    public void setBackgroundColor(String color) { controller.setItemColor(color); }

    public void setIndex(int index){ this.index = index; }


    public String getTitle(){ return controller.getText(); }

    public AnchorPane getItem(){ return item; }

    public int getIndex() { return index; }
}
