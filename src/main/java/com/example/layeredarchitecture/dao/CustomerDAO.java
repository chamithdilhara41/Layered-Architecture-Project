package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

     boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

     boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

     String genarateID() throws SQLException, ClassNotFoundException ;

     CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;

}
