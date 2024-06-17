package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO {

    public String genarateNewOrderId() throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");*/

        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        if (rst.next()) {
            return rst.getString("oid");
        }

        return null;
    }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {

       /* PreparedStatement stm = DBConnection.getDbConnection().getConnection().prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);*/

        ResultSet stm = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?",orderId);

        return stm.next();
    }

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, dto.getOrderId());
        stm.setDate(2, Date.valueOf(dto.getOrderDate()));
        stm.setString(3, dto.getCustomerId());*/

        return SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",dto.getOrderId(),dto.getOrderDate(),dto.getCustomerId());
    }
}
