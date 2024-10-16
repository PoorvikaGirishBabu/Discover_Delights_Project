/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HotelAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Hotel.Hotel;
import Business.Orders.LegalOrder;
import Business.Orders.LegalDirectory;
import Business.Legal.Legal;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author  Vishal
 */
public class HotelSelectLegalPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    Legal legal;
    DefaultTableModel model;
    DefaultTableModel model1;
    private String selectedItem;
    private String selectedPrice;
    JSplitPane screen;
    Double Total = 0.0;
    private Hotel cust;
     
    private LegalDirectory legalOrderDirectory;
    java.util.Date dateCurrent = new java.util.Date();


    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public HotelSelectLegalPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Legal legal, JSplitPane screen) {
        initComponents();
        jPanel2.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.legal = legal;
        this.screen = screen;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        LegalserviceTable.setModel(model);
        cartTable.setModel(model1);
        
        cust=cust;
        
        legalOrderDirectory = new LegalDirectory();
        
        model.addColumn("Service Name");
        model.addColumn("Price");
        
        model1.addColumn("Service Name");
        model1.addColumn("Price");
        model1.addColumn("Date");
        
        title.setText("Welcome to:"+ legal.getName() + " we offer best service");
        showMenuTable();
        
        ImageIcon icon7 =  new ImageIcon("./src/images/customer_panel_cart.png");
        Image image7 = icon7.getImage().getScaledInstance(75, 60, Image.SCALE_SMOOTH);
        AddButton.setIcon(new ImageIcon(image7));
        
        

        

    }
    
    public void showMenuTable() {
        HashMap<String, String> menu = legal.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }
        public void showCartTable() {
        if (legalOrderDirectory.getOrderList().size() > 0) {
            for (int i = 0; i < legalOrderDirectory.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    legalOrderDirectory.getOrderList().get(i).getItem(),
                    legalOrderDirectory.getOrderList().get(i).getPrice(),
                    legalOrderDirectory.getOrderList().get(i).getDate()
                });
            }
        }
    }
        
    public Customer findCustomer() {
        for(int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i ++) {
            if(ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }                           
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        Backbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LegalserviceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        itemText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BookAppointment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        title.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Welcome");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(cartTable);

        Backbutton.setBackground(new java.awt.Color(0, 0, 0));
        Backbutton.setForeground(new java.awt.Color(255, 255, 255));
        Backbutton.setText("Back");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        LegalserviceTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LegalserviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LegalserviceTable.setRowHeight(25);
        LegalserviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LegalserviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LegalserviceTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Select Date");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Consultation Type");
        jLabel3.setAutoscrolls(true);

        AddButton.setBackground(new java.awt.Color(102, 102, 255));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        itemText.setEditable(false);
        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {itemText, jDateChooser1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Your Quick Cart View");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        BookAppointment.setBackground(new java.awt.Color(102, 102, 255));
        BookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        BookAppointment.setText("Book Appointment");
        BookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAppointmentActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Wanna do a quick checkout? \nClick the button Below");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(BookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(BookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 102, 0));
        jLabel6.setFont(new java.awt.Font("Jokerman", 3, 24)); // NOI18N
        jLabel6.setText("Responsible Dining Starts Here: Ensuring Compliance, Inspiring Trust");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select a consultancy");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(742, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LegalserviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LegalserviceTableMouseClicked
        // TODO add your handling code here:
        System.out.println(model.getValueAt(LegalserviceTable.getSelectedRow(), 0) +" selected added list ");
        selectedItem = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 0));
        selectedPrice = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 1));
        itemText.setText(selectedItem);
    }//GEN-LAST:event_LegalserviceTableMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(jDateChooser1.getDate() == null || itemText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Kindly select service and select dates");
            jDateChooser1.setDate(null);
            return;
        }else if(jDateChooser1.getDate().before(new Date()))
                {JOptionPane.showMessageDialog(this, "Kindly select date after today's date");
                jDateChooser1.setDate(null);
                return;}
         Date date = jDateChooser1.getDate();
         SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
         String date1 = format1.format(date);
         System.out.println(date1);
        
        legalOrderDirectory.createOrder(selectedItem, selectedPrice, date1, legal, userAccount);
        model1.addRow(new Object[]{
            selectedItem,
            selectedPrice,
            date1
        });
        itemText.setText("");
        jDateChooser1.setDate(null);
        JOptionPane.showMessageDialog(this, "Item added to cart");
        jPanel2.setVisible(true);
        

    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
        HotelOrderLegalPanel dm= new HotelOrderLegalPanel(userProcessContainer, userAccount,ecosystem, screen);
//        userProcessContainer.add("manageNetworkJPanel",dm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        screen.setRightComponent(dm);
    }//GEN-LAST:event_BackbuttonActionPerformed
 
    public void setOrderListLegal(Customer cust) {
         for(int i = 0; i <  legalOrderDirectory.getOrderList().size(); i ++) {
               legal.getOrderList().add(legalOrderDirectory.getOrderList().get(i));
               cust.getLegalorderList().add(legalOrderDirectory.getOrderList().get(i));

        }
//        legal.getOrders().put(String.valueOf(legal.getOrders().size()), legalOrderDirectory.getOrderList());
        cust.getLegalorderDirectoryList().add(legalOrderDirectory);
        legal.getOrderDirectoryList().add(legalOrderDirectory);
    }
    private void BookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAppointmentActionPerformed
         Hotel cust =  findManageHotel();
//        if("Credit".equals(cust.getCardType())){
               if("Credit".equals(0)){
     
//         setOrderListLegal(cust);
          for(int i = 0; i < legalOrderDirectory.getOrderList().size(); i ++) {
            Total+= (Double.parseDouble(legalOrderDirectory.getOrderList().get(i).getPrice()));
        }
//        CustomerPaymentPanels mm = new CustomerPaymentPanels(screen, cust, Total, "We have received your order. We will update as soon as your have appointment is scheduled.");
//        screen.setRightComponent(mm);
        System.out.println("Order created sucessfully");
        }else {JOptionPane.showMessageDialog(this, "Sorry Cannot place Direct Order, Add A Credit Card");}
    }//GEN-LAST:event_BookAppointmentActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed
public Hotel findManageHotel() {
        for (int i = 0; i < ecosystem.getHotel_Directory().getHotelList().size(); i++) {
            if (ecosystem.getHotel_Directory().getHotelList().get(i).getUserAccount().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getHotel_Directory().getHotelList().get(i);
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton BookAppointment;
    private javax.swing.JTable LegalserviceTable;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField itemText;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
