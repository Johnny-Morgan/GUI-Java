import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneExample extends Application {

    public static void main(String[] args) {
      launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
		primaryStage.setTitle("Customer Information");
		
        Label label = new Label("We are open every day from Monday to Friday, 10am - 4pm.");
		
        TitledPane titledPane = new TitledPane("Store Opening Hours", label);

		VBox layout = new VBox(titledPane);
		
        Scene scene = new Scene(layout,390,120);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}