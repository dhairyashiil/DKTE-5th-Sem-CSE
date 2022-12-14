
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class button {
    public static void main(String[] args) {
        myFrame m = new myFrame();
    }
}

class myFrame extends JFrame implements ActionListener, KeyListener {
    private Container c;
    private JButton b;
    private JFrame frame;
    private JLabel res;
    private JTextArea text;

    myFrame() {
        setTitle("Event Lisner");
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        text = new JTextArea();
        text.setBounds(35, 30, 150, 30);
        c.add(text);
        res = new JLabel("Button is unclicked");
        res.setBounds(50, 100, 200, 30);
        c.add(res);
        text.addKeyListener(this);
        b = new JButton("Click me");
        b.setBounds(50, 70, 100, 30);
        c.add(b);
        b.setOpaque(true);
        b.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                res.setText("Mouse is on button");
            }

            public void mouseExited(MouseEvent e) {
                res.setText("Mouse is not on button");
            }
        });
        b.addActionListener(this);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        res.setText("Key is pressed");
    }

    public void keyReleased(KeyEvent e) {
        res.setText("Key is released");
    }

    public void keyTyped(KeyEvent e) {
        res.setText("Key is typed");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            res.setText("Button is clicked");
        }
    }
}
