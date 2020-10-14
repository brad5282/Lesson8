 
package StudentGUI;

import javax.swing.JOptionPane;

public class StudentGUIInterface extends javax.swing.JFrame {
    Student s[];
    int size, currentstudent;

    public StudentGUIInterface() {
        initComponents();
        s = new Student[10];
        size = 0;
        currentstudent=-1;
        fillData();
        showStudent(); 
    }
    
    private void fillData(){
        //5 student names
        String names[] = {"Marge Simpson", "Barney Gimble", "Whalen Smithers", "Ned Flanders", "Edna Crabapple"};
        //2D array of 5 sets of marks (3/student)
        int marks[][]={{75,85,72},{87,65,91},{56,61,52},{47,35,51},{95,91,92}};
        
        for (int i = 0; i < 5; i++) {
            //student now requires a name and an array of 3 marks
            //(each item in the marks array is an array of 3 marks)
            s[i] = new Student(names[i],marks[i]);
            size++;//must increase for each new studen you make
            
            //comment out later
            System.out.println(s[i].getName()+ "\tAverage: " + s[i].getAverage());
            
        }
        //start on the current student
        currentstudent=0;
    }
    
    public void showStudent(){
        txtname.setText(s[currentstudent].getName());
        txtmark1.setText(""+ s[currentstudent].getMark(1));
        txtmark2.setText(""+ s[currentstudent].getMark(2));
        txtmark3.setText(""+ s[currentstudent].getMark(3));
        lblaverage.setText(""+s[currentstudent].getAverage());
        lblcount.setText(""+ size);
        lblindex.setText("" + (currentstudent+1));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        txtname = new javax.swing.JTextField();
        txtmark1 = new javax.swing.JTextField();
        txtmark2 = new javax.swing.JTextField();
        txtmark3 = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblaverage = new javax.swing.JLabel();
        firstbtn = new javax.swing.JButton();
        prevbtn = new javax.swing.JButton();
        nxtbtn = new javax.swing.JButton();
        lastbtn = new javax.swing.JButton();
        lblcount = new javax.swing.JLabel();
        lblindex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Browser");

        txtname.setEditable(false);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtmark1.setEditable(false);
        txtmark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmark1ActionPerformed(evt);
            }
        });

        txtmark2.setEditable(false);
        txtmark2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmark2ActionPerformed(evt);
            }
        });

        txtmark3.setEditable(false);
        txtmark3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmark3ActionPerformed(evt);
            }
        });

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnmodify.setText("Modify");
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Test1");

        jLabel3.setText("Test2");

        jLabel4.setText("Test3");

        jLabel5.setText("Count");

        jLabel6.setText("Current Index");

        jLabel7.setText("Average");

        lblaverage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        firstbtn.setText("<<");
        firstbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstbtnActionPerformed(evt);
            }
        });

        prevbtn.setText("<");
        prevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevbtnActionPerformed(evt);
            }
        });

        nxtbtn.setText(">");
        nxtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtbtnActionPerformed(evt);
            }
        });

        lastbtn.setText(">>");
        lastbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastbtnActionPerformed(evt);
            }
        });

        lblcount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblindex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prevbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcount, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblindex, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nxtbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastbtn))
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtmark2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txtmark1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmark3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnadd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnmodify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblaverage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstbtn)
                    .addComponent(prevbtn)
                    .addComponent(nxtbtn)
                    .addComponent(lastbtn))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addComponent(lblcount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblindex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtmark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmark1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmark1ActionPerformed

    private void txtmark3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmark3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmark3ActionPerformed

    private void txtmark2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmark2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmark2ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        StudentPopup sp = new StudentPopup(this,true);
        //true == modal is true = pop up takes control of the app
        sp.setLocationRelativeTo(this); //pops up over the JFrame
        sp.setVisible(true);//show the popup
        
        Student temp = sp.getStudent();
        String em = temp.validateData();
        
        if(em==null) // add it to list
        {
            s[size]=temp;
            currentstudent=size;
            size++;
            showStudent();//updates display
        }
        else//do not and show error
            JOptionPane.showMessageDialog(this,em);
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed
        StudentPopup sp = new StudentPopup(this,true);
        sp.setForm(s[currentstudent]);
        sp.setModal(true);
        sp.setLocationRelativeTo(this);
        sp.setVisible(true);
        
        Student temp = sp.getStudent();
        String em = temp.validateData();
        
        if(em==null){
            s[currentstudent]= temp;
            showStudent();
        }
        else JOptionPane.showMessageDialog(this,em);
    }//GEN-LAST:event_btnmodifyActionPerformed

    private void firstbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstbtnActionPerformed
        if(currentstudent >0)
        {
            currentstudent = 0;
            showStudent();
        }
    }//GEN-LAST:event_firstbtnActionPerformed

    private void prevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevbtnActionPerformed
        if(currentstudent > 0)
        {
            currentstudent--;
            showStudent();
        }
    }//GEN-LAST:event_prevbtnActionPerformed

    private void nxtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtbtnActionPerformed
        if(currentstudent<size-1 && currentstudent>-1)
        {
            currentstudent++;
            showStudent();
        }
    }//GEN-LAST:event_nxtbtnActionPerformed

    private void lastbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastbtnActionPerformed
        if(currentstudent<size-1 && currentstudent>-1)
        {
            currentstudent = size-1;
            showStudent();
        }
    }//GEN-LAST:event_lastbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUIInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton firstbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton lastbtn;
    private javax.swing.JLabel lblaverage;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblindex;
    private javax.swing.JButton nxtbtn;
    private javax.swing.JButton prevbtn;
    private javax.swing.JTextField txtmark1;
    private javax.swing.JTextField txtmark2;
    private javax.swing.JTextField txtmark3;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
