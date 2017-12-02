/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bella Dwi Mardiana
 */
public class LoginController implements Initializable {

    @FXML
    private TextField username1;
    @FXML
    private TextField password1;
    @FXML
    private Button btnlogin;
    @FXML
    private Button btnsignup;
    private Component rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws IOException 
           {
         Connection connection;
    PreparedStatement ps;
    
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testkoneksi?zeroDateTimeBehavior=convertToNull","root","");
    ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE username = ? AND password = ?");
    ps.setString(1, username1.getText());
    ps.setString(2, password1.getText());
    ResultSet result = ps.executeQuery();
    if(result.next()){
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Benar!");
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Menu");
            stage.show();
        
              
    } else {
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Salah!");
        password1.setText("");
        username1.setText("");
        
    }
     
    
    }   catch (java.sql.SQLException ex) {
           javax.swing.JOptionPane.showMessageDialog(rootPane,"gagal");
        }      
    }   
    

    @FXML
    private void signup(ActionEvent event) {
     String username = username1.getText();
     String password = password1.getText();
     
     try{
         try (java.sql.Statement statement = (java.sql.Statement)file_koneksi.GetConnection().createStatement()) {
             statement.executeUpdate("INSERT INTO `tb_akun`(`username`, `password`) VALUES ('"+username+"','"+password+"');");
         }
      javax.swing.JOptionPane.showMessageDialog(null, "Selamat! Anda berhasil Sign Up");
         
     }  catch (Exception t){
         javax.swing.JOptionPane.showMessageDialog(null, "Mohon maaf, ulangi lagi prosedur");
       
     }  
    }
}
