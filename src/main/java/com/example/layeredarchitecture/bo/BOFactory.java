package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.Impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.Impl.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.Impl.PurchaseOrderBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory() {}

    public static BOFactory getBoFactory() {
        return (boFactory==null) ? boFactory = new BOFactory():boFactory;
    }
    public enum BOTypes{
        CUSTOMER,ITEM,PURCHASE
    }

    public SuperBO getBO(BOTypes boTypes) {

        switch (boTypes) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PURCHASE:
                return new PurchaseOrderBOImpl();
            default:
                return null;
        }

    }
}
