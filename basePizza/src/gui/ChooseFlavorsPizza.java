/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import baseDecorate.PizzaBase;
import decorator.PizzaDecorator;
import intefacesdecorator.IComponent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import plugin.PluginController;

/**
 *
 * @author final
 */
public class ChooseFlavorsPizza extends javax.swing.JFrame {
    private final PluginController plugins; 
    private final DefaultListModel dlm;
    //private final DefaultListModel dlm2;
    
    /**
     * Creates new form ChooseFlavorsPizza
     */
    public ChooseFlavorsPizza() {
        plugins = new PluginController();
        dlm = new DefaultListModel();
        //dlm2 = new DefaultListModel();
        initComponents();
        //showPlugins();
    }

    public String[] showPlugins(){
        String[] pluginNames = new String[this.plugins.getLoadedPlugins().size()];
        for (int i = 0; i < pluginNames.length; i++) {
            pluginNames[i] = this.plugins.getLoadedPlugins().get(i);
        }
        return pluginNames;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jIngredients = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jSelectedIngredients = new javax.swing.JList<>();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jIngredients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = showPlugins();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jIngredients);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jSelectedIngredients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jSelectedIngredients);

        btnUp.setText("Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnConfirm.setText("OK");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirm)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnAdd)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUp)
                    .addComponent(btnDown))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnAdd)
                                .addGap(28, 28, 28)
                                .addComponent(btnRemove))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnUp)
                        .addGap(31, 31, 31)
                        .addComponent(btnDown)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> selected = new ArrayList<>();
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlm.addElement(jIngredients.getSelectedValue());
        selected.add(jIngredients.getSelectedValue());
        jSelectedIngredients.setModel(dlm);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        dlm.removeElement(jSelectedIngredients.getSelectedValue());
        selected.remove(jSelectedIngredients.getSelectedIndex());
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        String selectedItem = jSelectedIngredients.getSelectedValue();
        int itemIndex = jSelectedIngredients.getSelectedIndex();
        DefaultListModel model = (DefaultListModel)jSelectedIngredients.getModel();
        
        if(itemIndex > 0){
            model.remove(itemIndex);
            model.add(itemIndex - 1, selectedItem);
            jSelectedIngredients.setSelectedIndex(itemIndex - 1);
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        String selectedItem = jSelectedIngredients.getSelectedValue();
        int itemIndex = jSelectedIngredients.getSelectedIndex();
        DefaultListModel model = (DefaultListModel)jSelectedIngredients.getModel();
        
        if(itemIndex < selected.size() - 1){
            model.remove(itemIndex);
            model.add(itemIndex + 1, selectedItem);
            jSelectedIngredients.setSelectedIndex(itemIndex + 1);
        }
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        IComponent lastElement = new PizzaBase();
        URL[] jars = new URL[jSelectedIngredients.getModel().getSize()];
        for (int i = 0; i < jSelectedIngredients.getModel().getSize(); i++) {
            try {
                jars[i] = new File("plugins/" + jSelectedIngredients.getModel().getElementAt(i)+".jar").toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        URLClassLoader ulc = new URLClassLoader(jars);
        for (int i = 0; i < jSelectedIngredients.getModel().getSize(); i++) {
            String decoratorName = jSelectedIngredients.getModel().getElementAt(i);
            PizzaDecorator decorator = null;
            try {
                decorator = (PizzaDecorator) Class.forName(decoratorName.toLowerCase() + "." + decoratorName, true, ulc).newInstance();
                decorator.setDecorated(lastElement);
                lastElement = decorator;
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        lastElement.doPizza();
        JOptionPane.showMessageDialog(null, "Sucess!");
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseFlavorsPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUp;
    private javax.swing.JList<String> jIngredients;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jSelectedIngredients;
    // End of variables declaration//GEN-END:variables
}
