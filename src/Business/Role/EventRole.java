/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 *  @author Poorvi
 */
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.EventAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

public class EventRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
    }
}
