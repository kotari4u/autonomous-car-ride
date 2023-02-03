package com.sai.aws.acr.registration.dataaccess.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class AutonomousCar {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String model;
	private RunsOn runsOn;
	private int numSeats;
	private BigDecimal chargePerMile;
	
	private boolean haveAudio;
	private boolean haveVideo;
	private boolean haveLeatherSeating;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public RunsOn getRunsOn() {
		return runsOn;
	}
	
	public void setRunsOn(RunsOn runsOn) {
		this.runsOn = runsOn;
	}
	
	public int getNumSeats() {
		return numSeats;
	}
	
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	
	
	public BigDecimal getChargePerMile() {
		return chargePerMile;
	}
	
	public void setChargePerMile(BigDecimal chargePerMile) {
		this.chargePerMile = chargePerMile;
	}
	
	public boolean isHaveAudio() {
		return haveAudio;
	}
	
	public void setHaveAudio(boolean haveAudio) {
		this.haveAudio = haveAudio;
	}
	
	public boolean isHaveVideo() {
		return haveVideo;
	}
	
	public void setHaveVideo(boolean haveVideo) {
		this.haveVideo = haveVideo;
	}
	
	public boolean isHaveLeatherSeating() {
		return haveLeatherSeating;
	}
	
	public void setHaveLeatherSeating(boolean haveLeatherSeating) {
		this.haveLeatherSeating = haveLeatherSeating;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		AutonomousCar that = (AutonomousCar) o;
		
		if (numSeats != that.numSeats) return false;
		if (haveAudio != that.haveAudio) return false;
		if (haveVideo != that.haveVideo) return false;
		if (haveLeatherSeating != that.haveLeatherSeating) return false;
		if (!Objects.equals(id, that.id)) return false;
		if (!Objects.equals(model, that.model)) return false;
		if (runsOn != that.runsOn) return false;
		return Objects.equals(chargePerMile, that.chargePerMile);
	}
	
	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (model != null ? model.hashCode() : 0);
		result = 31 * result + (runsOn != null ? runsOn.hashCode() : 0);
		result = 31 * result + numSeats;
		result = 31 * result + (chargePerMile != null ? chargePerMile.hashCode() : 0);
		result = 31 * result + (haveAudio ? 1 : 0);
		result = 31 * result + (haveVideo ? 1 : 0);
		result = 31 * result + (haveLeatherSeating ? 1 : 0);
		return result;
	}
	
	@Override
	public String toString() {
		return "AutonomousCar{" +
				"id=" + id +
				", model='" + model + '\'' +
				", runsOn=" + runsOn +
				", numSeats=" + numSeats +
				", chargePerMile=" + chargePerMile +
				", haveAudio=" + haveAudio +
				", haveVideo=" + haveVideo +
				", haveLeatherSeating=" + haveLeatherSeating +
				'}';
	}
}
