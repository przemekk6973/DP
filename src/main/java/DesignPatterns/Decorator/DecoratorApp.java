package DesignPatterns.Decorator;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;


public class DecoratorApp extends Application {

    Stage stage;

    Group root;
    Scene scene;

    SquareShape square = new SquareShape();
    CircleShape circle = new CircleShape();
    TriangleShape triangle = new TriangleShape();

    BaseShape chosenShape = square;
    String chosenColor = "blue";
    String chosenStyle = "solid";

    void update(){
        BaseShape s;
        if(chosenColor == "red")
            s = new RedDecorator(chosenShape);
        else if(chosenColor == "green")
            s = new GreenDecorator(chosenShape);
        else
            s = new BlueDecorator(chosenShape);

        if(chosenStyle == "solid")
            s = new SolidLineDecorator(s);
        else if (chosenStyle == "dashed")
            s = new DashedLineDecorator(s);
        else
            s = new DottedLineDecorator(s);

        root.getChildren().remove(root.getChildren().size() - 1);
        root.getChildren().add(s.getShape());
    }

    @Override
    public void start(Stage primaryStage) {

        stage = primaryStage;
        root = new Group();
        initButtons();
        update();
        scene = new Scene(root, 600, 600);
        stage.setTitle("App");
        stage.setScene(scene);
        stage.show();

    }

    void initButtons(){

        Button squareButton = new Button("Square");
        squareButton.setOnAction(e -> {
            chosenShape = square;
            update();
        });
        squareButton.setLayoutX(170);
        squareButton.setLayoutY(550);

        Button circleButton = new Button("Circle");
        circleButton.setOnAction(e -> {
            chosenShape = circle;
            update();
        });
        circleButton.setLayoutX(270);
        circleButton.setLayoutY(550);

        Button triangleButton = new Button("Triangle");
        triangleButton.setOnAction(e -> {
            chosenShape = triangle;
            update();
        });
        triangleButton.setLayoutX(370);
        triangleButton.setLayoutY(550);

        Button redButton = new Button("Red");
        redButton.setOnAction(e -> {
            chosenColor = "red";
            update();
        });
        redButton.setLayoutX(170);
        redButton.setLayoutY(50);

        Button greenButton = new Button("Green");
        greenButton.setOnAction(e -> {
            chosenColor = "green";
            update();
        });
        greenButton.setLayoutX(270);
        greenButton.setLayoutY(50);

        Button blueButton = new Button("Blue");
        blueButton.setOnAction(e -> {
            chosenColor = "blue";
            update();
        });
        blueButton.setLayoutX(370);
        blueButton.setLayoutY(50);

        Button solidButton = new Button("Solid");
        solidButton.setOnAction(e -> {
            chosenStyle = "solid";
            update();
        });
        solidButton.setLayoutX(170);
        solidButton.setLayoutY(0);

        Button dottedButton = new Button("Dotted");
        dottedButton.setOnAction(e -> {
            chosenStyle = "dotted";
            update();
        });
        dottedButton.setLayoutX(370);
        dottedButton.setLayoutY(00);

        Button dashedButton = new Button("Dashed");
        dashedButton.setOnAction(e -> {
            chosenStyle = "dashed";
            update();
        });
        dashedButton.setLayoutX(270);
        dashedButton.setLayoutY(0);

        root.getChildren().addAll(circleButton, squareButton, triangleButton,
                redButton, greenButton, blueButton,
                solidButton, dottedButton, dashedButton,
                chosenShape.getShape());
    }

    public static void main(String[] args) {
        launch();
    }
}