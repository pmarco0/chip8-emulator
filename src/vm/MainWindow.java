package vm;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final int WINDOW_WIDTH = 640;
    private static final int WINDOW_HEIGHT = 320;

    public MainWindow(DisplayPanel displayPanel) {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        pack();

        int width = WINDOW_WIDTH + getInsets().right + getInsets().left;
        int height = WINDOW_HEIGHT + getInsets().top + getInsets().bottom;
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);

        setLayout(new BorderLayout());

        add(displayPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chip-8 Emulator");
        setVisible(true);
    }
}
