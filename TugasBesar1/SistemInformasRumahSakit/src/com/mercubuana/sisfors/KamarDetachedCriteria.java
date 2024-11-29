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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class KamarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression namaKamar;
	public final CharacterExpression jenisKelamin;
	public final IntegerExpression kapasitas;
	public final IntegerExpression sisa_tempat;
	public final IntegerExpression kelasId;
	public final AssociationExpression kelas;
	public final CollectionExpression pasien;
	
	public KamarDetachedCriteria() {
		super(com.mercubuana.sisfors.Kamar.class, com.mercubuana.sisfors.KamarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaKamar = new StringExpression("namaKamar", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		kapasitas = new IntegerExpression("kapasitas", this.getDetachedCriteria());
		sisa_tempat = new IntegerExpression("sisa_tempat", this.getDetachedCriteria());
		kelasId = new IntegerExpression("kelas.id", this.getDetachedCriteria());
		kelas = new AssociationExpression("kelas", this.getDetachedCriteria());
		pasien = new CollectionExpression("ORM_Pasien", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfors.KamarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaKamar = new StringExpression("namaKamar", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		kapasitas = new IntegerExpression("kapasitas", this.getDetachedCriteria());
		sisa_tempat = new IntegerExpression("sisa_tempat", this.getDetachedCriteria());
		kelasId = new IntegerExpression("kelas.id", this.getDetachedCriteria());
		kelas = new AssociationExpression("kelas", this.getDetachedCriteria());
		pasien = new CollectionExpression("ORM_Pasien", this.getDetachedCriteria());
	}
	
	public KelasDetachedCriteria createKelasCriteria() {
		return new KelasDetachedCriteria(createCriteria("kelas"));
	}
	
	public PasienDetachedCriteria createPasienCriteria() {
		return new PasienDetachedCriteria(createCriteria("ORM_Pasien"));
	}
	
	public Kamar uniqueKamar(PersistentSession session) {
		return (Kamar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Kamar[] listKamar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Kamar[]) list.toArray(new Kamar[list.size()]);
	}
}

