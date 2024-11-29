/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.mercubuana.sisfors;

public class Pasien {
	public Pasien() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PASIEN_KAMAR) {
			this.kamar = (com.mercubuana.sisfors.Kamar) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String namaPasien;
	
	private char jenisKelamin;
	
	private java.util.Date tanggalLahir;
	
	private com.mercubuana.sisfors.Kamar kamar;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNamaPasien(String value) {
		this.namaPasien = value;
	}
	
	public String getNamaPasien() {
		return namaPasien;
	}
	
	public void setJenisKelamin(char value) {
		this.jenisKelamin = value;
	}
	
	public char getJenisKelamin() {
		return jenisKelamin;
	}
	
	public void setTanggalLahir(java.util.Date value) {
		this.tanggalLahir = value;
	}
	
	public java.util.Date getTanggalLahir() {
		return tanggalLahir;
	}
	
	public void setKamar(com.mercubuana.sisfors.Kamar value) {
		if (kamar != null) {
			kamar.pasien.remove(this);
		}
		if (value != null) {
			value.pasien.add(this);
		}
	}
	
	public com.mercubuana.sisfors.Kamar getKamar() {
		return kamar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Kamar(com.mercubuana.sisfors.Kamar value) {
		this.kamar = value;
	}
	
	private com.mercubuana.sisfors.Kamar getORM_Kamar() {
		return kamar;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
