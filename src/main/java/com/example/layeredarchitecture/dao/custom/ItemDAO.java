package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public interface ItemDAO extends CrudDAO<ItemDTO> {
   /* ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    boolean existItem(String code) throws SQLException, ClassNotFoundException ;
*/
    ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;


    //String genarateId() throws SQLException, ClassNotFoundException ;

 //   ItemDTO searachItem(String newItemCode) throws SQLException, ClassNotFoundException;

  //  boolean update(ItemDTO item) throws SQLException, ClassNotFoundException;
}
