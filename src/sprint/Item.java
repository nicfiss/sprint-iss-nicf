/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

/**
 *
 * @author issuser
 */
public class Item {
    public int ID;
    public String description;
    public int Priority;
    public long Date;
    public int Status;
    
    public Item(int id,String description, int priority, long date, int status){
        this.ID = id;
        this.description = description;
        this.Priority = priority;
        this.Date = date;
        this.Status = status;
    }
    
    public long getDate()
    {
        return this.Date;
        
    }
    
    public int getPriority()
    {
        return this.Priority;
        
    }
    
}
