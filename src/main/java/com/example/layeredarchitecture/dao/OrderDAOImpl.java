package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public class OrderDAOImpl implements OrderDAO {

    public String genarateNewOrderId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        if (rst.next()) {
            return rst.getString("oid");
        }

        return null;
    }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {

        PreparedStatement stm = DBConnection.getDbConnection().getConnection().prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);

        return stm.executeQuery().next();
    }

    public int saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {

        PreparedStatement stm = DBConnection.getDbConnection().getConnection().prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, orderId);
        stm.setDate(2, Date.valueOf(orderDate));
        stm.setString(3, customerId);

        return stm.executeUpdate();
    }
}
