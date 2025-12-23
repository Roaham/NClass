import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cashflow2 extends Application {
    
    public void start(Stage stage) {
        HBox topBar = new HBox(10,
            new Button("Profit"),
            new Button("Incomes"),
            new Button("Expenses")
        );
        topBar.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 5;");

        VBox root = new VBox(topBar);
        root.setStyle("-fx-background-color: white; -fx-pref-height: 700;");

        // Efecto hover
        topBar.setOnMouseEntered(e ->
            topBar.setStyle("-fx-background-color: #dde0ff; -fx-padding: 15;")
        );
        topBar.setOnMouseExited(e ->
            topBar.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 5;")
        );

        Scene scene = new Scene(root, 1000, 700);
        stage.setTitle("Cashflow");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
