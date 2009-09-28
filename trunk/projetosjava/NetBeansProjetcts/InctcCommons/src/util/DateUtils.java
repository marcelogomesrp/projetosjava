package util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
	
	public enum FormatoDeDataHoras {

        DiaMesAno("dd/MM/yyyy"),
        DiaMesAnoHora("HH:mm:ss");

		private final String descricao;

		FormatoDeDataHoras(String descricao) {
	        this.descricao = descricao;
		}

		public String toString() {
			
			return this.descricao;
		}
	}

	public static Date configurarHoraMinutosESegundos(Date data, int hora, int minutos, int segundos) {

		Calendar dataDeCriacaoHelper = Calendar.getInstance(TimeZone.getTimeZone("GMT-3:00"));

    	dataDeCriacaoHelper.setTime((data == null) ? new Date() : data);

		dataDeCriacaoHelper.set(
				
			dataDeCriacaoHelper.get(Calendar.YEAR), 
			dataDeCriacaoHelper.get(Calendar.MONTH), 
			dataDeCriacaoHelper.get(Calendar.DATE),
			hora, 
			minutos, 
			segundos
		);

    	return dataDeCriacaoHelper.getTime();
	}

	public static String formatarDataEmString(Date data, FormatoDeDataHoras formato){
		
		Format formatador = new SimpleDateFormat(formato.toString());	
		
		return formatador.format(data);
	}
}