/**
 * Sample Skeleton for 'Anagrammi.fxml' Controller Class
 */

package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Model;

public class AnagrammiController {
	
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnAnagramma"
    private Button btnAnagramma; // Value injected by FXMLLoader

    @FXML // fx:id="areaCorretta"
    private TextArea areaCorretta; // Value injected by FXMLLoader

    @FXML // fx:id="areaErrata"
    private TextArea areaErrata; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doAnagramma(ActionEvent event) {
    	String parola=txtParola.getText();
    	List<String> listaOK=model.getAnagrammiValidi(parola);
    	List<String> listaX=model.getAnagrammiInvalidi(parola);
    	
    	StringBuilder sbOK=new StringBuilder();
    	StringBuilder sbX=new StringBuilder();
    	
    	for(String s:listaOK)
    	{
    		sbOK.append(s);
    		sbOK.append("\n");
    	}
    	
    	areaCorretta.setText(sbOK.toString());
    	
    	for(String s:listaX)
    	{
    		sbX.append(s);
    		sbX.append("\n");
    	}
    	
    	areaErrata.setText(sbX.toString());
    	
    	
    	

    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	areaCorretta.clear();
    	areaErrata.clear();
    	txtParola.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnAnagramma != null : "fx:id=\"btnAnagramma\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert areaCorretta != null : "fx:id=\"areaCorretta\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert areaErrata != null : "fx:id=\"areaErrata\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
    
    public void setModel(Model model)
    {
    	this.model=model;
    }
}


