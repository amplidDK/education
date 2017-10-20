import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Main extends Application {
    private Fibonacci fibb;


    private int input;
    private Label askLabel;
    private TextField inputField;
    private Label answerLabel;
    private Button sendButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("FibboFinder");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        askLabel = new Label("Enter the number");
        inputField = new TextField();
        answerLabel = new Label();
        sendButton = new Button("Find");


        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input = Integer.parseInt(inputField.getText());

                long result=new Fibonacci().getFibb(input);

                answerLabel.setText("You number is " + result);

            }
        });



        root.setTopAnchor(askLabel, 10.0);
        root.setLeftAnchor(askLabel, 10.0);

        root.setRightAnchor(inputField, 10.0);
        root.setTopAnchor(inputField, 10.0);

        root.setBottomAnchor(sendButton, 10.0);
        root.setRightAnchor(sendButton, 145.0);

        root.setBottomAnchor(answerLabel, 75.0);
        root.setLeftAnchor(answerLabel, 10.0);



        root.getChildren().addAll(askLabel,inputField,answerLabel,sendButton);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}