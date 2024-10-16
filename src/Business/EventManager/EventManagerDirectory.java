/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventManager;

/**
 *
 * @author Vishal
 */
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class EventManagerDirectory {
    private ArrayList<EventManager> EventManagerList;
    
    public EventManagerDirectory() {
        EventManagerList = new ArrayList();
    }

    public ArrayList<EventManager> getEventManagerList() {
        return EventManagerList;
    }
    
     public void setCustomerList(ArrayList<EventManager> EventManagerList) {
        this.EventManagerList = EventManagerList;
    }
    
    public Boolean deleteEventManager(String name) {
        for(int i = 0; i < EventManagerList.size(); i ++) {
            if(EventManagerList.get(i).getName().equals(name)) {
                EventManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public EventManager createEventManager(String name, UserAccount ua, String phone, String gender , String address, String Network){
        EventManager cust = new EventManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setGender(gender);
        cust.setNetwork(Network);
        EventManagerList.add(cust);
        return cust;
    }
}
