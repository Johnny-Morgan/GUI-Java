package piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Piechart extends Application {

    private final ObservableList<PieChart.Data> details = FXCollections.observableArrayList();
    private BorderPane root;
    private javafx.scene.chart.PieChart pieChart;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Expenses Pie Chart");

        details.addAll(new javafx.scene.chart.PieChart.Data("Motor", 1440),
                    new javafx.scene.chart.PieChart.Data("Advertising", 1200),
                    new javafx.scene.chart.PieChart.Data("Stationary & Postage", 461),
                    new javafx.scene.chart.PieChart.Data("Telephone & Internet", 720),
                    new javafx.scene.chart.PieChart.Data("Heat & Light", 343),
                    new javafx.scene.chart.PieChart.Data("Meetings & Events", 755),
                    new javafx.scene.chart.PieChart.Data("Bank Charges", 300),
                    new javafx.scene.chart.PieChart.Data("Accountancy Fees", 489));

        pieChart = new javafx.scene.chart.PieChart();
        pieChart.setData(details);
        pieChart.setTitle("Business Expenses 2018");
        pieChart.setLegendSide(Side.BOTTOM);
        pieChart.setLabelsVisible(true);
        pieChart.setStartAngle(90);

        root = new BorderPane();
        root.setCenter(pieChart);

        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
