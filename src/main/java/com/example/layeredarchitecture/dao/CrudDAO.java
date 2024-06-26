package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO {

    boolean save(T dto) throws SQLException, ClassNotFoundException ;

    boolean update(T dto) throws SQLException, ClassNotFoundException ;

    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    boolean delete(String id) throws SQLException, ClassNotFoundException ;

    boolean exist(String id) throws SQLException, ClassNotFoundException ;

    String genarateID() throws SQLException, ClassNotFoundException ;

    T search(String newValue) throws SQLException, ClassNotFoundException;

}
