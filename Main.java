package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox(500);
        HBox h1 = new HBox(10);
        Label lb1 = new Label("Izabrati nacin igranja igre:");
        lb1.setFont(Font.font("Arial" , 20));
        lb1.setTextFill(Color.BLUEVIOLET);
        Button btn1 = new Button("Korisnik");
        btn1.setTextFill(Color.BLUEVIOLET);
        Button btn2 = new Button("Kompjuter");
        btn2.setTextFill(Color.BLUEVIOLET);
        HBox h2 = new HBox(300);
        h1.setStyle("-fx-background-color: #d1d1e0;");
        root.setStyle("-fx-background-color: #d1d1e0;");
        VBox v3=new VBox();
        v3.setStyle("-fx-background-color: #d1d1e0;");


        h1.getChildren().addAll(btn1, btn2);
        h1.setAlignment(Pos.BASELINE_CENTER);
        v3.getChildren().addAll(lb1,h1);
        v3.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(v3,h2);
        root.setAlignment(Pos.BASELINE_CENTER);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Minesweeper: Generate&Solve");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
