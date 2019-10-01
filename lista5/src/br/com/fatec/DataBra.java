package br.com.fatec;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataBra implements FormataData, DiffData{
	String dataFormato = "dd/MM/yyyy HH:mm:ss";
	@Override
	public String formataData(LocalDateTime dataLocal) {
		 DateTimeFormatter formato = DateTimeFormatter.ofPattern(this.dataFormato); 
		return dataLocal.format(formato);
	}

	@Override
	public String diffData(String dataInicio, LocalDateTime dataFim) {
		String dataFinal = this.formataData(dataFim);
		
		SimpleDateFormat format = new SimpleDateFormat(this.dataFormato);
		
		Date d1 = null;
		Date d2 = null;
		String resp = null;
		
		try {
			d1 = (Date) format.parse(dataInicio);
			d2 = (Date) format.parse(dataFinal);
			
			long diff = d2.getTime() - d1.getTime();
			
			long diffSeconds = diff/ 1000 % 60;
			long diffMinutes = diff/ (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
			
			resp = "Dias: " + diffDays + ", Horas: " + diffHours + ", Minutos: " + diffMinutes + ", Segundos" + diffSeconds;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
}
