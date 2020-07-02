package praktikummodul5_basisdata;

import Database.Koneksi;
import View.*;
import java.sql.SQLException;
import Controller.controller;
import Model.*;

public class PraktikumModul5_BasisData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    new Login().show();
        //new prosesTransaksi().show();
    }
    
}
