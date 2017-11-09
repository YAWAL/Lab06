package view;

import javax.swing.*;
import java.awt.*;

public class AcceptView extends JFrame {

    private JButton ok = new JButton("Так");
    private JButton cancel = new JButton("Відміна");
    private JLabel acceptanceText = new JLabel("Ви дійсно бажаєте видалити файл?");
    private JPanel mainPanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();

    AcceptView() {
        init();
        setVisible(true);
    }

    private void init() {
        setSize(350, 150);
        setTitle("Необхідне підтвердження");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        northPanel.add(acceptanceText);

        southPanel.add(ok, BorderLayout.CENTER);
        southPanel.add(cancel, BorderLayout.CENTER);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }
}
