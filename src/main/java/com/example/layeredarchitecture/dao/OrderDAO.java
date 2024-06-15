package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {

    String genarateNewOrderId() throws SQLException, ClassNotFoundException ;

    boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    int saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;
}
