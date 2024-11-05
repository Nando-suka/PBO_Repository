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

public class Webinar {
	public Webinar() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_WEBINAR_PESERTA) {
			return ORM_peserta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_WEBINAR_JENIS_WEBINAR) {
			this.jenis_Webinar = (com.mercubuana.sisfopw.JenisWebinar) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String namaWebinar;
	
	private int kapasitas;
	
	private int sisaKapasitas;
	
	private java.util.Date tanggalPendaftaran;
	
	private com.mercubuana.sisfopw.JenisWebinar jenis_Webinar;
	
	private java.util.Set ORM_peserta = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNamaWebinar(String value) {
		this.namaWebinar = value;
	}
	
	public String getNamaWebinar() {
		return namaWebinar;
	}
	
	public void setKapasitas(int value) {
		this.kapasitas = value;
	}
	
	public int getKapasitas() {
		return kapasitas;
	}
	
	public void setSisaKapasitas(int value) {
		this.sisaKapasitas = value;
	}
	
	public int getSisaKapasitas() {
		return sisaKapasitas;
	}
	
	public void setTanggalPendaftaran(java.util.Date value) {
		this.tanggalPendaftaran = value;
	}
	
	public java.util.Date getTanggalPendaftaran() {
		return tanggalPendaftaran;
	}
	
	public void setJenis_Webinar(com.mercubuana.sisfopw.JenisWebinar value) {
		if (jenis_Webinar != null) {
			jenis_Webinar.webinar.remove(this);
		}
		if (value != null) {
			value.webinar.add(this);
		}
	}
	
	public com.mercubuana.sisfopw.JenisWebinar getJenis_Webinar() {
		return jenis_Webinar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jenis_Webinar(com.mercubuana.sisfopw.JenisWebinar value) {
		this.jenis_Webinar = value;
	}
	
	private com.mercubuana.sisfopw.JenisWebinar getORM_Jenis_Webinar() {
		return jenis_Webinar;
	}
	
	private void setORM_Peserta(java.util.Set value) {
		this.ORM_peserta = value;
	}
	
	private java.util.Set getORM_Peserta() {
		return ORM_peserta;
	}
	
	public final com.mercubuana.sisfopw.PesertaSetCollection peserta = new com.mercubuana.sisfopw.PesertaSetCollection(this, _ormAdapter, ORMConstants.KEY_WEBINAR_PESERTA, ORMConstants.KEY_PESERTA_WEBINAR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
