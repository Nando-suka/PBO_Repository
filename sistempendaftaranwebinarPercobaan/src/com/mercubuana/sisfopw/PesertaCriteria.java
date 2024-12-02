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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PesertaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression namaPeserta;
	public final CharacterExpression jenisKelamin;
	public final DateExpression tanggalLahir;
	public final IntegerExpression webinarId;
	public final AssociationExpression webinar;
	
	public PesertaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		namaPeserta = new StringExpression("namaPeserta", this);
		jenisKelamin = new CharacterExpression("jenisKelamin", this);
		tanggalLahir = new DateExpression("tanggalLahir", this);
		webinarId = new IntegerExpression("webinar.id", this);
		webinar = new AssociationExpression("webinar", this);
	}
	
	public PesertaCriteria(PersistentSession session) {
		this(session.createCriteria(Peserta.class));
	}
	
	public PesertaCriteria() throws PersistentException {
		this(SistempendaftaranwebinarPersistentManager.instance().getSession());
	}
	
	public WebinarCriteria createWebinarCriteria() {
		return new WebinarCriteria(createCriteria("webinar"));
	}
	
	public Peserta uniquePeserta() {
		return (Peserta) super.uniqueResult();
	}
	
	public Peserta[] listPeserta() {
		java.util.List list = super.list();
		return (Peserta[]) list.toArray(new Peserta[list.size()]);
	}
}

