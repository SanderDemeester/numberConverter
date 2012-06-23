package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import numberConversionAlgoritme.NumberConversionAlgoritmeInterface;
import numberConverter.NumberAgregator;

public class ControlInputFields extends JTextField implements ActionListener{
	
	private String oldValue = "";
	private NumberAgregator numberAgregator = null;
	private NumberConversionAlgoritmeInterface conversionAlgoritme = null;
	
	public ControlInputFields(NumberConversionAlgoritmeInterface conversionAlgoritme){
		super();
		this.conversionAlgoritme = conversionAlgoritme;
		numberAgregator = NumberAgregator.getInstance();
		numberAgregator.addActionListner(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub DRIVER CODE
		setText("");
		setText(conversionAlgoritme.getSpecificNumber(numberAgregator.getWaarde()).toString());
	}
	
	public void submit(){
		if(!getText().equals("") && !getText().equals("-")){
			System.out.println(getText());
			numberAgregator.setWaarde(conversionAlgoritme.getDoubleNumber(getText()),this);
		}
	}

}
