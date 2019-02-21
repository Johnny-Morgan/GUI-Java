package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import static java.time.temporal.ChronoUnit.*;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Controller {

    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private Label daysField;
    @FXML
    private Label hoursField;
    @FXML
    private Label minutesField;
    @FXML
    private Label secondsField;

    @FXML
    public void showAge(){

        DecimalFormat df = new DecimalFormat("#,###,###,###");

        LocalDate dob = dateOfBirth.getValue();
        LocalDate now = LocalDate.now();
        long noOfDays = dob.until(now, DAYS);

        daysField.setText("You are " + df.format(noOfDays) + " days old!");
        hoursField.setText("You are " + df.format(noOfDays * 24) + " hours old!");
        minutesField.setText("You are " + df.format(noOfDays * 24 * 60) + " minutes old!");
        secondsField.setText("You are " + df.format(noOfDays * 24 * 60 * 60) + " seconds old!");
    }
}
