package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Johnny on 21/12/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class ClickMe extends Application{

    Button btn;
    Label lbl;
    int clickCount;

    @Override
    public void start(Stage primaryStage) {

        // Create the button
        btn = new Button("Click me please!");
        btn.setOnAction(e -> buttonClick());

        // Create the Label
        lbl = new Label("You have not clicked the button");

        // Add the label and the button to the layout pane
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        // Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick(){
        clickCount++;

        if(clickCount == 1)
            lbl.setText("You have clicked once");
        else lbl.setText("You have clicked " + clickCount + " times.");

//        if(btn.getText() == "Click me please!")
//            btn.setText("You clicked me!");
//        else
//            btn.setText("Click me please!");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
