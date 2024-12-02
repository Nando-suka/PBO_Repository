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

public class JenisWebinar {
	public JenisWebinar() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_JENISWEBINAR_WEBINAR) {
			return ORM_webinar;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String jenisWebinar;
	
	private int biaya;
	
	private int durasi;
	
	private String deskripsiJenis;
	
	private java.util.Set ORM_webinar = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setJenisWebinar(String value) {
		this.jenisWebinar = value;
	}
	
	public String getJenisWebinar() {
		return jenisWebinar;
	}
	
	public void setBiaya(int value) {
		this.biaya = value;
	}
	
	public int getBiaya() {
		return biaya;
	}
	
	public void setDurasi(int value) {
		this.durasi = value;
	}
	
	public int getDurasi() {
		return durasi;
	}
	
	public void setDeskripsiJenis(String value) {
		this.deskripsiJenis = value;
	}
	
	public String getDeskripsiJenis() {
		return deskripsiJenis;
	}
	
	private void setORM_Webinar(java.util.Set value) {
		this.ORM_webinar = value;
	}
	
	private java.util.Set getORM_Webinar() {
		return ORM_webinar;
	}
	
	public final com.mercubuana.sisfopw.WebinarSetCollection webinar = new com.mercubuana.sisfopw.WebinarSetCollection(this, _ormAdapter, ORMConstants.KEY_JENISWEBINAR_WEBINAR, ORMConstants.KEY_WEBINAR_JENIS_WEBINAR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
