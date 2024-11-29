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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class KamarCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression namaKamar;
	public final CharacterExpression jenisKelamin;
	public final IntegerExpression kapasitas;
	public final IntegerExpression sisa_tempat;
	public final IntegerExpression kelasId;
	public final AssociationExpression kelas;
	public final CollectionExpression pasien;
	
	public KamarCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		namaKamar = new StringExpression("namaKamar", this);
		jenisKelamin = new CharacterExpression("jenisKelamin", this);
		kapasitas = new IntegerExpression("kapasitas", this);
		sisa_tempat = new IntegerExpression("sisa_tempat", this);
		kelasId = new IntegerExpression("kelas.id", this);
		kelas = new AssociationExpression("kelas", this);
		pasien = new CollectionExpression("ORM_Pasien", this);
	}
	
	public KamarCriteria(PersistentSession session) {
		this(session.createCriteria(Kamar.class));
	}
	
	public KamarCriteria() throws PersistentException {
		this(SistemInformasiRSPersistentManager.instance().getSession());
	}
	
	public KelasCriteria createKelasCriteria() {
		return new KelasCriteria(createCriteria("kelas"));
	}
	
	public PasienCriteria createPasienCriteria() {
		return new PasienCriteria(createCriteria("ORM_Pasien"));
	}
	
	public Kamar uniqueKamar() {
		return (Kamar) super.uniqueResult();
	}
	
	public Kamar[] listKamar() {
		java.util.List list = super.list();
		return (Kamar[]) list.toArray(new Kamar[list.size()]);
	}
}

