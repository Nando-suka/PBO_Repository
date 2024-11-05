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
package com.mercubuana.sisfopw;

public class Peserta {
	public Peserta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PESERTA_WEBINAR) {
			this.webinar = (com.mercubuana.sisfopw.Webinar) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String namaPeserta;
	
	private char jenisKelamin;
	
	private java.util.Date tanggalLahir;
	
	private com.mercubuana.sisfopw.Webinar webinar;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNamaPeserta(String value) {
		this.namaPeserta = value;
	}
	
	public String getNamaPeserta() {
		return namaPeserta;
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
	
	public void setWebinar(com.mercubuana.sisfopw.Webinar value) {
		if (webinar != null) {
			webinar.peserta.remove(this);
		}
		if (value != null) {
			value.peserta.add(this);
		}
	}
	
	public com.mercubuana.sisfopw.Webinar getWebinar() {
		return webinar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Webinar(com.mercubuana.sisfopw.Webinar value) {
		this.webinar = value;
	}
	
	private com.mercubuana.sisfopw.Webinar getORM_Webinar() {
		return webinar;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
