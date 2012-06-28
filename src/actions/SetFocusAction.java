package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

public class SetFocusAction extends AbstractAction{
	
	private JTextField field;

	public SetFocusAction(JTextField field){
		this.field = field;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("hier");
		field.requestFocusInWindow();
	}

}
