package it.polito.tdp.porto;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.porto.model.Model;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtIdCreator;

    @FXML
    private Insets x1;

    @FXML
    private Button btnCercaArticoli;

    @FXML
    private TextField txtIdArticolo;

    @FXML
    private Button btnCercaArticolo;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert txtIdCreator != null : "fx:id=\"txtIdCreator\" was not injected: check your FXML file 'peers.fxml'.";
        assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'peers.fxml'.";
        assert btnCercaArticoli != null : "fx:id=\"btnCercaArticoli\" was not injected: check your FXML file 'peers.fxml'.";
        assert txtIdArticolo != null : "fx:id=\"txtIdArticolo\" was not injected: check your FXML file 'peers.fxml'.";
        assert btnCercaArticolo != null : "fx:id=\"btnCercaArticolo\" was not injected: check your FXML file 'peers.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'peers.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
