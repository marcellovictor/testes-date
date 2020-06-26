package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Testes {

	public static void main(String[] args) throws ParseException {
		
		Date teste = new Date(0L);
		
		SimpleDateFormat data_simples = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat data_e_hora= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat full_gmt = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		full_gmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date vrau = data_simples.parse("11/12/2001");
		Date vrau_hora = data_e_hora.parse("11/12/2001 15:25:07");
		
		/*
		System.out.println(vrau);
		System.out.println(vrau_hora);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println(data_simples.format(teste));
		System.out.println(data_e_hora.format(teste));
		System.out.println(teste);
		*/
		
		
		Date londres = Date.from(Instant.parse("2019-12-25T11:35:42Z"));
		
		System.out.println(data_e_hora.format(londres));
		System.out.println(full_gmt.format(londres));
	}

}
