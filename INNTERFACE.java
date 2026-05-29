// RIFAT WILL START HIS WORK AFTER THIS LINE:
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class INTERFACE extends Application {

    private VBox loginBox;
    private Label titleLabel;
    private Label descLabel;
    private VBox forgotBox;

@Override
public void start(Stage primaryStage) {
    HBox root = new HBox();
    root.setStyle("-fx-background-color: #1f1f1f;");
    VBox leftPanel = new VBox(20);
    leftPanel.setPrefWidth(320);
    leftPanel.setPadding(new Insets(40));
    leftPanel.setStyle(
            "-fx-background-color: linear-gradient(to bottom right, #00A8FF, #005CFF);" +
           "-fx-background-radius: 0;"
    );






























//NONDINI WILL START HER WORK AFTER THIS LINE:


























//NOWSHIN WILL START HER WORK AFTER THIS LINE:
    forgotBox = new VBox(20);
    forgotBox.setAlignment(Pos.CENTER_LEFT);
    forgotBox.setMaxWidth(420);
    forgotBox.setVisible(false);

    Label forgotTitle = new Label("𝗙𝗢𝗥𝗚𝗢𝗧 𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗");
    forgotTitle.setTextFill(Color.web("#00A8FF"));
    forgotTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 30));

     Label forgotDesc = new Label(
        "𝗘𝗡𝗧𝗘𝗥 𝗬𝗢𝗨𝗥 𝗘𝗠𝗔𝗜𝗟 𝗔𝗗𝗗𝗥𝗘𝗦𝗦\n𝗧𝗢 𝗥𝗘𝗦𝗘𝗧 𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗."
);
    
