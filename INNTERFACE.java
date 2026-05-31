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
    private VBox signUpBox;
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
     Label logo = new Label("𝗧𝗘𝗔𝗠 𝗭𝗘𝗡𝗥𝗬𝗫");
        logo.setTextFill(Color.WHITE);
        logo.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        Label developerText = new Label(
                "𝗧𝗛𝗜𝗦 𝗜𝗡𝗧𝗘𝗥𝗙𝗔𝗖𝗘 𝗗𝗘𝗩𝗘𝗟𝗢𝗣𝗘𝗗 𝗕𝗬\n" +
                "𝗥𝗜𝗙𝗔𝗧 𝗡𝗢𝗪𝗦𝗛𝗜𝗡 𝗔𝗡𝗗 𝗡𝗢𝗡𝗗𝗜𝗡𝗜"
        );
        developerText.setTextFill(
                Color.rgb(255,255,255,0.75)
        );
        developerText.setFont(
                Font.font("Arial", FontWeight.BOLD, 15)
        );
        Label tagline = new Label(
                "𝗧𝗛𝗘 𝗕𝗘𝗦𝗧 𝗪𝗔𝗬 𝗧𝗢 𝗣𝗥𝗘𝗗𝗜𝗖𝗧\n" +
                "𝗧𝗛𝗘 𝗙𝗨𝗧𝗨𝗥𝗘 𝗜𝗦  𝗧𝗢 𝗖𝗥𝗘𝗔𝗧𝗘\n" +
                "𝗜𝗧 𝗬𝗢𝗨𝗥𝗦𝗘𝗟𝗙"
        );
        tagline.setTextFill(
                Color.rgb(255,255,255,0.85)
        );
        tagline.setFont(
                Font.font("Arial", FontWeight.BOLD, 15)
        );






























//NONDINI WILL START HER WORK AFTER THIS LINE:
signUpBox = new VBox(15);
        signUpBox.setAlignment(Pos.CENTER_LEFT);
        signUpBox.setMaxWidth(420);
        signUpBox.setVisible(false);

        Label signupTitle = new Label("𝗦𝗜𝗚𝗡 𝗨𝗣");
        signupTitle.setTextFill(Color.web("#00A8FF"));
        signupTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 32));

        TextField fullName = new TextField();
        fullName.setPromptText("𝗙𝗨𝗟𝗟 𝗡𝗔𝗠𝗘");
        styleField(fullName);

        TextField email = new TextField();
        email.setPromptText("𝗘-𝗠𝗔𝗜𝗟");
        styleField(email);

        TextField username = new TextField();
        username.setPromptText("𝗨𝗦𝗘𝗥 𝗡𝗔𝗠𝗘");
        styleField(username);

























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
     forgotDesc.setTextFill(Color.LIGHTGRAY);

        TextField forgotEmail = new TextField();
        forgotEmail.setPromptText("𝗘𝗡𝗧𝗘𝗥 𝗬𝗢𝗨𝗥 𝗘𝗠𝗔𝗜𝗟");
        styleField(forgotEmail);

        Button sendBtn = new Button("𝗦𝗘𝗡𝗗 𝗥𝗘𝗦𝗘𝗧 𝗟𝗜𝗡𝗞");
        styleButton(sendBtn);  
     sendBtn.setOnAction(e -> {
      Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("𝗥𝗘𝗦𝗘𝗧 𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗");
            alert.setHeaderText(null);
            alert.setContentText("𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗 𝗥𝗘𝗦𝗘𝗧 𝗟𝗜𝗡𝗞 𝗦𝗘𝗡𝗧!");
            alert.showAndWait();
        });
