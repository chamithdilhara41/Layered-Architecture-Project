package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    boolean existItem(String code) throws SQLException, ClassNotFoundException ;

    ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;

    String genarateId() throws SQLException, ClassNotFoundException ;

    ItemDTO searachItem(String newItemCode) throws SQLException, ClassNotFoundException;

    boolean update(ItemDTO item) throws SQLException, ClassNotFoundException;
}
