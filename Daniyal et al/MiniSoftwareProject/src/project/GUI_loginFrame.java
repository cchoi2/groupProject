//colors: (84, 140, 137), (116, 175, 173), (217, 133, 59), (236, 236, 234)
package project;

public class GUI_loginFrame extends javax.swing.JFrame {

    public GUI_loginFrame() {
        initComponents();
        errorPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        borderPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        errorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(236, 236, 234));

        borderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Not Ebay", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Plantagenet Cherokee", 0, 14))); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        passwordLabel.setText("Password:");

        loginButton.setBackground(new java.awt.Color(217, 133, 59));
        loginButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(217, 133, 59));
        signUpButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setText("That is not a valid username/password combination");

        javax.swing.GroupLayout errorPanelLayout = new javax.swing.GroupLayout(errorPanel);
        errorPanel.setLayout(errorPanelLayout);
        errorPanelLayout.setHorizontalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        errorPanelLayout.setVerticalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout borderPanelLayout = new javax.swing.GroupLayout(borderPanel);
        borderPanel.setLayout(borderPanelLayout);
        borderPanelLayout.setHorizontalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        .addComponent(signUpButton))
                    .addGroup(borderPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        borderPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordField, usernameField});

        borderPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, signUpButton});

        borderPanelLayout.setVerticalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(signUpButton))
                .addGap(18, 18, 18)
                .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        new GUI_signupFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String tempuser = usernameField.getText();
        String temppass = passwordField.getText();
        Accounts tempAcc = projectMain.searchAccounts(tempuser);
        if(tempAcc.getPassword().equals(temppass)){
            if(tempAcc instanceof Customer){
                new GUI_mainFrameCustomer(tempAcc).setVisible(true);
                dispose();
            } else if (tempAcc instanceof Admin){
                new GUI_mainFrameAdmin(tempAcc).setVisible(true);
                dispose();
            }
        } else {
            errorPanel.setVisible(true);
        }
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JPanel errorPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
