/*
Alumna: Gallegos Chuc Perla Ivonne
Tarea 3: Empresa
*/
package tareaEmpresa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class NominaADT {

	public static void main(String[] args) throws FileNotFoundException {
		File Archivo = new File("D:/FES_Materias/1_EDatos/Espacio_de_trabajo/Empresa/src/tareaEmpresa/junio.dat");
		NominaADT Prueba = new NominaADT(Archivo);
		Prueba.listaSueldo();
		System.out.println("\n");
		Prueba.mayorAntiguedad();
		Prueba.menorAntiguedad();
	}

	int tama = 0;
	String LineasLi = "";
	ArrayList<ArrayList<String>> OutterArray = new ArrayList<ArrayList<String>>();
	ArregloEmpresa<Trabajador> Nomina;
	String[] Lineas;
	String[] TamanioLista;
	Trabajador Trab;
	Trabajador Imp;
	Trabajador Mayor;
	Trabajador Mini;

	public NominaADT(File Archivo) {
		try {
			Path Ruta = Archivo.toPath();
			BufferedReader lector = Files.newBufferedReader(Ruta);
			String leer;

			while ((leer = lector.readLine()) != null) {
				Lineas = leer.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				TamanioLista = leer.split("\n");
				tama += TamanioLista.length;
				ArrayList<String> InnerArray = new ArrayList<String>();
				for (String datos : Lineas) {
					InnerArray.add(datos);
				}
				OutterArray.add(InnerArray);
			}
			Nomina = new ArregloEmpresa<Trabajador>(tama - 1);
			int Columnas = 0;
			for (int Filas = 1; Filas < OutterArray.size(); Filas++) {
				Trab = new Trabajador(Integer.parseInt(OutterArray.get(Filas).get(0)), OutterArray.get(Filas).get(1),
						OutterArray.get(Filas).get(2), OutterArray.get(Filas).get(3),
						Integer.parseInt(OutterArray.get(Filas).get(4)),
						Integer.parseInt(OutterArray.get(Filas).get(5)),
						Integer.parseInt(OutterArray.get(Filas).get(6)));
				Nomina.setItem(Columnas, Trab);
				Columnas++;
			}

		} catch (IOException ex) {
		}

	}

	public void listaSueldo() {
		Nomina = new ArregloEmpresa<Trabajador>(1);
		for (int i = 0; i < Nomina.getLenght(); i++) {
			Imp = Nomina.getItem(i);
			System.out.println("Id: " + Imp.getNumeroTrabajador() + "; Sueldo: " + Imp.CalcularSueldo());
		}
	}

	public void mayorAntiguedad() {
		int mayor = 2023;
		String trabMayorAnti = "";
		for (int i = 0; i < Nomina.getLenght(); i++) {
			Mayor = Nomina.getItem(i);
			if (Mayor.getAnioIngreso() < mayor) {
				mayor = Mayor.getAnioIngreso();
				trabMayorAnti = Mayor.getNombres();
			}
		}
		System.out.println("Trabajador(a) con mayor antiguedad: " + trabMayorAnti + ", desde el año: " + mayor);
	}

	public void menorAntiguedad() {
		int menor = 2016;
		String trabMenorAnti = "";
		for (int i = 0; i < Nomina.getLenght(); i++) {
			Mini = Nomina.getItem(i);
			if (Mini.getAnioIngreso() > menor) {
				menor = Mini.getAnioIngreso();
				trabMenorAnti = Mini.getNombres();
			}
		}
		System.out.println("Trabajador(a) con menor antiguedad: " + trabMenorAnti + ", desde el año: " + menor);
	}
}
