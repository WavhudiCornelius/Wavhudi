import javax.swing.JFrame;
import javax.swing.JButton;

public class BSTApp extends JFrame{

    // Creating static final values for the Screen
    public static final int WIDTH = 500;
    public static final int HEIGHT = 600;

    public BSTApp(){
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("BSTApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        BSTApp b = new BSTApp();
        b.setVisible(true);
    }
}
