/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superPos;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRowsOwner;
import java.awt.event.KeyEvent;
import java.beans.Statement;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;

/**
 *
 * @author YEMIMAALDAPUTURUHU
 */
public class pos extends javax.swing.JFrame {

    /**
     * Creates new form Brand
     */
    public pos() {
        initComponents();
        //table_update();
    }

    Connection con;

    ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
    PreparedStatement insert;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        category = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProcode = new javax.swing.JTextField();
        txtProname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        category.setForeground(new java.awt.Color(255, 255, 255));
        category.setText("Category");
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cashier");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HOME");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(category)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Cashier");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel8.setText("Product Code");

        jLabel9.setText("Product Name");

        txtProcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcodeActionPerformed(evt);
            }
        });
        txtProcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProcodeKeyPressed(evt);
            }
        });

        txtProname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPronameActionPerformed(evt);
            }
        });

        jLabel1.setText("Price");

        jLabel10.setText("QTY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProname, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txtProcode))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Price", "QTY", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("ADD Product");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Subtotal");

        jLabel13.setText("Pay");

        jLabel14.setText("Balance");

        txtSub.setEnabled(false);

        txtBalance.setEnabled(false);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBalance))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(deleteBtn)
                            .addComponent(submitBtn))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitBtn)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // klik


    }//GEN-LAST:event_tableMouseClicked

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        // menuju tab category
        category cat = new category();
        cat.setVisible(true);
        dispose();
    }//GEN-LAST:event_categoryMouseClicked

    private void pos() {
        String name = txtProcode.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos", "root", "newpass");
            insert = con.prepareStatement("SELECT * from product where barcode = ?");
            insert.setString(1, name);
            rs = insert.executeQuery();

            while (rs.next()) {
                int currentqty;
                currentqty = rs.getInt("qty");

                //menghitung total
                int price = Integer.parseInt(txtPrice.getText());
                int qtynew = Integer.parseInt(txtQty.getText());

                int tot = price * qtynew;
                if (qtynew >= currentqty) {//jika lebih
                    JOptionPane.showMessageDialog(this, "Avaliable Product" + " = " + currentqty);
                    JOptionPane.showMessageDialog(this, "Qty is not Enough");
                } else {
                    model = (DefaultTableModel) table.getModel();
                    model.addRow(new Object[]{
                        txtProcode.getText(),
                        txtProname.getText(),
                        txtPrice.getText(),
                        txtQty.getText(),
                        tot,});
                    int sum = 0;
                    for (int i = 0; i < table.getRowCount(); i++) {
                        sum = sum + Integer.parseInt(table.getValueAt(i, 4).toString());
                    }
                    //taruh subtotal
                    txtSub.setText(Integer.toString(sum));
                    //bersih
                    txtProcode.setText("");
                    txtProname.setText("");
                    txtPrice.setText("");
                    txtQty.setText("");
                    txtProcode.requestFocus();
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        pos();
    }//GEN-LAST:event_addBtnActionPerformed

    private void txtProcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcodeActionPerformed

    private void txtPronameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPronameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPronameActionPerformed

    private void txtProcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = txtProcode.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos", "root", "newpass");
                insert = con.prepareStatement("SELECT * from product where barcode = ?");

                insert.setString(1, name);
                rs = insert.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Barcode not Found");
                } else {
                    String productname = rs.getString("productname");
                    String price = rs.getString("retailprice");

                    txtProname.setText(productname.trim());
                    txtPrice.setText(price.trim());
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtProcodeKeyPressed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        model.removeRow(table.getSelectedRow());
        int sum = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            sum = sum + Integer.parseInt(table.getValueAt(i, 4).toString());
        }
        //taruh subtotal
        txtSub.setText(Integer.toString(sum));

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void sales() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);

        String subtot = txtSub.getText();
        String pay = txtPay.getText();
        String bal = txtBalance.getText();
        int lastinsetid = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos", "root", "newpass");
            //masuk sales
            String query = "INSERT into sales(date,subtotal,pay,balance)values(?,?,?,?)";
            PreparedStatement insert = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS); // Use PreparedStatement here
            insert.setString(1, date);
            insert.setString(2, subtot);
            insert.setString(3, pay);
            insert.setString(4, bal);
            insert.executeUpdate();
            ResultSet generatedKeyResult = insert.getGeneratedKeys();

            if (generatedKeyResult.next()) {
                lastinsetid = generatedKeyResult.getInt(1);
            }

            int rows = table.getRowCount();
            String query1 = "INSERT into sales_product(sales_id, product_id, sell_price, qty, total) VALUES (?, ?, ?, ?, ?)";
            insert = con.prepareStatement(query1);

            // Masukan database sales_product
            String product_id = "";
            String price = "";
            String qty = "";
            int total = 0;

            for (int i = 0; i < table.getRowCount(); i++) {
                product_id = (String) table.getValueAt(i, 0);
                BigDecimal priceAsBigDecimal;
                try {
                    priceAsBigDecimal = new BigDecimal(price);
                } catch (NumberFormatException ex) {
                    priceAsBigDecimal = BigDecimal.valueOf(i, 1);
                }
                price = (String) table.getValueAt(i, 2);
                qty = (String) table.getValueAt(i, 3);
                total = Integer.parseInt(table.getValueAt(i, 4).toString());

                insert.setInt(1, lastinsetid);
                insert.setString(2, product_id);
                insert.setBigDecimal(3, priceAsBigDecimal);
                insert.setString(4, qty);
                insert.setInt(5, total);
                insert.executeUpdate();
            }

            //update qty    
            String query2 = "UPDATE product set qty=qty-? where barcode=?";
            insert = con.prepareStatement(query2);
            for (int i = 0; i < table.getRowCount(); i++) {

                product_id = (String) table.getValueAt(i, 0);
                qty = (String) table.getValueAt(i, 1);

                insert.setString(1, product_id);
                insert.setString(2, qty);
                insert.execute();

            }

            insert.addBatch();
            JOptionPane.showMessageDialog(this, "Record Save!");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        int pay = Integer.parseInt(txtPay.getText());
        int sub = Integer.parseInt(txtSub.getText());

        int bal = pay - sub;
        txtBalance.setText(Integer.toString(bal));
        sales();

        displayReceipt();

        //JOptionPane.showMessageDialog(null, );
    }//GEN-LAST:event_submitBtnActionPerformed

    private void displayReceipt() {
        StringBuilder receiptBuilder = new StringBuilder();
        receiptBuilder.append("Receipt\n");
        receiptBuilder.append("----------------------------------------------------\n");
        receiptBuilder.append(String.format("%-15s%-10s%-10s%-10s%n", "Product ID", "Price", "Quantity", "Total"));
        receiptBuilder.append("----------------------------------------------------\n");

        for (int i = 0; i < table.getRowCount(); i++) {
            String product_id = (String) table.getValueAt(i, 0);
            String price = (String) table.getValueAt(i, 2);
            String qty = (String) table.getValueAt(i, 3);
            int total = Integer.parseInt(table.getValueAt(i, 4).toString());

            receiptBuilder.append(String.format("%-15s%-10s%-10s%-10s%n", product_id, price, qty, total));
        }

        receiptBuilder.append("--------------------------------------\n");
        receiptBuilder.append(String.format("%-35s%s%n", "Total Amount:", txtSub.getText()));
        receiptBuilder.append(String.format("%-35s%s%n", "Pay:", txtPay.getText()));
        receiptBuilder.append(String.format("%-35s%s%n", "Balance:", txtBalance.getText()));

        // Display the receipt using JOptionPane
        String receipt = receiptBuilder.toString();
        JOptionPane.showMessageDialog(this, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        home home = new home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        brand br = new brand();
        br.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        product pro = new product();
        pro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        pos pos = new pos();
        pos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel category;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProcode;
    private javax.swing.JTextField txtProname;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables
}