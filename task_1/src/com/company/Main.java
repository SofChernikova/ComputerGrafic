package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame jFrame = new JFrame();
	jFrame.setTitle("Elementary figures");
	jFrame.setSize(new Dimension(600, 400));
	jFrame.setLocationRelativeTo(null);
	jFrame.setLayout(new GridBagLayout());
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

	jFrame.setVisible(true);

	GrathPanel grathPanel = new GrathPanel();
	jFrame.add(grathPanel, new GridBagConstraints(0,0, 1, 1, 1, 1, GridBagConstraints.NORTH,
			GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
    }
}
