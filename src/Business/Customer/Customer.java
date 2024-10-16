/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.HotelDirectory;
import Business.Orders.HotelOrder;

import Business.Orders.Order;
import Business.Orders.OrderDirectory;

import Business.Orders.LegalOrder;
import Business.Orders.LegalDirectory;

import Business.Orders.EventOrder;
import Business.Orders.Event1Directory;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Vishal
 */
public class Customer {

    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private String Email;
    private String cardName;
    private String cardType;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardED() {
        return cardED;
    }

    public void setCardED(String cardED) {
        this.cardED = cardED;
    }
    private String cardNo;
    private String cardCVV;
    private String cardED;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    private UserAccount accountDetails = new UserAccount();

    private ArrayList<Order> orderList;
    private ArrayList<OrderDirectory> orderDirectoryList;

    private ArrayList<LegalOrder> legalorderList;
    private ArrayList<LegalDirectory> legalorderDirectoryList;
    private ArrayList<EventOrder> eventorderList;
    private ArrayList<Event1Directory> eventDirectoryList;

    private ArrayList<HotelOrder> hotelorderList;
    private ArrayList<HotelDirectory> hotelDirectoryList;

    public ArrayList<EventOrder> getEventorderList() {
        return eventorderList;
    }

    public void setEventorderList(ArrayList<EventOrder> eventorderList) {
        this.eventorderList = eventorderList;
    }

    public ArrayList<Event1Directory> getEventDirectoryList() {
        return eventDirectoryList;
    }

    public ArrayList<HotelOrder> gethotelorderList() {
        return hotelorderList;
    }

    public void sethotelorderList(ArrayList<HotelOrder> hotelorderList) {
        this.hotelorderList = hotelorderList;
    }

    public void setEventDirectoryList(ArrayList<Event1Directory> eventDirectoryList) {
        this.eventDirectoryList = eventDirectoryList;
    }

    public ArrayList<HotelDirectory> getHotelorderDirectoryList() {
        return hotelDirectoryList;
    }

    public void setHotelorderDirectoryList(ArrayList<HotelDirectory> hotelDirectoryList) {
        this.hotelDirectoryList = hotelDirectoryList;
    }

    public ArrayList<LegalOrder> getLegalorderList() {
        return legalorderList;
    }

    public void setLegalorderList(ArrayList<LegalOrder> legalorderList) {
        this.legalorderList = legalorderList;
    }

    public ArrayList<LegalDirectory> getLegalorderDirectoryList() {
        return legalorderDirectoryList;
    }

    public void setLegalorderDirectoryList(ArrayList<LegalDirectory> legalorderDirectoryList) {
        this.legalorderDirectoryList = legalorderDirectoryList;
    }

    public ArrayList<OrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<OrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
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

    public Customer() {
        id = count;
        count++;

        orderList = new ArrayList<Order>();
        orderDirectoryList = new ArrayList<OrderDirectory>();

        legalorderList = new ArrayList<LegalOrder>();
        legalorderDirectoryList = new ArrayList<LegalDirectory>();

        eventorderList = new ArrayList<EventOrder>();
        eventDirectoryList = new ArrayList<Event1Directory>();

        hotelorderList = new ArrayList<HotelOrder>();
        hotelDirectoryList = new ArrayList<HotelDirectory>();
        
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
        Customer.count = count;
    }

}
