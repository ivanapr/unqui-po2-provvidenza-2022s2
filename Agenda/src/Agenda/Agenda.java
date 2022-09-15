package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<String> nombres = new ArrayList<String>();
	public List<String> getNombres() {
		return this.nombres;
	}
	public void agregarElemento(String nombre) {
		nombres.add(nombre);
	}
	public void quitarElemento(String nombre) {
		if(nombre.contains(nombre)) {
			nombres.remove(nombre);
		}
	}
	public boolean nombreEmpiezaCon(String nombre, String inicial) {
		if (nombre.startsWith(inicial)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean tieneAlMenosUnNombreConInicial(String inicial) {
		for (String nombre:nombres) {
			if(nombreEmpiezaCon(nombre, inicial)) {
				return true;
			}
		}
		return false;
	}
	public boolean todosEmpiezanCon(String inicial) {
		if (this.tieneAlMenosUnNombreConInicial(inicial)) {
			for (String nombre:nombres) {
				if (!(this.nombreEmpiezaCon(nombre, inicial))){
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	public List<String> filtrar(String inicial){
		List<String> filtrados = new ArrayList<String>();
		if (this.tieneAlMenosUnNombreConInicial(inicial)) {
			if (this.todosEmpiezanCon(inicial)){
				return nombres;
			} else {
				for (String nombre:nombres) {
					if (this.nombreEmpiezaCon(nombre, inicial)){
						filtrados.add(nombre);
					}
				}
			}
		}
		return filtrados;
	}
	public void printAll() {
		for (String nombre:nombres) {
			System.out.println(nombre);
		}
	}
}
