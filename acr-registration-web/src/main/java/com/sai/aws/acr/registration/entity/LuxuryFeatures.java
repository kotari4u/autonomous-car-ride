package com.sai.aws.acr.registration.entity;

public class LuxuryFeatures {
	private boolean isHaveAudio;
	private boolean isHaveVideo;
	private boolean isHaveLeatherSeating;
	
	public boolean isHaveAudio() {
		return isHaveAudio;
	}
	
	public void setHaveAudio(boolean haveAudio) {
		isHaveAudio = haveAudio;
	}
	
	public boolean isHaveVideo() {
		return isHaveVideo;
	}
	
	public void setHaveVideo(boolean haveVideo) {
		isHaveVideo = haveVideo;
	}
	
	public boolean isHaveLeatherSeating() {
		return isHaveLeatherSeating;
	}
	
	public void setHaveLeatherSeating(boolean haveLeatherSeating) {
		isHaveLeatherSeating = haveLeatherSeating;
	}
	
	@Override
	public String toString() {
		return "LuxuryFeatures{" +
				"isHaveAudio=" + isHaveAudio +
				", isHaveVideo=" + isHaveVideo +
				", isHaveLeatherSeating=" + isHaveLeatherSeating +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		LuxuryFeatures that = (LuxuryFeatures) o;
		
		if (isHaveAudio != that.isHaveAudio) return false;
		if (isHaveVideo != that.isHaveVideo) return false;
		return isHaveLeatherSeating == that.isHaveLeatherSeating;
	}
	
	@Override
	public int hashCode() {
		int result = (isHaveAudio ? 1 : 0);
		result = 31 * result + (isHaveVideo ? 1 : 0);
		result = 31 * result + (isHaveLeatherSeating ? 1 : 0);
		return result;
	}
}