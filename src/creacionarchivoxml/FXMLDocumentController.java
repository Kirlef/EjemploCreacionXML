/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivoxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Estudiante;
/**
 *
 * @author mauricio_andres.diaz
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextField nombret; 
    @FXML
    private TextField codigot; 
    @FXML
    private TextField telefonot; 
    @FXML
    private TextField carrerat; 
    @FXML
    private TextField correot; 
    
    
    LinkedList<Estudiante> listaE;
    
    @FXML
    private void agregar(ActionEvent event) {
        
        String codigo = codigot.getText();        
        String carrera = carrerat.getText();
        String nombre = nombret.getText();
        String telefono = telefonot.getText();
        String correo = correot.getText();
        
        Estudiante objE =new Estudiante (codigo,carrera,nombre,telefono,correo);
        listaE.add(objE);
                
    }
    
     @FXML
    private void guardarXML(ActionEvent event) {
        Estudiante objV = new Estudiante();
        boolean guardar =objV.crearArchivoXML(listaE);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      listaE= new LinkedList<>();
    }    
    
}
