

package userinterface.HotelAdminRole;


import Business.EcoSystem;
import Business.Hotel.Hotel;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author  Vishal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount ua;
    String managerName;
    Hotel hotel;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        managerName = ua.getEmployee().getName();
        ecosystem = system;
        hotel = findManageHotel();
        valueLabel.setText(hotel.getManager());
        jLabel1.setText("Admin Work Area: "+hotel.getName());
      
        //valueLabel.setText();
    }
   public Hotel findManageHotel() {
        for(int i = 0; i < ecosystem.getHotel_Directory().getHotelList().size(); i ++) {
            if(ecosystem.getHotel_Directory().getHotelList().get(i).getUserAccount().getUsername().equals(this.ua.getUsername())) {
                return ecosystem.getHotel_Directory().getHotelList().get(i);
            }
        }
        return null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        updatestorepanel = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        ManageOrdersButton = new javax.swing.JButton();
        ManageGroceryInventoryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ManageOrdersButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 560, 40));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setText("Welcome:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 96, 330, 20));

        updatestorepanel.setBackground(new java.awt.Color(175, 255, 175));

        nameText.setForeground(new java.awt.Color(72, 72, 72));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(72, 72, 72));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Hotel Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Update Restaurant Information");

        locationLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(72, 72, 72));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        locationLabel.setText("Address");

        locationText.setForeground(new java.awt.Color(72, 72, 72));
        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(102, 102, 255));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatestorepanelLayout = new javax.swing.GroupLayout(updatestorepanel);
        updatestorepanel.setLayout(updatestorepanelLayout);
        updatestorepanelLayout.setHorizontalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        updatestorepanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {locationText, nameText, phoneText});

        updatestorepanelLayout.setVerticalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationLabel)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(updatestorepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 540, 300));

        ManageOrdersButton.setBackground(new java.awt.Color(102, 102, 255));
        ManageOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ManageOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageOrdersButton.setText("Other Services");
        ManageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrdersButtonActionPerformed(evt);
            }
        });
        add(ManageOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 200, 80));

        ManageGroceryInventoryButton.setBackground(new java.awt.Color(102, 102, 255));
        ManageGroceryInventoryButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ManageGroceryInventoryButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageGroceryInventoryButton.setText("Manage Menu List");
        ManageGroceryInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroceryInventoryButtonActionPerformed(evt);
            }
        });
        add(ManageGroceryInventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 200, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managerrestaurant.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, 330));

        ManageOrdersButton1.setBackground(new java.awt.Color(102, 102, 255));
        ManageOrdersButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ManageOrdersButton1.setForeground(new java.awt.Color(255, 255, 255));
        ManageOrdersButton1.setText("Manage Orders");
        ManageOrdersButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrdersButton1ActionPerformed(evt);
            }
        });
        add(ManageOrdersButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void ManageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrdersButtonActionPerformed
        OtherServicesWorkArea mm = new OtherServicesWorkArea(userProcessContainer,ua,ecosystem);
        userProcessContainer.add("manageNetworkJPanel",mm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ManageOrdersButtonActionPerformed

    private void ManageGroceryInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroceryInventoryButtonActionPerformed
        ManageHotelInventoryPanel mn = new ManageHotelInventoryPanel(userProcessContainer, ecosystem, hotel, ua);
        userProcessContainer.add("manageNetworkJPanel",mn);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageGroceryInventoryButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        if(phoneText.getText().isEmpty() || nameText.getText().isEmpty() || locationText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
        }else if(phoneText.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }else if(!phoneText.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        } else {
            hotel.setName(nameText.getText());
            hotel.setLocation(locationText.getText());
            hotel.setPhone(phoneText.getText());
            JOptionPane.showMessageDialog(null, "Hotel Name updated successfully");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void ManageOrdersButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrdersButton1ActionPerformed
        // TODO add your handling code here:
        ManageOrdersPanel mn = new ManageOrdersPanel(userProcessContainer, ecosystem, hotel, ua);
        userProcessContainer.add("manageNetworkJPanel",mn);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ManageOrdersButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageGroceryInventoryButton;
    private javax.swing.JButton ManageOrdersButton;
    private javax.swing.JButton ManageOrdersButton1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatestorepanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
