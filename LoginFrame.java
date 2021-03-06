// LoginFrame.java
// 2430 OOPs I Program 3
package logins;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginFrame extends JFrame
{

    public static Bag people = new Bag();
    public static Bag courses = new Bag();

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
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
        //</editor-fold>
        EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new LoginFrame().setVisible(true);
            }
        });
    }
    private JButton exit_btn;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JButton login_btn;
    private JPasswordField password_txt;
    private JButton register_btn;
    private JButton reset_btn;
    private JTextField username_txt;

    public LoginFrame()
    {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     This method is called from within the constructor to initialize the form.
     WARNING: Do NOT modify this code. The content of this method is always
     regenerated by the Form Editor.
     */

    public Bag getPeople()
    {
        return people;
    }

    public Bag getCourses()
    {
        return courses;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void initComponents()
    {
        this.jPanel1 = new JPanel();
        this.username_txt = new JTextField();
        this.password_txt = new JPasswordField();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.login_btn = new JButton();
        this.reset_btn = new JButton();
        this.exit_btn = new JButton();
        this.register_btn = new JButton();
        this.setDefaultCloseOperation(3);
        this.setTitle("Login Page");
        this.jLabel1.setText("Enter Username:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        this.jLabel2.setText("Enter Password:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        this.login_btn.setText("Login");
        this.login_btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent evt)
            {
                LoginFrame.this.login_btnActionPerformed(evt);
            }
        });
        this.reset_btn.setText("Clear");
        this.reset_btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent evt)
            {
                LoginFrame.this.reset_btnActionPerformed(evt);
            }
        });
        this.exit_btn.setText("Exit");
        this.exit_btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent evt)
            {
                LoginFrame.this.exit_btnActionPerformed(evt);
            }
        });
        this.register_btn.setText("Sign Up");
        this.register_btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent evt)
            {
                LoginFrame.this.register_btnActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel1)
                                                                .addComponent(password_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                                .addComponent(username_txt)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(21, 21, 21))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exit_btn)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>  

    private void reset_btnActionPerformed(ActionEvent evt)
    {
        this.username_txt.setText(null);
        this.password_txt.setText(null);
    }

    private void exit_btnActionPerformed(ActionEvent evt)
    {
        System.exit(0);
    }

    private void login_btnActionPerformed(ActionEvent evt)
    {
        String password = this.password_txt.getText();
        String username = this.username_txt.getText();
        Person temp = new Student("nn", username, password, 1);
        if (people.has(temp))
        {
            temp = (Person) people.containsPerson(temp);
        }
        if (people.has(temp))
        {
            int rn = temp.getRoleNum();
            if (rn == 1 || rn == 2)
            {
                RegisterFrame SoPp = new RegisterFrame(username);
                SoPp.setVisible(true);
            }
            if (rn == 3)
            {
                AdminFrame ap = new AdminFrame();
                ap.setVisible(true);
            }
        }
        else
        {
            ErrorFrame ep = new ErrorFrame();
            ep.setVisible(true);
        }
        this.username_txt.setText(null);
        this.password_txt.setText(null);
    }

    private void register_btnActionPerformed(ActionEvent evt)
    {
        SignUpFrame rp = new SignUpFrame();
        rp.setVisible(true);
    }

}
