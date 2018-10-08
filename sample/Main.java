package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane leftGridPane = new GridPane();
        leftGridPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        leftGridPane.setPadding(new Insets(5));
        leftGridPane.setVgap(5);
        leftGridPane.setHgap(5);

        Label labelR = new Label("Opcje uruchamienia");
        leftGridPane.add(labelR, 0, 0);

        GridPane rightGridPane = new GridPane();
        rightGridPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        rightGridPane.setPadding(new Insets(5));
        rightGridPane.setVgap(5);
        rightGridPane.setHgap(5);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setMaxWidth(300);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setMaxWidth(300);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setMaxWidth(300);
        rightGridPane.getColumnConstraints().addAll(column1, column2, column3);

        Label labelL = new Label("Panel plików");
        rightGridPane.add(labelL, 0, 0);
        Label label1 = new Label("Źródło");
        rightGridPane.add(label1, 0, 1);
        Label label2 = new Label("Wynik");
        rightGridPane.add(label2, 0, 2);

        TextField text1 = new TextField();
        text1.setMaxWidth(100);
        rightGridPane.add(text1, 1, 1);
        TextField text2 = new TextField();
        text2.setMaxWidth(100);
        rightGridPane.add(text2, 1, 2);

        Button btn5 = new Button();
        btn5.setText("Przeglądaj...");
        rightGridPane.add(btn5, 2, 1);

        Button btn6 = new Button();
        btn6.setText("Przeglądaj...");
        rightGridPane.add(btn6, 2, 2);

        Button btn1 = new Button();
        btn1.setText("Uruchom przetwarza...");
        btn1.setDisable(true);
        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setVgrow(btn1, Priority.ALWAYS);
        leftGridPane.add(btn1, 0, 1);

        Button btn2 = new Button();
        btn2.setText("Pomoc");
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setVgrow(btn2, Priority.ALWAYS);
        leftGridPane.add(btn2, 0, 2);

        Button btn3 = new Button();
        btn3.setText("O programie");
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setVgrow(btn3, Priority.ALWAYS);
        leftGridPane.add(btn3, 0, 3);

        Button btn4 = new Button();
        btn4.setText("Zapisz i zakończ");
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setVgrow(btn4, Priority.ALWAYS);
        leftGridPane.add(btn4, 0, 4);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(leftGridPane);
        borderPane.setRight(rightGridPane);
        borderPane.setPadding(new Insets(5));
        borderPane.setMaxHeight(Double.MAX_VALUE);

        Scene scene = new Scene(borderPane, 485, 175);

        primaryStage.setTitle("Narzędzie przetwarzania plików");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
