/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hotel;

import Business.Orders.HotelOrder;
import Business.Orders.HotelDirectory;
import Business.HotelManager.HotelManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import Business.UserAccount.UserAccount;
import Business.Orders.Order;
import Business.Orders.OrderDirectory;

import Business.Orders.LegalOrder;
import Business.Orders.LegalDirectory;

import Business.Orders.EventOrder;
import Business.Orders.Event1Directory;

/**
 *
 * @author Vishal
 */
public class Hotel {

    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String location;
    private String phone;
    private String rest;
    private HotelManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<HotelOrder> orderList;
    private HashMap<String, ArrayList<HotelOrder>> orders;
    private ArrayList<HotelDirectory> orderDirectoryList;
    private String Network;
    private String CardName;
    private String CardNo;
    private String CardCVV;
    private String CardEd;

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getCardCVV() {
        return CardCVV;
    }

    public void setCardCVV(String CardCVV) {
        this.CardCVV = CardCVV;
    }

    public String getCardEd() {
        return CardEd;
    }

    public void setCardEd(String CardEd) {
        this.CardEd = CardEd;
    }
    
    private ArrayList<Order> groceryorderlist;
    private ArrayList<OrderDirectory> grocerydirectorylist;
            
    private ArrayList<EventOrder> eventorderlist;
    private ArrayList<Event1Directory> eventdirectorylist;
    
    private ArrayList<LegalOrder> legalorderlist;
    private ArrayList<LegalDirectory> legaldirectorylist;
    
    public String getManagerName() {
        return managerName;
    }

    public ArrayList<OrderDirectory> getGrocerydirectorylist() {
        return grocerydirectorylist;
    }

    public void setGrocerydirectorylist(ArrayList<OrderDirectory> grocerydirectorylist) {
        this.grocerydirectorylist = grocerydirectorylist;
    }

    public ArrayList<Event1Directory> getEventdirectorylist() {
        if (eventdirectorylist == null) {
        eventdirectorylist = new ArrayList<Event1Directory>();
    }
    return eventdirectorylist;
    }

    public void setEventdirectorylist(ArrayList<Event1Directory> eventdirectorylist) {
        this.eventdirectorylist = eventdirectorylist;
    }

    public ArrayList<LegalDirectory> getLegaldirectorylist() {
        if (legaldirectorylist == null) {
        legaldirectorylist = new ArrayList<LegalDirectory>();
    }
    return legaldirectorylist;
    }

    public void setLegaldirectorylist(ArrayList<LegalDirectory> legaldirectorylist) {
        this.legaldirectorylist = legaldirectorylist;
    }
    
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public ArrayList<Order> getGroceryorderlist() {
        return groceryorderlist;
    }

    public void setGroceryorderlist(ArrayList<Order> groceryorderlist) {
        this.groceryorderlist = groceryorderlist;
    }

    public ArrayList<EventOrder> getEventorderlist() {
        return eventorderlist;
    }

    public void setEventorderlist(ArrayList<EventOrder> eventorderlist) {
        this.eventorderlist = eventorderlist;
    }

    public ArrayList<LegalOrder> getLegalorderlist() {
        return legalorderlist;
    }

    public void setLegalorderlist(ArrayList<LegalOrder> legalorderlist) {
        this.legalorderlist = legalorderlist;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<HotelDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }
    
   
    public void setOrderDirectoryList(ArrayList<HotelDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public HashMap<String, ArrayList<HotelOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<HotelOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<HotelOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<HotelOrder> orderList) {
        this.orderList = orderList;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public HotelManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(HotelManager managerDetails) {
        this.managerDetails = managerDetails;
    }

    public Hotel() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<HotelOrder>();
        orders = new HashMap<String, ArrayList<HotelOrder>>();
        orderDirectoryList = new ArrayList<HotelDirectory>();
        legalorderlist = new ArrayList<LegalOrder>();
        legaldirectorylist = new ArrayList<LegalDirectory>();
    }

    public String getManager() {
        return managerDetails.getName();
    }

    public void setMenuItem(String name, String value) {
        menu.put(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hotel.count = count;
    }

}
