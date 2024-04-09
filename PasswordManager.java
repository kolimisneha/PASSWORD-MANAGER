pakage main;
import java.awt.BorderLayout;
import java.awt.EvenQueue;
import javax.swing.*;
importjavax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
public class Login extends jFrame{
    private JPanel contentPane;
    private JPasswordField passwordFeild;
    private Jlabel lblnewLabel_1;
    private jTextFeild textFeildl;
    private JButton btnNewButton_1;
    
    
    public void Login(){
        contentPAne =new JPanel();
        contentPAne.setBorder(new EmptyBorder(5,5,5,5));
        setContentPAne(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel =new Jlabel("Enter password");
        lblNewLabel.setBounds(58,119,200,23);
        contentPane.add(lblnewLabel);
        
        passwordFeild =new JPasswordFeild();
        passwordFeild.setBounds(209,119,200,23);
        cotentPane.add(passwordFeild);

        
        JButton btNewButton =new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                setVisible(false);
                PasswordManagerUI pman=new PAsswordManagerUI();
                pman.rinit();
                
            }
        }
    };
    btnNewButton.setBounds(288,175,114,25);
    contentPane.add(btnNewButton);
    
    
    lblNewLabel_11=new JLabel("USERNAME");
    lblNEWLabel_1.setBounds(58,92,114,15);
    contentPane.add(lblNewLabel_1);
    textFeild=new JTextFeild();
    textFeild.setBounds(209,88,200,23);
    contentPane.add(textFeild);
    textFeild.setColumns(10);
    
    btnNewButton_1 =new JButton("REGIster");
    btnNewButton_1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
            
        }
    }
            
};
btnNewButton_1.setBounds(58,175,114,25);
contentPane.add(btnNewButton_1);
setVisible(true);
}
}

