import java.awt.*;
import javax.swing.*;

class Gridbag1 {
	public static void main(String args[])
	{
Frame f1=new Frame();
GridBagLayout g1=new GridBagLayout();
f1.setLayout(g1);
GridBagConstraints gbc=new GridBagConstraints();



gbc.gridx=0;
gbc.gridy=0;

gbc.insets=new Insets(10,10,10,10);
f1.add(new Button("North"),gbc);

gbc.gridx=0;
gbc.gridy=1;
f1.add(new Button("West"),gbc);

gbc.gridx=1;
gbc.gridy=1;
f1.add(new Button("Center"),gbc);

gbc.gridx=2;
gbc.gridy=1;
f1.add(new Button("East"),gbc);

gbc.gridx=1;
gbc.gridy=2;
gbc.gridwidth=3;
f1.add(new Button("South"),gbc);


f1.setSize(500,500);
f1.setVisible(true);
	}
}