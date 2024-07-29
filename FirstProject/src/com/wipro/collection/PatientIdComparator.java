package com.wipro.collection;

import java.util.Comparator;

public class PatientIdComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		/*Patient p1= (Patient) o1;
		Patient p2= (Patient) o2;*/
		
		return -o1.getPatientId().compareTo(o2.getPatientId());
	}

}
