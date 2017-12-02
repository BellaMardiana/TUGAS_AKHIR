/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bella Dwi Mardiana
 */
public class PilihController implements Initializable {

    @FXML
    private Button btnbeli1;
    @FXML
    private Button btnbeli2;
    @FXML
    private Button btnbeli3;
    @FXML
    private Button btnbeli4;
    @FXML
    private Button btnbeli5;
    @FXML
    private Button btnbeli6;
    @FXML
    private Button btnbeli7;
    @FXML
    private Button btnbeli8;
    @FXML
    private Button btnback;
    @FXML
    private Button btnkeluar;
    
    String pesanann, lokasii, hargaa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void beli1(ActionEvent event) throws IOException {
        pesanann="Kepiting";
        lokasii="Jl. Soekarno Hatta 07C";
        hargaa="50000";
        ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli2(ActionEvent event) throws IOException {
        pesanann="Ayam Mozarella";
        lokasii="Jl. Panderman No.2";
        hargaa="50000";
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann,lokasii, hargaa);
    }

    @FXML
    private void beli3(ActionEvent event) throws IOException {
        pesanann="Spaghetti Mozarella";
        lokasii="Jl. Panderman No.2";
        hargaa="50000";
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli4(ActionEvent event) throws IOException {
        pesanann="Soto Betawi";
        lokasii="Jl. Permata Savira";
        hargaa="50000";
                ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli5(ActionEvent event) throws IOException {
        pesanann="Thai Green Tea";
        lokasii="Jl. Surabaya No.12";
        hargaa="50000";
                ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli6(ActionEvent event) throws IOException {
        pesanann="Coffe With Milk";
        lokasii="Jl. Jakarta No.26";
        hargaa="50000";
                ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli7(ActionEvent event) throws IOException {
        pesanann="Mojitos";
        lokasii="Jl. Brigjen Katamso";
        hargaa="50000";
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void beli8(ActionEvent event) throws IOException {
        pesanann="Es Teler Durian";
        lokasii="Jl.Hamid Rusdi No.9";
        hargaa="50000";
                ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("data.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Data Pemesanan");
            stage.show();
            
            DataController Data = new DataController();
            Data = fxmlLoader.getController();
            
            Data.setText(pesanann, lokasii, hargaa);
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Menu");
            stage.show();
    }

    @FXML
    private void keluar(ActionEvent event) {
        System.exit(0);
    }
    
}
