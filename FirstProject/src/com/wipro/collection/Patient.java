package com.wipro.collection;

public class Patient implements Comparable<Patient>  {
	private Integer patientId;
	private String patientName;
	
	public Patient(Integer patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String toString() {
		return "Patient[patientId=" +patientId+",patientName="+patientName+" ]";
	}

	@Override
	public int compareTo(Patient o) {
		
		//return this.getPatientId().compareTo(o.getPatientId());
		return this.getPatientName().compareTo(o.getPatientName());
	}

	

}
