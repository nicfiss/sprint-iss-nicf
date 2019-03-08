/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author issuser
 */
public class doList {  
   
    public ArrayList<Item> item;
    
    public doList(){
        System.out.println("Create List");
        item = new ArrayList<Item>();
    }
    
    public void addItem(Item i)
    {
      this.item.add(i);
    }
    public void removeItem(int selection)
    {
      	for (Item s : item){
            if (s.ID == selection)
            {
                this.item.remove(s);
                break;
            }
	}
    } 
    public void sortbyDate()
    {
        this.item.sort(Comparator.comparingLong(Item::getDate));
        
              
    } 
    public void sortbyPriority()
    {
        this.item.sort(Comparator.comparingInt(Item::getPriority));
    }
   
    public void editItemDescriptiom(int itemId,String newDescription)
    {
        this.item.get(itemId).description = newDescription;
    }
    public void editStatus(int itemId,int status)
    {
        this.item.get(itemId).Status = status;
    }    
    
    public void CompleteItemInList(int itemId,int status)
    {
        this.item.get(itemId).Status = status;
    }
    
    
}

