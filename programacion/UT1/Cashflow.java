import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cashflow extends JFrame {

    public Cashflow() {
        setTitle("Cashflow");
        setSize(1000, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topBar = new JPanel();
        topBar.setLayout(new GridLayout(1, 3, 3, 3));
        topBar.add(new JButton("Profit"));
        topBar.add(new JButton("Incomes"));
        topBar.add(new JButton("Expenses"));

        topBar.setBackground(new Color(240, 240, 240));
        topBar.setPreferredSize(new Dimension(1000, 10));

        topBar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                topBar.setPreferredSize(new Dimension(1000, 30));
                topBar.setBackground(new Color(220, 220, 255));
                pack();
            }

            public void mouseExited(MouseEvent e) {
                topBar.setBackground(new Color(240, 240, 240));
                topBar.setPreferredSize(new Dimension(1000, 10));
                pack();
            }
        });

        add(topBar, BorderLayout.NORTH);

        JPanel main = new JPanel();
        main.setBackground(Color.WHITE);
        add(main, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Cashflow();
    }
}
