import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class loginpages extends JFrame{
    private JTextField pwuser;
    private JTextField usnuser;
    private JButton LOGINButton;
    private JButton GAJADIButton;
    private JPanel vipan;

    public loginpages(){
        setContentPane(vipan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("tugas jamkos");
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);

        //jika si user mengenter maka akan pindah ke kolom pasword
        //jika si user mengenter maka akan pindah ke kolom pasword
        pwuser.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    usnuser.requestFocus(); // Pindah ke kolom password
                }
            }
        });

        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String namauser = usnuser.getText();
                String passworduser = pwuser.getText();

                if (namauser.isEmpty() || passworduser.isEmpty()) {
                    JOptionPane.showMessageDialog(loginpages.this, "KOLOM WAJIB DIISI");
                } else {
                    JOptionPane.showMessageDialog(vipan, "login berhasil ");
                    JOptionPane.showMessageDialog(vipan, "masuk sebagai " + pwuser.getText());


//buat pindah ke halaman data
                    new data();
                    dispose();
                }
            }
        });

        GAJADIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int pilihan =  JOptionPane.showConfirmDialog(loginpages.this,"YAKIN INGIN MENGULANG?", "cofirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pilihan == JOptionPane.YES_OPTION) {
                    usnuser.setText("");
                    pwuser.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        new loginpages();
    }
}
