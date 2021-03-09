package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Configs {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query = "select count(*) from swords";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "Andrey", "Andrey2003");

            stmt = con.createStatement();

            rs = stmt.executeQuery(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) { /*can't do anything */ }
        }
    }
    class sword{
        public void plusMoney(int money){

        }
    }
}