
package project;

import static java.lang.Integer.parseInt;

public class GUI_mainFrameCustomer extends javax.swing.JFrame {

    public GUI_mainFrameCustomer(Accounts tempAcc) {
        initComponents();
        for(Products p:projectMain.productList){
            availableProductsArea.append("\n" + p.getID() + ". " + p.getName());
        }
        Accounts thisAcc = tempAcc;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yourProductsArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        profileButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        availableProductsArea = new javax.swing.JTextArea();
        sellButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(116, 175, 173));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Not EBay");

        yourProductsArea.setColumns(20);
        yourProductsArea.setRows(5);
        jScrollPane1.setViewportView(yourProductsArea);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Available Products");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Your Products");

        profileButton.setBackground(new java.awt.Color(217, 133, 59));
        profileButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        profileButton.setText("Profile");

        availableProductsArea.setEditable(false);
        availableProductsArea.setColumns(20);
        availableProductsArea.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        availableProductsArea.setRows(5);
        jScrollPane2.setViewportView(availableProductsArea);

        sellButton.setBackground(new java.awt.Color(217, 133, 59));
        sellButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sellButton.setText("Sell Product");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        buyButton.setBackground(new java.awt.Color(217, 133, 59));
        buyButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        buyButton.setText("Buy Product");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("ID#:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)
                        .addContainerGap(159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buyButton)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buyButton, sellButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(profileButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyButton)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        String tempID = idTextField.getText();
        int idSearch = parseInt(tempID);
        Products tempPro = projectMain.searchProducts(idSearch);
        new GUI_buyProduct().setVisible(true);
    }//GEN-LAST:event_buyButtonActionPerformed

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        
    }//GEN-LAST:event_sellButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea availableProductsArea;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton sellButton;
    private javax.swing.JTextArea yourProductsArea;
    // End of variables declaration//GEN-END:variables
}
