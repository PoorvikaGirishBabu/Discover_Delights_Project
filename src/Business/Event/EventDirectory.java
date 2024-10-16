/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Event;

/**
 *
 * @author Vishal
 */
import Business.EventManager.EventManager;
import java.util.ArrayList;

public class EventDirectory {
    private ArrayList<Event> EventList;
    
    public EventDirectory() {
        EventList = new ArrayList();
    }

    public ArrayList<Event> getEventList() {
        return EventList;
    }

    public void setEventList(ArrayList<Event> EventList) {
        this.EventList = EventList;
    }
    
    public Boolean deleteEvent(String name) {
        for(int i = 0; i < EventList.size(); i ++) {
            if(EventList.get(i).getName().equals(name)) {
                EventList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Event createEvent(String name, EventManager rm, String phone, String location, String Network){
        Event rest = new Event();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        EventList.add(rest);
        return rest;
    }
}
