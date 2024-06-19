package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.OrderBO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBOImpl implements OrderBO {

    OrderDAOImpl orderDAO = new OrderDAOImpl();

    public String genarateNewOrderId() throws SQLException, ClassNotFoundException {
        return orderDAO.genarateID();
    }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(orderId);
    }

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
       return orderDAO.save(dto);
    }


    public boolean updateOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public ArrayList<OrderDTO> getAllOrders() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean deleteOrder(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }

}
