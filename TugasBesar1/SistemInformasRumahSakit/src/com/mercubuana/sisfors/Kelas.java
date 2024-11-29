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

public class Kelas {
	public Kelas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_KELAS_KAMAR) {
			return ORM_kamar;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String namaKelas;
	
	private int hargaPerMalam;
	
	private int hargaDokter;
	
	private java.util.Set ORM_kamar = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNamaKelas(String value) {
		this.namaKelas = value;
	}
	
	public String getNamaKelas() {
		return namaKelas;
	}
	
	public void setHargaPerMalam(int value) {
		this.hargaPerMalam = value;
	}
	
	public int getHargaPerMalam() {
		return hargaPerMalam;
	}
	
	public void setHargaDokter(int value) {
		this.hargaDokter = value;
	}
	
	public int getHargaDokter() {
		return hargaDokter;
	}
	
	private void setORM_Kamar(java.util.Set value) {
		this.ORM_kamar = value;
	}
	
	private java.util.Set getORM_Kamar() {
		return ORM_kamar;
	}
	
	public final com.mercubuana.sisfors.KamarSetCollection kamar = new com.mercubuana.sisfors.KamarSetCollection(this, _ormAdapter, ORMConstants.KEY_KELAS_KAMAR, ORMConstants.KEY_KAMAR_KELAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
