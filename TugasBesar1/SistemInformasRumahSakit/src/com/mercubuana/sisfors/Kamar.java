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

public class Kamar {
	public Kamar() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_KAMAR_PASIEN) {
			return ORM_pasien;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_KAMAR_KELAS) {
			this.kelas = (com.mercubuana.sisfors.Kelas) owner;
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
	
	private String namaKamar;
	
	private char jenisKelamin;
	
	private int kapasitas;
	
	private int sisa_tempat;
	
	private com.mercubuana.sisfors.Kelas kelas;
	
	private java.util.Set ORM_pasien = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNamaKamar(String value) {
		this.namaKamar = value;
	}
	
	public String getNamaKamar() {
		return namaKamar;
	}
	
	public void setJenisKelamin(char value) {
		this.jenisKelamin = value;
	}
	
	public char getJenisKelamin() {
		return jenisKelamin;
	}
	
	public void setKapasitas(int value) {
		this.kapasitas = value;
	}
	
	public int getKapasitas() {
		return kapasitas;
	}
	
	public void setSisa_tempat(int value) {
		this.sisa_tempat = value;
	}
	
	public int getSisa_tempat() {
		return sisa_tempat;
	}
	
	public void setKelas(com.mercubuana.sisfors.Kelas value) {
		if (kelas != null) {
			kelas.kamar.remove(this);
		}
		if (value != null) {
			value.kamar.add(this);
		}
	}
	
	public com.mercubuana.sisfors.Kelas getKelas() {
		return kelas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Kelas(com.mercubuana.sisfors.Kelas value) {
		this.kelas = value;
	}
	
	private com.mercubuana.sisfors.Kelas getORM_Kelas() {
		return kelas;
	}
	
	private void setORM_Pasien(java.util.Set value) {
		this.ORM_pasien = value;
	}
	
	private java.util.Set getORM_Pasien() {
		return ORM_pasien;
	}
	
	public final com.mercubuana.sisfors.PasienSetCollection pasien = new com.mercubuana.sisfors.PasienSetCollection(this, _ormAdapter, ORMConstants.KEY_KAMAR_PASIEN, ORMConstants.KEY_PASIEN_KAMAR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
