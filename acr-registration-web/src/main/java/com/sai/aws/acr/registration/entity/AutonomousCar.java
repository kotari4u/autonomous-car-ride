package com.sai.aws.acr.registration.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class AutonomousCar {
	private String model;
	private RunsOn runsOn;
	private int numSeats;
	private LuxuryFeatures luxuryFeatures;
	private BigDecimal chargePerMile;
	
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
	
	public LuxuryFeatures getLuxuryFeatures() {
		return luxuryFeatures;
	}
	
	public void setLuxuryFeatures(LuxuryFeatures luxuryFeatures) {
		this.luxuryFeatures = luxuryFeatures;
	}
	
	public BigDecimal getChargePerMile() {
		return chargePerMile;
	}
	
	public void setChargePerMile(BigDecimal chargePerMile) {
		this.chargePerMile = chargePerMile;
	}
	
	@Override
	public String toString() {
		return "AutonomousCar{" +
				"model='" + model + '\'' +
				", runsOn=" + runsOn +
				", numSeats=" + numSeats +
				", luxuryFeatures=" + luxuryFeatures +
				", chargePerMile=" + chargePerMile +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		AutonomousCar that = (AutonomousCar) o;
		
		if (numSeats != that.numSeats) return false;
		if (!Objects.equals(model, that.model)) return false;
		if (runsOn != that.runsOn) return false;
		if (!Objects.equals(luxuryFeatures, that.luxuryFeatures))
			return false;
		return Objects.equals(chargePerMile, that.chargePerMile);
	}
	
	@Override
	public int hashCode() {
		int result = model != null ? model.hashCode() : 0;
		result = 31 * result + (runsOn != null ? runsOn.hashCode() : 0);
		result = 31 * result + numSeats;
		result = 31 * result + (luxuryFeatures != null ? luxuryFeatures.hashCode() : 0);
		result = 31 * result + (chargePerMile != null ? chargePerMile.hashCode() : 0);
		return result;
	}
}
