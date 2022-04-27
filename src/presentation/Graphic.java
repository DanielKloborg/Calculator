package presentation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.CalculatorImpl;

public class Graphic extends Application{
	
	CalculatorImpl calc = new CalculatorImpl();
	Stage window;
	Scene scene;
	int choice;
	double result;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Title");
		
		//Result setup
		HBox textResult = new HBox();
		Text text = new Text(); 
		text.setStyle("-fx-font: 24 arial;");
		
		//Menu
		HBox choiceMenu = new HBox();
		
		Button btnplus = new Button("+");
		btnplus.setOnAction(e -> choice = 1);
		
		Button btnminus = new Button("-");
		btnminus.setOnAction(e -> choice = 2);
		
		Button btnmulti = new Button("*");
		btnmulti.setOnAction(e -> choice = 3);
		
		Button btndiv = new Button("/");
		btndiv.setOnAction(e -> choice = 4);
		
		Button btnsquareroot = new Button("Squareroot");
		btnsquareroot.setOnAction(e -> choice = 5);
		
		Button btnpowerof = new Button("^");
		btnpowerof.setOnAction(e -> choice = 6);
		
		Button btncos = new Button("Cos");
		btncos.setOnAction(e -> choice = 7);
		
		Button btnsin = new Button("Sin");
		btnsin.setOnAction(e -> choice = 8);
		
		choiceMenu.getChildren().addAll(btnplus,btnminus,btnmulti,btndiv,btnsquareroot,btnpowerof,btncos,btnsin);
		
		//Input
		TextField numberInput1 = new TextField();
		TextField numberInput2 = new TextField();
		
		//Result
		Button btnresult = new Button ("Result");
		btnresult.setOnAction(e -> {
			
			validation(numberInput1,numberInput2);
			
			double number1 = Double.parseDouble(numberInput1.getText());
			double number2 = Double.parseDouble(numberInput2.getText());
			
			if (choice == 1) {
				result = calc.add(number1,number2);
			}
			if (choice == 2) {
				result = calc.sub(number1,number2);
			}
			if (choice == 3) {
				result = calc.multi(number1,number2);
			}
			if (choice == 4) {
				result = calc.div(number1,number2);
			}
			if (choice == 5) {
				result = calc.squareroot(number1);
			}
			if (choice == 6) {
				result = calc.powerof(number1,number2);
			}
			if (choice == 7) {
				result = calc.cos(number1);
			}
			if (choice == 8) {
				result = calc.sin(number1);
			}
			else {    
			    text.setText("Error");
			}   
		    text.setText(Double.toString(result));
		});
		
		//Layout
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(text,choiceMenu,numberInput1,numberInput2,btnresult);
		
		scene = new Scene(layout,300,250);
		window.setTitle("Calculator");
		window.setScene(scene);
		window.show();
	}
	
	private boolean validation(TextField numberInput1,TextField numberInput2){
		try {
			Double.parseDouble(numberInput1.getText()); 
			Double.parseDouble(numberInput2.getText()); 
			return true;
			}
		catch(NumberFormatException e){
			System.out.println("ERROR");
			return false;
		}
	}
}