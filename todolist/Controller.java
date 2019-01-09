package todolist;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy birthday card for Clare",
                LocalDate.of(2019, Month.JANUARY, 7));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "See Dr. Blake. Bring paperwork",
                LocalDate.of(2019, Month.JANUARY, 18));
        TodoItem item3 = new TodoItem("Finish data science project", "I promised Vinny draft by 29th January ",
                LocalDate.of(2019, Month.JANUARY, 29));
        TodoItem item4 = new TodoItem("Pickup Jim from airport", "Jim lands 23rd December at 4.15pm",
                LocalDate.of(2018, Month.DECEMBER, 23));
        TodoItem item5 = new TodoItem("Pickup dry cleaning", "Clothes should be ready by Wednesday",
                LocalDate.of(2019, Month.JANUARY, 2));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        // automatically select first item in list and display its details
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if(newValue != null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(dtf.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());
    }

}
