package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Testes {

	public static void main(String[] args) throws ParseException {
		
		Date teste = new Date();
		
		SimpleDateFormat data_simples = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat data_e_hora= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date vrau = data_simples.parse("11/12/2001");
		Date vrau_hora = data_e_hora.parse("11/12/2001 15:25:07");
		
		System.out.println(vrau);
		System.out.println(vrau_hora);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println(data_simples.format(teste));
		System.out.println(data_e_hora.format(teste));
	}

}
