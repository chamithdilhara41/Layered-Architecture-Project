package com.example.layeredarchitecture.bo.custom;


import com.example.layeredarchitecture.bo.ItemBO;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = new ItemDAOImpl();

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();

    }

    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemDAO.save(itemDTO);
    }

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.delete(code);
    }

    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.exist(code);
    }

    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.findItem(code);
    }

    public String genarateIDItem() throws SQLException, ClassNotFoundException {
        return itemDAO.genarateID();

    }

    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException {
       ItemDAO itemDAO = new ItemDAOImpl();
       return itemDAO.search(newItemCode);
    }

    public boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException {

       ItemDAO itemDAO = new ItemDAOImpl();
       return itemDAO.update(item);
    }

}
