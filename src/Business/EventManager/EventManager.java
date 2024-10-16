/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventManager;

/**
 *
 * @author Vishal
 */
import Business.Orders.Event1Directory;
import Business.Orders.EventOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String gender;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String address;
    private String phone;
    private String available;
    private UserAccount accountDetails;
    private HashMap<String, String> menu;
    private ArrayList<EventOrder> orderList;
    private HashMap<String, ArrayList<EventOrder>> orders;
    private ArrayList<Event1Directory> orderDirectoryList;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }

    public ArrayList<EventOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<EventOrder> orderList) {
        this.orderList = orderList;
    }

    public HashMap<String, ArrayList<EventOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<EventOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<Event1Directory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<Event1Directory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }

    
    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }
    
    public EventManager() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<EventOrder>();
        orders = new HashMap<String, ArrayList<EventOrder>>();
        orderDirectoryList = new ArrayList<Event1Directory>();
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
        EventManager.count = count;
    }
}
