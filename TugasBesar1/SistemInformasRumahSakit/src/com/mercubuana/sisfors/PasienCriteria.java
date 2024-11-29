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

public class PasienCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression namaPasien;
	public final CharacterExpression jenisKelamin;
	public final DateExpression tanggalLahir;
	public final IntegerExpression kamarId;
	public final AssociationExpression kamar;
	
	public PasienCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		namaPasien = new StringExpression("namaPasien", this);
		jenisKelamin = new CharacterExpression("jenisKelamin", this);
		tanggalLahir = new DateExpression("tanggalLahir", this);
		kamarId = new IntegerExpression("kamar.id", this);
		kamar = new AssociationExpression("kamar", this);
	}
	
	public PasienCriteria(PersistentSession session) {
		this(session.createCriteria(Pasien.class));
	}
	
	public PasienCriteria() throws PersistentException {
		this(SistemInformasiRSPersistentManager.instance().getSession());
	}
	
	public KamarCriteria createKamarCriteria() {
		return new KamarCriteria(createCriteria("kamar"));
	}
	
	public Pasien uniquePasien() {
		return (Pasien) super.uniqueResult();
	}
	
	public Pasien[] listPasien() {
		java.util.List list = super.list();
		return (Pasien[]) list.toArray(new Pasien[list.size()]);
	}
}

