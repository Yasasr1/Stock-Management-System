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
public class Log {
    String item_code;
    String quantity;
    String date;
    String isAdded;


Log(String code,String qu,String da,String added)
{
    this.item_code = code;
    this.quantity = qu;
    this.date = da;
    this.isAdded = added;
}

String getCode()
{
    return this.item_code;
}

String getQuantity()
{
    return this.quantity;
}

String getDate()
{
    return this.date;
}

String getAdded()
{
    return this.isAdded;
}


}