package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;

    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;

    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;

    public String genarateIDItem() throws SQLException, ClassNotFoundException ;

    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException ;

}
