package ar.consumo.Class;

import java.awt.Frame;

import javax.swing.JFrame;

public class MiMarco extends JFrame {

	public MiMarco() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Marco "+i);
		}
	}
}
