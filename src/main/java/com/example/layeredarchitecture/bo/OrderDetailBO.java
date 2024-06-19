package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailBO {

    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;


    public boolean updateOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;

    public ArrayList<OrderDetailDTO> getAllOrderDetail() throws SQLException, ClassNotFoundException ;

    public boolean deleteOrderDetail(String id) throws SQLException, ClassNotFoundException ;

    public boolean existOrderDetail(String id) throws SQLException, ClassNotFoundException ;

    public String genarateIDOrderDetail() throws SQLException, ClassNotFoundException ;

    public OrderDetailDTO searchOrderDetail(String newValue) throws SQLException, ClassNotFoundException ;

}
