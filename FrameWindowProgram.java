import javax.swing.JFrame;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        frame.setLocation(100, 50);  // 100 pixels from left, 50 pixels from top
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
