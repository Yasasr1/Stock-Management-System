/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

/**
 *
 * @author Yasas
 */
public class Item {
    String item_code;
    String type;
    String name;
    int quantity;
    String supplier;
    int reorder_level;
    float price;
    
    Item(String item_code,String type,String name,int quantity,String supplier,int reorder_level,float price)
    {
        this.item_code = item_code;
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
        this.reorder_level = reorder_level;
        this.price = price;
        
        
    }
    
    String getCode()
    {
        return this.item_code;
    }
    
    String getType()
    {
        return this.type;
    }
    
    String getName()
    {
        return this.name;
    }
    
    int getquantity()
    {
        return this.quantity;
    }
    
    String getSupplier()
    {
        return this.supplier;
    }
    
    int getReLevel()
    {
        return this.reorder_level;
    }
    
    float getUnPrice()
    {
        return this.price;
    }
    
    
    
}
