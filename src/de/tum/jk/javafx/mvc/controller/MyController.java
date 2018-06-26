package de.tum.jk.javafx.mvc.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import de.tum.jk.javafx.mvc.model.Counter;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class MyController implements Initializable {

	@FXML
	Button countButton;
	@FXML
	TextField countField;

	Counter c;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		c = new Counter();
	}

	public void onCountBtnClicked(MouseEvent e) {
		countField.setText(c.getCount() + "");
		c.increaseCount();
	}
}
