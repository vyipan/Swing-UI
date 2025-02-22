import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class data extends JFrame{
    private JTextField namasiswa;
    private JTextField absensiswa;
    private JTextField kelassiswa;
    private JTextField prestasisiwa;
    private JPanel hehe;
    private JButton TAMBAHButton;
    private JButton BATALButton;

    public data(){
        setContentPane(hehe);
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        namasiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    absensiswa.requestFocus(); // Pindah ke kolom absen
                }
            }
        });

        absensiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    kelassiswa.requestFocus(); // Pindah ke kolom kelas
                }
            }
        });

        kelassiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    prestasisiwa.requestFocus(); // Pindah ke kolom prestasi
                }
            }
        });
        namasiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    absensiswa.requestFocus(); // Pindah ke kolom absen
                }
            }
        });

        absensiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    kelassiswa.requestFocus(); // Pindah ke kolom kelas
                }
            }
        });

        kelassiswa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    prestasisiwa.requestFocus(); // Pindah ke kolom prestasi
                }
            }
        });

        prestasisiwa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (!namasiswa.getText().isEmpty() &&
                            !absensiswa.getText().isEmpty() &&
                            !kelassiswa.getText().isEmpty() &&
                            !prestasisiwa.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(hehe, "NAMA SEBAGAI: " + namasiswa.getText()+"\n"+
                                "ABSEN: " + absensiswa.getText()+ "\n" +
                                "KELAS: " + kelassiswa.getText()+ "\n" +
                                "PRESTASI YANG PERNAH DIRAIH: " + prestasisiwa.getText() + "\n" +
                                "NB: PASTIKAN TIDAK KEKELIRUAN INPUT");

                        JOptionPane.showMessageDialog(hehe, "data berhasil diinput! ✅" );

                        namasiswa.setText("");
                        absensiswa.setText("");
                        kelassiswa.setText("");
                        prestasisiwa.setText("");

                        namasiswa.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Pastikan semua kolom sudah terisi! ⚠️");
                    }
                }
            }
        });

        TAMBAHButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        String nmsiswa = namasiswa.getText();
        String absnsiswa = absensiswa.getText();
        String klssiswa = kelassiswa.getText();
        String prstsisiswa = prestasisiwa.getText();

        if (nmsiswa.isEmpty() || absnsiswa.isEmpty() || klssiswa.isEmpty() || prstsisiswa.isEmpty()){
            JOptionPane.showMessageDialog(data.this, "DATA TIDAK BOLEH KOSONG");
        }
    }
});

BATALButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int pilihan = JOptionPane.showConfirmDialog(data.this, "YAKIN INGIN MENGULANG?", "CONFIRM",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pilihan == JOptionPane.YES_OPTION){
            namasiswa.setText("");
            absensiswa.setText("");
            kelassiswa.setText("");
            prestasisiwa.setText("");
        }

    }
});

    }

    public static void main(String[] args) {
        new data();
    }
}

