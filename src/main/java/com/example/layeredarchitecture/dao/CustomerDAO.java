package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

     void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

     void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

     String genarateID() throws SQLException, ClassNotFoundException ;

     CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;

}
