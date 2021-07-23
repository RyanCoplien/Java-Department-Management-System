// SuccessFrame.java
// 2430 OOPs I Program 3
package logins;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SuccessFrame extends JFrame
{
    public static void main(String[] args)
    {
        try
        {
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            for (UIManager.LookAndFeelInfo info : UIManager.
                    getInstalledLookAndFeels())
            {
                if (!"Nimbus".equals(info.getName()))
                {
                    continue;
                }
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(SuccessFrame.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        //</editor-fold>
        EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new SuccessFrame().setVisible(true);
            }
        });
    }

    private JLabel jLabel1;
    private JButton ok_btn;

    public SuccessFrame()
    {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     This method is called from within the constructor to initialize the form.
     WARNING: Do NOT modify this code. The content of this method is always
     regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void initComponents()
    {
        jLabel1 = new javax.swing.JLabel();
        ok_btn = new javax.swing.JButton();
        this.setTitle("Input was accepted");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input was accepted");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 228, 4));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Success!");

        ok_btn.setText("Close");
        ok_btn.setToolTipText("");
        ok_btn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ok_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addComponent(ok_btn)
                                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>  

    private void ok_btnActionPerformed(ActionEvent evt)
    {
        this.setVisible(false);
    }

}
