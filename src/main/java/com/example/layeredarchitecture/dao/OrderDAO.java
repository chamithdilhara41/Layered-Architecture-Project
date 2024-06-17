package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {

    String genarateNewOrderId() throws SQLException, ClassNotFoundException ;

    boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    boolean saveOrder(OrderDTO orderDTO) throws SQLException,ClassNotFoundException;
}
