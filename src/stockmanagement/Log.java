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
    private String item_code;
    private String quantity;
    private String date;
    private String isAdded;


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