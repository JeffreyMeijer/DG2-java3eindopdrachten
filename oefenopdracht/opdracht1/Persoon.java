package opdracht1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoon {
	private String voornaam;
	private String achternaam;
	private String geboortedatum;
	
	//Getters
	public String getVoornaam() {
		return voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public String getGeboortedatum() {
		return geboortedatum;
	}
	//Setters
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public void setGeboortedatum(String geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
	public long calculateDays(String geboortedatum) {
		LocalDate now = LocalDate.now();
		LocalDate dob = LocalDate.parse(geboortedatum);
		long daysbetween = ChronoUnit.DAYS.between(dob, now);
		return daysbetween;
	}
}
