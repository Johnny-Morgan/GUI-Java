import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Created by Johnny on 08/02/2019
 * Program to show tabs
 */

public class Tabs extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage s) throws Exception{
        TabPane layout = new TabPane();

        Tab tab1 = new Tab("Write");
        TextArea ta = new TextArea();
        tab1.setContent(ta);

        layout.getTabs().add(tab1);

        Tab tab2 = new Tab("Read");
        Label l = new Label();
        l.textProperty().bind(ta.textProperty());
        tab2.setContent(l);

        layout.getTabs().add(tab2);

        Scene scene = new Scene(layout);
        s.setScene(scene);
        s.show();
    }
}
