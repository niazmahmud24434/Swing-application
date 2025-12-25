import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Circle {
    int x, y, radius;
    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}

public class CircleGUI extends JFrame implements ActionListener {
    private JButton drawButton, clearButton;
    private JPanel drawPanel;
    private List<Circle> circles;
    private Random rand;

    public CircleGUI() {
        setTitle("Circle Drawer");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Circle c : circles) {
                    g.fillOval(c.x, c.y, c.radius, c.radius);
                }
            }
        };
        drawPanel.setBackground(Color.WHITE);
        add(drawPanel, BorderLayout.CENTER);

        drawButton = new JButton("Draw Circle");
        clearButton = new JButton("Clear");
        drawButton.addActionListener(this);
        clearButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(drawButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);

        circles = new ArrayList<>();
        rand = new Random();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            int radius = 50;
            int x = rand.nextInt(drawPanel.getWidth() - radius);
            int y = rand.nextInt(drawPanel.getHeight() - radius);
            circles.add(new Circle(x, y, radius));
        } else if (e.getSource() == clearButton) {
            circles.clear();
        }
        drawPanel.repaint();
    }

    public static void main(String[] args) {
        new CircleGUI();
    }
}
