package org.javahispano;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

private class BtnEliminarFilaActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
		int n= miTabla.getSelectedRow();
		if (n != -1) modeloTabla.eliminaFila(miTabla.getSelectedRow());
		modeloTabla.fireTableDataChanged();
		taFilaSeleccionada.setText("");
		lblFoto.setIcon(null);
	}
}