package com.example.layeredarchitecture.bo.custom.Impl;


import com.example.layeredarchitecture.bo.custom.ItemBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.entity.Item;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        ArrayList<Item> Items = itemDAO.getAll();
        ArrayList<ItemDTO> ItemDTOs = new ArrayList<>();
        for (Item item : Items) {
            ItemDTOs.add(new ItemDTO(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand()));
        }
        return ItemDTOs;

    }

    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemDAO.save(new Item(itemDTO.getCode(),itemDTO.getDescription(),itemDTO.getUnitPrice(),itemDTO.getQtyOnHand()));
    }

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.delete(code);
    }

    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.exist(code);
    }

    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException {
        Item item = itemDAO.search(code);
        return new ItemDTO(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand());
        //return itemDAO.findItem(code);
    }

    public String genarateIDItem() throws SQLException, ClassNotFoundException {
        return itemDAO.genarateID();

    }

    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException {
       Item item = itemDAO.search(newItemCode);
       return new ItemDTO(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand());

    }

    public boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException {
       return itemDAO.update(new Item(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand()));
    }

}
