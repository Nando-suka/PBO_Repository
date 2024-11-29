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

public class KelasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression namaKelas;
	public final IntegerExpression hargaPerMalam;
	public final IntegerExpression hargaDokter;
	public final CollectionExpression kamar;
	
	public KelasCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		namaKelas = new StringExpression("namaKelas", this);
		hargaPerMalam = new IntegerExpression("hargaPerMalam", this);
		hargaDokter = new IntegerExpression("hargaDokter", this);
		kamar = new CollectionExpression("ORM_Kamar", this);
	}
	
	public KelasCriteria(PersistentSession session) {
		this(session.createCriteria(Kelas.class));
	}
	
	public KelasCriteria() throws PersistentException {
		this(SistemInformasiRSPersistentManager.instance().getSession());
	}
	
	public KamarCriteria createKamarCriteria() {
		return new KamarCriteria(createCriteria("ORM_Kamar"));
	}
	
	public Kelas uniqueKelas() {
		return (Kelas) super.uniqueResult();
	}
	
	public Kelas[] listKelas() {
		java.util.List list = super.list();
		return (Kelas[]) list.toArray(new Kelas[list.size()]);
	}
}

