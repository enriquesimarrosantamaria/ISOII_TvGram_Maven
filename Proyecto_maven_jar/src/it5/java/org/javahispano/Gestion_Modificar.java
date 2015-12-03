package org.javahispano;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 
rowSM.addListSelectionListener(new ListSelectionListener() {
	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel lsm = (ListSelectionModel) e.getSource();
		if (!lsm.isSelectionEmpty()) {
			//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
			//taFilaSeleccionada.setText("Fila "
					//+ filaSeleccionada
					//+ " seleccionada");
			if (!lsm.isSelectionEmpty()) {
				//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
				//taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
				MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
				int n= miTabla.getSelectedRow();
				if (n != -1)
				{
				String contenido = "Nombre :"+ modeloTabla.getValueAt(n, 0)+":\n"+"Género: "+ modeloTabla.getValueAt(n, 1)+"\n";
				contenido += (Boolean) modeloTabla.getValueAt(n, 3)?"Vista": "No Vista\n";
				taFilaSeleccionada.setText(contenido);
				lblFoto.setIcon((ImageIcon)modeloTabla.getValueAt(n, 2));
				}
			}
		}
	}
});