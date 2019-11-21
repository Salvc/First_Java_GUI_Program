import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.geometry.Insets;


import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.scene.image.Image;

import java.io.File;

public class Main extends Application {

    public void start(Stage stage) {

    //set 1

        stage.setTitle("Hi it is I, DOGMAN");
        Label myLabel = new Label("Spoo");
        Label myLabel1 = new Label("Yes?");
        Button myButton = new Button("n");
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                myLabel.setText("Spoon");


            }
        });
        //Label myLabel2 = new Label("oon");

        VBox leftVBox = new VBox();
        // Configure padding and spacing of controls in this VBox
        leftVBox.setPadding(new Insets(10)); // Set all sides' padding to 10
        leftVBox.setSpacing(8);// Gap between nodes

        // Add the 2 links to the VBox
        addLinks(leftVBox);




        File imageFile = new File("image/HalfHeartBoy.png");
        Image image = new Image(imageFile.toURI().toString());

        File imageFile1 = new File("image/HeartBoy.png");
        Image image1 = new Image(imageFile1.toURI().toString());

        File imageFile2 = new File("image/BarkyBoy.png");
        Image image2 = new Image(imageFile2.toURI().toString());

        File imageFile3 = new File("image/EarthBoy.png");
        Image image3 = new Image(imageFile3.toURI().toString());

        File imageFile4 = new File("image/SkelyBlade.png");
        Image image4 = new Image(imageFile4.toURI().toString());

        ImageView myImage = new ImageView( image);
        CheckBox myCheckBox = new CheckBox("Correct Transformation?");
        myCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open Resource File");

                File selectedFile = fileChooser.showOpenDialog(stage);
                Image image100 = new Image(selectedFile.toURI().toString());
                if (selectedFile != null) {
                    myImage.setImage(image100);

                }
            }
        });


        leftVBox.getChildren().add(myImage);
        leftVBox.getChildren().add(myCheckBox);

        //ToggleButton
        ToggleButton myToggleButton = new ToggleButton("Half Heart?");
        myToggleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                myLabel.setText("Stai");

                myImage.setImage(image);

            }
        });
        ToggleButton myToggleButton1 = new ToggleButton("Full Heart?");
        myToggleButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                myImage.setImage(image1);
            }
        });
        ToggleButton myToggleButton2 = new ToggleButton("BarkyBoy");
        myToggleButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                myImage.setImage(image2);

            }
        });
        ToggleButton myToggleButton3 = new ToggleButton("Earth?");
        myToggleButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                myImage.setImage(image3);

            }
        });
        ToggleButton myToggleButton4 = new ToggleButton("Blade?");
        myToggleButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                myImage.setImage(image4);



            }
        });

ToggleGroup group = new ToggleGroup();
myToggleButton.setToggleGroup(group);
myToggleButton1.setToggleGroup(group);
myToggleButton2.setToggleGroup(group);
myToggleButton3.setToggleGroup(group);
myToggleButton4.setToggleGroup(group);




        //Hboxes

        HBox myHBox = new HBox();
        myHBox.getChildren().add(leftVBox);
        myHBox.getChildren().add(myLabel);
        myHBox.getChildren().add(myButton);
        myHBox.getChildren().add(myToggleButton);
        myHBox.getChildren().add(myToggleButton1);
        myHBox.getChildren().add(myToggleButton2);
        myHBox.getChildren().add(myToggleButton3);
        myHBox.getChildren().add(myToggleButton4);

//Vboxes




        Scene scene = new Scene(myHBox, 8000, 2000 );
        stage.setScene(scene);
        stage.show();
    }

    public void addLinks(VBox vbox){
        Text title = new Text("Videos");
        title.setFont(Font.font("ComicSans", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);

        Hyperlink options[] = new Hyperlink[]{

                new Hyperlink("Important Video"),
                new Hyperlink("Less Important Video")};


        for (int i=0; i < options.length; i++) {
            // Add offset to left side to indent from title
            VBox.setMargin(options[i], new Insets(0, 0, 0, 8));
            vbox.getChildren().add(options[i]);
        }

    }


}
