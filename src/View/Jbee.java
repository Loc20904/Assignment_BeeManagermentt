
package View;

import java.util.ArrayList;
import javax.swing.JLabel;
import Model.*;
import Controller.ArrayBee;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author phuc2
 */
public class Jbee extends javax.swing.JFrame {
    ArrayList<JLabel> arl=new ArrayList();
    ArrayBee arBee=new ArrayBee();   
    
    //Image Icon source
    ImageIcon qeenIcon=new ImageIcon("bee.png");
    ImageIcon workerIcon=new ImageIcon("food.png");
    ImageIcon droneIcon=new ImageIcon("bee (1).png");
    
    
    public Jbee() {
        initComponents();
        this.setTitle("Assignment_PRO192");
        this.setIconImage(new ImageIcon("beehive.png").getImage());
        jPanel1.setOpaque(false);
        createBee(arBee.display());
        
    }
    
    public void createLabel(Bee a)
    {
        //Because Text don't understand \n, so use html <br> to break line
        String type;
        type=(a instanceof Qeen)?"Qeen":(a instanceof Worker)?"Worker":"Drone";
        type=type.concat("<br>"+a.getHelth()+"<br>"+((a.isDead())?"Had Dead":"Alive"));
        type="<html>"+type+"</html>";
        JLabel jnew=new JLabel(type);
        jnew.setIcon((a instanceof Qeen)?qeenIcon:(a instanceof Worker)?workerIcon:droneIcon);
        arl.add(jnew);
    }
    
    public void createBee(ArrayList<Bee> ar)//Use to out label o screen
    {
        arl.clear();//Clear list lable
        jPanel1.removeAll();//Clear all label had invisible in panel
        for(Bee a:ar)
        {
            createLabel(a);     
        }
        for(JLabel a:arl)
        {
            jPanel1.add(a);
        }
        jPanel1.revalidate();//update to screen
        jPanel1.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JbtnAttack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtEnter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 720, 400));

        JbtnAttack.setBackground(new java.awt.Color(255, 204, 204));
        JbtnAttack.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        JbtnAttack.setText("Attack");
        JbtnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAttackActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 143, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create Bee");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 50));

        jTxtEnter.setBackground(new java.awt.Color(204, 255, 204));
        jTxtEnter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTxtEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtEnter.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTxtEnterCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTxtEnterInputMethodTextChanged(evt);
            }
        });
        jTxtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnterActionPerformed(evt);
            }
        });
        jTxtEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtEnterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtEnterKeyTyped(evt);
            }
        });
        getContentPane().add(jTxtEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 50));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\phuc2\\Downloads\\beehive (1).png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hive Simulation");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 350, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\phuc2\\Downloads\\bee (2).png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 200, 90));

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/backgr.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void JbtnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAttackActionPerformed
    arBee.Attack();
    createBee(arBee.display());
        for (Bee temp : arBee.display()) {
            if (temp instanceof Qeen && temp.isDead()) {
                JOptionPane.showMessageDialog(rootPane, "Queen had dead you Lose");
                return;
            }
        }
       
    }//GEN-LAST:event_JbtnAttackActionPerformed

    private void jTxtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnterActionPerformed
       
    }//GEN-LAST:event_jTxtEnterActionPerformed

    private void jTxtEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtEnterKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int numBee=0;
            try{
                numBee=Integer.parseInt(jTxtEnter.getText().trim());
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Wrong numbers");
            }
            if(numBee!=0)
            {
                arBee.CreateList(numBee);
                createBee(arBee.display());
                
            }
        }
            
    }//GEN-LAST:event_jTxtEnterKeyPressed

    private void jTxtEnterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtEnterKeyTyped
        
    }//GEN-LAST:event_jTxtEnterKeyTyped

    private void jTxtEnterInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTxtEnterInputMethodTextChanged
       // System.out.println("saaaaaaaaaaaaaa");
    }//GEN-LAST:event_jTxtEnterInputMethodTextChanged

    private void jTxtEnterCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTxtEnterCaretPositionChanged
       
    }//GEN-LAST:event_jTxtEnterCaretPositionChanged

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
            java.util.logging.Logger.getLogger(Jbee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jbee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jbee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jbee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jbee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnAttack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtEnter;
    // End of variables declaration//GEN-END:variables
}
