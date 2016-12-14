import javax.swing.*;
import java.awt.*;

/**
 * Created by may on 2016/12/13.
 */
public class Test extends JFrame {

    public void addComponent(Container container, Component component, int gridx, int gridy, int gridWidth, int gridHeight, double weightx, double weighty) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints(gridx, gridy, gridWidth, gridHeight, weightx, weighty, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(10,0,0,0), 10, 0);
        container.add(component, gridBagConstraints);
    }

    public void launchFrame() {
        this.setSize(new Dimension(300, 300));
        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        this.addComponent(this.getContentPane(), new JButton("aaaaaaa"),0,0, 1, 1, 1,1);
        this.addComponent(this.getContentPane(), new JButton("b"),1,0, 1, 1,0.8,0.8);
        this.addComponent(this.getContentPane(), new JButton("c"),0,1, 2, 1,1,1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.launchFrame();

    }
}
