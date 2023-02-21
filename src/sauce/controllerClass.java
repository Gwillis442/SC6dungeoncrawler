import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.geometry.Insets;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.scene.paint.ImagePattern;



import java.awt.*;

public class controllerClass {

    @FXML
    private Rectangle fred;
    @FXML
    private Button startBtn;
    @FXML
    private Rectangle gameScreen;

    private Image sprite = new Image("playerTestSprite.png");
    private Image dungImg = new Image("beansBowl.png");



    public void initialize(){
        fred.setFill(new ImagePattern(sprite));
        gameScreen.setFill(new ImagePattern(dungImg));

    }

//--------------------Move Button Methods
    public void moveUp(ActionEvent actionEvent) {
        fred.setTranslateY(fred.getTranslateY()-fred.getWidth());
    }
    public void moveDown(ActionEvent actionEvent) {
        fred.setTranslateY(fred.getTranslateY()+fred.getWidth());
    }
    public void moveLeft(ActionEvent actionEvent) {
        fred.setTranslateX(fred.getTranslateX()-fred.getWidth());
    }
    public void moveRight(ActionEvent actionEvent) {
        fred.setTranslateX(fred.getTranslateX()+fred.getWidth());
    }


}
