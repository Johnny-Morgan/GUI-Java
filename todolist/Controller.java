package todolist;

import todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

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
    }

}
