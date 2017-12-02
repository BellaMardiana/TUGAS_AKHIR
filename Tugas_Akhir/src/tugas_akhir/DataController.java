/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;


/**
 * FXML Controller class
 *
 * @author Bella Dwi Mardiana
 */
public class DataController implements Initializable {

    @FXML
    private Label harga;
    @FXML
    private DatePicker btntanggalpemesanan;
    @FXML
    private TextField btnnamapemesan;
    @FXML
    private TextField btnpesanan;
    @FXML
    private TextField btnharga;
    @FXML
    private TextField btnalamat;
        @FXML
    private TextField btnlokasi;

    @FXML
    private Button btnback;
    @FXML
    private Button btnkeluar;
    @FXML
    private Button btnsimpan;
    @FXML
    private Button btnbersihkan;


    String Nama, Pesanan, Lokasi, Harga, Alamat, Tanggal;
    private Component rootPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // To Do
    }    
    @FXML
    private void tanggalpemesanan(ActionEvent event) {
    }

    @FXML
    private void namapemesan(ActionEvent event) {
    }

    @FXML
    private void pesanan(ActionEvent event) {
    }

    @FXML
    private void harga(ActionEvent event) {
    }
        @FXML
    void lokasi(ActionEvent event) {

    }


    @FXML
    private void alamat(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("pilih.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("PILIH MENU");
            stage.show();
    }

    @FXML
    private void keluar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void simpan(ActionEvent event) throws IOException {
        try{
            
           
        
        if(btntanggalpemesanan.getValue().toString().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Tanggal Pemesanan !");
        }
    
    else if(btnnamapemesan.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Nama Pemesan !");
        }
    else if(btnpesanan.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Pesanan !");
        }
        else if(btnlokasi.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Lokasi !");
        }
    else if(btnharga.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Harga !");
        }
    else if(btnalamat.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Inputkan Alamat !" );
        }
    
    else {
        Nama = btnnamapemesan.getText();
        Pesanan = btnpesanan.getText();
        Lokasi = btnlokasi.getText();
        Harga = btnharga.getText();
        Alamat = btnalamat.getText();
        Tanggal = btntanggalpemesanan.getValue().toString();
        
        ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("nota.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Nota");
            stage.show();
            
            NotaController Data = new NotaController();
            Data = fxmlLoader.getController();
            
            Data.setText(Nama, Alamat, Tanggal, Pesanan, Lokasi, Harga);
        }
    }
         
        catch (IOException e) {
           javax.swing.JOptionPane.showMessageDialog(null,"gagal");
        }      
    }

    @FXML
    private void bersihkan(ActionEvent event) {
        btnnamapemesan.setText("");

        btnalamat.setText("");
    }
    void setText(String pesanann, String lokasii, String hargaa) {
        DataController tampil = new DataController();
        
        btnpesanan.setText(pesanann);
        btnlokasi.setText(lokasii);
        btnharga.setText(hargaa);
    }
    
}
