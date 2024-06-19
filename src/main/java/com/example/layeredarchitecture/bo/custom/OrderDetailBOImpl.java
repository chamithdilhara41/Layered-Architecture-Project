package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.OrderDetailBO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailBOImpl implements OrderDetailBO {

    OrderDetailDAOImpl orderDetailDAO = new OrderDetailDAOImpl();

    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailDAO.save(dto);

    }




    public boolean updateOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public ArrayList<OrderDetailDTO> getAllOrderDetail() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean deleteOrderDetail(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean existOrderDetail(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public String genarateIDOrderDetail() throws SQLException, ClassNotFoundException {
        return "";
    }

    public OrderDetailDTO searchOrderDetail(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }

}
