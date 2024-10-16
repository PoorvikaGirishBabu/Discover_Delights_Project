/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.EventAdminRole;

import Business.EcoSystem;

import Business.EventManager.EventManager;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Customer.SendMail;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Poorvi
 */
public class ManageEventServicesPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    EventManager eventmanager;
    DefaultTableModel model;
    UserAccount ua;

    public ManageEventServicesPanel(JPanel userProcessContainer, EcoSystem system, EventManager eventmanager, UserAccount ua) {
        initComponents();
        this.ecosystem = system;
        this.eventmanager = eventmanager;
        model = new DefaultTableModel();
        this.userProcessContainer = userProcessContainer;
        ManageServiceTabel.setModel(model);
        model.addColumn("Event Name");
        model.addColumn("Event Price");
        System.out.println(eventmanager.getName());
        viewMenuList();
        showDeleteList();
    }

    public void viewMenuList() {
        HashMap<String, String> menu = eventmanager.getMenu();

        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }

    public void showDeleteList() {
        HashMap<String, String> menu = eventmanager.getMenu();
        if (eventmanager.getMenu().size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                itemsCombo.addItem(e.getKey());
            }
        }
    }

    public void reset() {
        itemsCombo.setSelectedIndex(0);
        updateItemText.setText("");
        updatePriceText.setText("");

    }

    public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$  ";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if (item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageServiceTabel = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        AddItemPanel = new javax.swing.JPanel();
        AddItemLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        AddItemPriceLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        ComboBoxService = new javax.swing.JComboBox<>();
        UpdateItemPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemsCombo = new javax.swing.JComboBox<>();
        ItemPanel = new javax.swing.JLabel();
        updateItemText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        updatePriceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Events ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ManageServiceTabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ManageServiceTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ManageServiceTabel);

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setForeground(new java.awt.Color(204, 204, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        AddItemPanel.setBackground(new java.awt.Color(255, 255, 204));

        AddItemLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Events");

        priceText.setForeground(new java.awt.Color(72, 72, 72));

        AddItemNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Events");

        AddItemPriceLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddItemPriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");

        addButton.setBackground(new java.awt.Color(102, 102, 255));
        addButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        ComboBoxService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birthday", "Wedding", "Naming Cermony", "Corparate Events" }));
        ComboBoxService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(AddItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddItemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxService, 0, 149, Short.MAX_VALUE)
                                .addComponent(priceText)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(AddItemLabel)
                .addGap(18, 18, 18)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemNameLabel)
                    .addComponent(ComboBoxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemPriceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        UpdateItemPanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete an Item");

        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Item");

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });

        ItemPanel.setForeground(new java.awt.Color(72, 72, 72));
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Item");

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });

        PriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));

        updateButton.setBackground(new java.awt.Color(102, 102, 255));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateItemPanelLayout = new javax.swing.GroupLayout(UpdateItemPanel);
        UpdateItemPanel.setLayout(UpdateItemPanelLayout);
        UpdateItemPanelLayout.setHorizontalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(updatePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        UpdateItemPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {itemsCombo, updateItemText, updatePriceText});

        UpdateItemPanelLayout.setVerticalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemPanel))
                .addGap(31, 31, 31)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(updatePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        userinterface.EventAdminRole.AdminWorkAreaJPanel sysAdminwjp = (userinterface.EventAdminRole.AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields((String) ComboBoxService.getSelectedItem(), priceText.getText());
        if (!isValid) {
            return;
        }

        HashMap<String, String> menu = eventmanager.getMenu();

        menu.put((String) ComboBoxService.getSelectedItem(), priceText.getText());
        eventmanager.setMenu(menu);
        JOptionPane.showMessageDialog(this, "Item added successfully");
        itemsCombo.addItem((String) ComboBoxService.getSelectedItem());
        System.out.println((String) ComboBoxService.getSelectedItem() + " test " + priceText.getText());
        model.addRow(new Object[]{
            (String) ComboBoxService.getSelectedItem(),
            priceText.getText()
        });

        priceText.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> menu = eventmanager.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    updateItemText.setText(e.getKey());
                    updatePriceText.setText(String.valueOf(e.getValue()));
                }
            }
        }
    }//GEN-LAST:event_itemsComboActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select a value from dropdown");
            return;
        } else if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        HashMap<String, String> menu = eventmanager.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    menu.remove(e);
                    menu.put(updateItemText.getText(), updatePriceText.getText());
                    JOptionPane.showMessageDialog(this, "Menu Item updated successfully");
                }
            }
        }
        eventmanager.setMenu(menu);
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        for (int i = 0; i < ManageServiceTabel.getRowCount(); i++) {
            if (((String) ManageServiceTabel.getValueAt(i, 0)).equals(selectedItem)) {
                itemsCombo.addItem(updateItemText.getText());
                model.addRow(new Object[]{
                    updateItemText.getText(),
                    updatePriceText.getText()
                });
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);

            }//end of if block
        }
        reset();
        // TODO add your handling code here:

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select a value from dropdown");
            return;
        }
        HashMap<String, String> menu = eventmanager.getMenu();
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        if (itemsCombo.getSelectedItem() != null) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    System.out.println("inside delete..");
                    menu.remove(e.getKey());
                    JOptionPane.showMessageDialog(this, "Menu Item deleted successfully");
                }
            }
        }
        for (int i = 0; i < ManageServiceTabel.getRowCount(); i++) {
            if (((String) ManageServiceTabel.getValueAt(i, 0)).equals(selectedItem)) {
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);
                updateItemText.setText("");
                updatePriceText.setText("");
            }//end of if block
        }

        eventmanager.setMenu(menu);
        System.out.println(menu.size() + "jsdje " + eventmanager.getMenu().size());
        reset();
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ComboBoxServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel AddItemPriceLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> ComboBoxService;
    private javax.swing.JLabel ItemPanel;
    private javax.swing.JTable ManageServiceTabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel UpdateItemPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> itemsCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    // End of variables declaration//GEN-END:variables
}
