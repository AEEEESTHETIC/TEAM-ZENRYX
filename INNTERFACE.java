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
         Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);
        titleLabel = new Label("LOGIN");
        titleLabel.setTextFill(Color.WHITE);
        titleLabel.setFont(
                Font.font("Arial", FontWeight.LIGHT, 42)
        );
        descLabel = new Label(
                "WELCOME BACK!\n" +
                "LOGIN WITH YOUR ACCOUNT."
        );
        descLabel.setTextFill(Color.WHITE);
        descLabel.setFont(
                Font.font("Arial", FontWeight.NORMAL, 16)
        );
        leftPanel.getChildren().addAll(
                logo,
                developerText,
                tagline,
                spacer,
                titleLabel,
                descLabel
        );
        StackPane rightPanel = new StackPane();
        rightPanel.setPadding(new Insets(40));
        rightPanel.setStyle(
                "-fx-background-color: #242424;" +
                "-fx-background-radius: 30 0 0 30;"
        );
        loginBox = new VBox(18);
        loginBox.setAlignment(Pos.CENTER_LEFT);
        loginBox.setMaxWidth(420);






























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
        PasswordField password = new PasswordField();
        password.setPromptText("𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗");
        styleField(password);

        CheckBox terms = new CheckBox(
                "𝗜 𝗔𝗖𝗖𝗘𝗣𝗧 𝗧𝗘𝗥𝗠𝗦 𝗔𝗡𝗗 𝗖𝗢𝗡𝗗𝗜𝗧𝗜𝗢𝗡𝗦"
        );
        terms.setTextFill(Color.WHITE);
        Button signupBtn = new Button("𝗖𝗥𝗘𝗔𝗧𝗘 𝗔𝗖𝗖𝗢𝗨𝗡𝗧");
        styleButton(signupBtn);
























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
      Hyperlink backLogin = new Hyperlink("←𝗕𝗔𝗖𝗞 𝗧𝗢 𝗟𝗢𝗚𝗜𝗡");
        backLogin.setStyle("-fx-text-fill: #00A8FF;");
        forgotBox.getChildren().addAll(
                forgotTitle,
                forgotDesc,
                forgotEmail,
                sendBtn,
                backLogin
        );
        createLink.setOnAction(e -> {
            loginBox.setVisible(false);
            forgotBox.setVisible(false);
            signUpBox.setVisible(true);
            fadeIn(signUpBox);
            titleLabel.setText("𝗖𝗥𝗘𝗔𝗧𝗘\n𝗔𝗖𝗖𝗢𝗨𝗡𝗧");
            descLabel.setText(
                    "𝗖𝗥𝗘𝗔𝗧𝗘 𝗬𝗢𝗨𝗥 𝗡𝗘𝗪 𝗔𝗖𝗖𝗢𝗨𝗡𝗧\n𝗔𝗡𝗗 𝗦𝗧𝗔𝗥𝗧 𝗨𝗦𝗜𝗡𝗚 𝗧𝗛𝗘 𝗦𝗬𝗦𝗧𝗘𝗠."
            );
        });
        loginLink.setOnAction(e -> {
            signUpBox.setVisible(false);
            forgotBox.setVisible(false);
            loginBox.setVisible(true);
            fadeIn(loginBox);
            titleLabel.setText("𝗟𝗢𝗚𝗜𝗡");
            descLabel.setText(
                    "𝗪𝗘𝗟𝗖𝗢𝗠𝗘 𝗕𝗔𝗖𝗞!\n𝗟𝗢𝗚𝗜𝗡 𝗪𝗜𝗧𝗛 𝗬𝗢𝗨𝗥 𝗔𝗖𝗖𝗢𝗨𝗡𝗧."
            );
        });
        forgotLink.setOnAction(e -> {
            loginBox.setVisible(false);
            signUpBox.setVisible(false);
            forgotBox.setVisible(true);
            fadeIn(forgotBox);
            titleLabel.setText("𝗙𝗢𝗥𝗚𝗢𝗧\n𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗");
            descLabel.setText(
                    "𝗥𝗘𝗦𝗘𝗧 𝗬𝗢𝗨𝗥 𝗣𝗔𝗦𝗦𝗪𝗢𝗥𝗗\n𝗔𝗡𝗗 𝗥𝗘𝗖𝗢𝗩𝗘𝗥 𝗬𝗢𝗨𝗥 𝗔𝗖𝗖𝗢𝗨𝗡𝗧."
            );
        });
