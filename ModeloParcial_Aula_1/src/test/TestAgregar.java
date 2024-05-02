package test;

import java.time.LocalDate;

import datos.Aula;
import datos.Edificio;
import datos.Espacio;
import negocio.AulaABM;
import negocio.EdificioABM;
import negocio.EspacioABM;

public class TestAgregar {
	public static void main(String[] args) throws Exception {
		//System.out.println(AulaABM.getInstance().traer(5));
		try {
			Aula aula = AulaABM.getInstance().traer(5);
			//System.out.println(AulaABM.getInstance().agregar(LocalDate.of(2022, 5, 1), 'M', AulaABM.getInstance().traer(5), true));
			System.out.println(AulaABM.getInstance().agregar(LocalDate.of(2022, 5, 1), 'M', aula, true));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//System.out.println("TEST 5");
		AulaABM.getInstance().agregarEspaciosMes(5, 2022, 'M', AulaABM.getInstance().traerConEspacios(5));
	}
	
}
