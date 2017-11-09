package view;

import javax.swing.*;
import java.awt.*;

public class AcceptView extends JFrame {

    AcceptView() {


        init();
        setVisible(true);
    }

    private void init() {

        setSize(350, 150);
        setTitle("Необхідне підтвердження");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        JButton ok = new JButton("Так");
        JButton cancel = new JButton("Ні");
        JTextField acceptanceText = new JTextField("Ви дійсно бажаєте видалити файл, чи може передумали ?");


        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.add(acceptanceText);

        JPanel southPanel = new JPanel();
        southPanel.add(ok, BorderLayout.CENTER);
        southPanel.add(cancel, BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);


    }
}
