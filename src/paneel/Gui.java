package paneel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyListener;

import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import actions.SetFocusAction;

import numberConversionAlgoritme.BinaryNumberConversionAlgoritme;
import numberConversionAlgoritme.DecimalConversionAlgoritme;
import numberConversionAlgoritme.FirstComplementBinaryConversionAlgoritme;
import numberConversionAlgoritme.FloatingPointNumberConversion;
import numberConversionAlgoritme.HexadecialNumberConversion;
import numberConversionAlgoritme.NumberConversionAlgoritmeInterface;
import numberConversionAlgoritme.SecondComplementBinaryConversion;

import components.ControlInputFields;

public class Gui extends JFrame{
	
	private JLabel[] labels = new JLabel[6];
	private JTextField[] textfields = new JTextField[6];
	private static final String[] OPSCHRIFT = { "Deciaal nummer","Binaire nummer","Hexadecimaal","Eerste complement binaire vorm","Tweede complement binaire vorm",
		"Floating point voorstelling"};
	private static final String[] REGEX = {"-?[0-9]*","[01]*","[A-Z0-9]*","[01]*","[01]*","[01]*"};
	private static final NumberConversionAlgoritmeInterface[] CONVERSION_ALGORITME= {new DecimalConversionAlgoritme(), 
			new BinaryNumberConversionAlgoritme(), new HexadecialNumberConversion(),
			new FirstComplementBinaryConversionAlgoritme(),new SecondComplementBinaryConversion(),
			new FloatingPointNumberConversion()};
	
	public Gui(){
		
		Container cp = getContentPane();
		for(int i = 0; i < 6; i++){
			labels[i] = new JLabel(OPSCHRIFT[i]);
			textfields[i] = new ControlInputFields(CONVERSION_ALGORITME[i]);
			textfields[i].setInputVerifier(new Verifier(REGEX[i]));
			textfields[i].addKeyListener((KeyListener)textfields[i].getInputVerifier());
		}
		
		GroupLayout layoutManager =  new GroupLayout(cp);
		cp.setPreferredSize(new Dimension(500, 200));
		cp.setLayout(layoutManager);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		setJMenuBar(new NumberConverterMenuBar());
		
		
		layoutManager.setAutoCreateContainerGaps(true);
		layoutManager.setAutoCreateGaps(true);
	
		layoutManager.setHorizontalGroup(
				layoutManager.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
				.addGroup(layoutManager.createParallelGroup()
						.addComponent(labels[0])
						.addComponent(textfields[0])
						.addComponent(labels[1])
						.addComponent(textfields[1])
						.addComponent(labels[2])
						.addComponent(textfields[2])
						)
				.addGroup(layoutManager.createParallelGroup()
						.addComponent(labels[3])
						.addComponent(textfields[3])
						.addComponent(labels[4])
						.addComponent(textfields[4])
						.addComponent(labels[5])
						.addComponent(textfields[5])
						)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						);
		layoutManager.setVerticalGroup(
				layoutManager.createParallelGroup()
				.addGroup(layoutManager.createSequentialGroup()
						.addComponent(labels[0])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[0])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(labels[1])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[1])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(labels[2])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[2])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						)
				.addGroup(layoutManager.createSequentialGroup()
						.addComponent(labels[3])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[3])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(labels[4])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[4])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(labels[5])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(textfields[5])
						.addContainerGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						)
						);
		
						}

}
