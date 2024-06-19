package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBO {

    public String genarateNewOrderId() throws SQLException, ClassNotFoundException ;

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException ;


    public boolean updateOrder(OrderDTO dto) throws SQLException, ClassNotFoundException ;

    public ArrayList<OrderDTO> getAllOrders() throws SQLException, ClassNotFoundException ;

    public boolean deleteOrder(String id) throws SQLException, ClassNotFoundException ;

    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException ;

}
