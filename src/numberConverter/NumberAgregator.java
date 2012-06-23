package numberConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import components.ControlInputFields;

public class NumberAgregator {

	private List<ActionListener> lijst = new ArrayList<ActionListener>();
	private double waarde;

	private static NumberAgregator ik = null;

	private NumberAgregator(){

	}

	public static NumberAgregator getInstance(){
		if(ik == null) ik = new NumberAgregator();
		return ik;
	}

	public void addActionListner(ActionListener l){
		lijst.add(l);
	}

	public boolean removeActionListener(ActionListener l){
		return lijst.remove(l);
	}

	public double getWaarde(){ return waarde; }
	public void setWaarde(double waarde, ActionListener ll){
		this.waarde = waarde;
		for(ActionListener l : lijst){
			if(l != ll)
				l.actionPerformed(new ActionEvent(this, 0, null));
		}
	}
	private void update(){
		for(ActionListener l : lijst)
			l.actionPerformed(new ActionEvent(this, 0, null));
	}



}
