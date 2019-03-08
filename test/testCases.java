/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author issuser
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sprint.doList;
import sprint.Item;
/**
 *
 * @author issuser
 */
public class testCases {
    
    
  
    @Test
    public void TestAddItemToList(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",2,10000,0);
        dolist.addItem(event);
        assertTrue(dolist.item.contains(event));
        System.out.println("test add done");
        
    }
    
    @Test
    public void TestDeleteItemFromList(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",2,10000,0);
        dolist.addItem(event);
        dolist.removeItem(0);
        assertFalse(dolist.item.contains(event));
        System.out.println("test delete done");
    }

    @Test
    public void TestSortByDate(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",1,10002,0);
        Item event1 = new Item(0,"hello",2,10001,0);
        Item event2 = new Item(0,"hello",3,10000,0);

        dolist.addItem(event);
        dolist.addItem(event1);
        dolist.addItem(event2);

         
        dolist.sortbyDate();
        
        for (int i = 0; i < dolist.item.size(); i++)
        {
            System.out.println(dolist.item.get(i).Date);
        }
        
        
        for (int i = 1; i < dolist.item.size(); i++)
        {
            assertTrue((dolist.item.get(i-1).Date < dolist.item.get(i).Date));
            System.out.printf("test done num %d\n",i);
        }
        
        
    }
    
    @Test
    public void TestSortByPriority(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",4,10002,0);
        Item event1 = new Item(1,"hello",2,10001,0);
        Item event2 = new Item(2,"hello",3,10000,0);

        dolist.addItem(event);
        dolist.addItem(event1);
        dolist.addItem(event2);


        dolist.sortbyPriority();

        for (int i = 0; i < dolist.item.size(); i++)
        {
            System.out.println(dolist.item.get(i).Priority);
        }

        for (int i = 1; i < dolist.item.size(); i++)
        {
            assertTrue((dolist.item.get(i-1).Priority < dolist.item.get(i).Priority));
            System.out.printf("test sort priority num %d\n",i);
        }
        
        
    }
    
    @Test
    public void TestEditItemInList(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",4,10002,0);
        Item event1 = new Item(1,"hello",2,10001,0);
        Item event2 = new Item(2,"hello",3,10000,0);

        dolist.addItem(event);
        dolist.addItem(event1);
        dolist.addItem(event2);


        int itemnum = 1;
        dolist.editItemDescriptiom(itemnum,"test");

        System.out.println(dolist.item.get(itemnum).description);
        System.out.println("testing edit description");
        assertTrue(dolist.item.get(itemnum).description.equals("test")); 
        
    }
    @Test
    public void TestEditStatusInList(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",4,10002,0);
        Item event1 = new Item(1,"hello",2,10001,0);
        Item event2 = new Item(2,"hello",3,10000,0);

        dolist.addItem(event);
        dolist.addItem(event1);
        dolist.addItem(event2);


        int itemnum = 1;
        dolist.editStatus(itemnum,1);

        System.out.println(dolist.item.get(itemnum).Status);
        System.out.println("testing edit description");
        assertTrue(dolist.item.get(itemnum).Status == 1); 
        
    }
    @Test
    public void TestCompleteItemInList(){
        //setup
        doList dolist = new doList();
        Item event = new Item(0,"hello",4,10002,0);
        Item event1 = new Item(1,"hello",2,10001,0);
        Item event2 = new Item(2,"hello",3,10000,0);

        dolist.addItem(event);
        dolist.addItem(event1);
        dolist.addItem(event2);

        int itemnum = 1;
        dolist.CompleteItemInList(itemnum,1);
        assertTrue(dolist.item.get(itemnum).Status == 1); 
    }
    

}

