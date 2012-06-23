package paneel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

import components.ControlInputFields;

public class Verifier extends InputVerifier implements KeyListener{

	private String patroon = null;

	public Verifier(String patroon){
		this.patroon = patroon;
	}

	@Override
	public boolean verify(JComponent inputfield) {
		String input = ((JTextField)inputfield).getText();
		if(input.matches(patroon)){
			((JTextField)inputfield).setBackground(Color.white);
		}
		else{
			((JTextField)inputfield).setBackground(Color.red);
			return false;
		}
		((ControlInputFields)inputfield).submit();
		return true;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		verify((JTextField)e.getSource());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		verify((JTextField)e.getSource());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		verify((JTextField)e.getSource());
	}

}
