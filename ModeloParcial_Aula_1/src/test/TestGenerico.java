package test;

import java.time.LocalDate;

import datos.Aula;
import datos.Edificio;
import datos.Espacio;
import negocio.AulaABM;
import negocio.EdificioABM;
import negocio.EspacioABM;

public class TestGenerico {
	public static void main(String[] args) throws Exception {
		
		System.out.println("TEST 1");
		Edificio edificio = EdificioABM.getInstance().traerEdificioConAulas(1);
		System.out.println(edificio + "aulas: " + edificio.getAulas());
		
		System.out.println("TEST 2");
		Aula aula = AulaABM.getInstance().traerConEdificio(5);
		System.out.println(aula + " edificio: " + aula.getEdificio());
		
		System.out.println("TEST 3");
		Espacio espacio = EspacioABM.getInstance().traer(LocalDate.of(2022, 5, 1), 'M', AulaABM.getInstance().traer(5));
		System.out.println(espacio);
		System.out.println("TEST 4");
		try {
			System.out.println(AulaABM.getInstance().agregar(LocalDate.of(2022, 5, 1), 'M', AulaABM.getInstance().traer(5), true));
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		System.out.println("TEST 5");
		AulaABM.getInstance().agregarEspaciosMes(5, 2022, 'M', AulaABM.getInstance().traerConEspacios(5));
	}
}
