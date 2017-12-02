/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.swing.table.DefaultTableModel;

/**
 * FXML Controller class
 *
 * @author Bella Dwi Mardiana
 */
public class NotaController implements Initializable {
    @FXML
    private Label harga;
     @FXML
    private JFXTextField datatanggal;

    @FXML
    private JFXTextField datanama;

    @FXML
    private JFXTextField dataalamat;

    @FXML
    private JFXTextField datapesanan;

    @FXML
    private JFXTextField dataharga;
        @FXML
    private JFXTextField datalokasi;
    @FXML
    private Button btnok;
    @FXML
    private Button btnback;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void ok(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("pilih.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Pilih Menu");
            stage.show();
    }
    void setText(String Nama, String Alamat, String Tanggal, String Pesanan, String Lokasi, String Harga) {
        DataController tampil = new DataController();
        
        datanama.setText(Nama);
        dataalamat.setText(Alamat);
        datatanggal.setText(Tanggal);      
        datapesanan.setText(Pesanan);
        datalokasi.setText(Lokasi);
        dataharga.setText(Harga);
    }
    
    void setText(TextField namapemesan, TextField alamat, TextField tanggalpemesanan, TextField pesanan, TextField lokasi, TextField harga){
        throw new UnsupportedOperationException("Not Supported Yet.");
    }

    void data(String namapesanan1, String hargapesanan1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

