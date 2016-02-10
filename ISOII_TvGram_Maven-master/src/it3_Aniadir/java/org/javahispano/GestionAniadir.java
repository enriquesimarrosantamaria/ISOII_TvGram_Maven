package org.javahispano;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

private class BtnAniadirFilaActionListener implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {
		
		Object miTabla;
		MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
		Object[] nuevaFila = {"...", "...", new
		ImageIcon(getClass().getClassLoader().getResource("presentacion/video.png")),false};
		modeloTabla.aniadeFila(nuevaFila);
		modeloTabla.fireTableDataChanged();
		Object taFilaSeleccionada;
		((Object) taFilaSeleccionada).setText("");
	}
}