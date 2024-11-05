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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PesertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression namaPeserta;
	public final CharacterExpression jenisKelamin;
	public final DateExpression tanggalLahir;
	public final IntegerExpression webinarId;
	public final AssociationExpression webinar;
	
	public PesertaDetachedCriteria() {
		super(com.mercubuana.sisfopw.Peserta.class, com.mercubuana.sisfopw.PesertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaPeserta = new StringExpression("namaPeserta", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		tanggalLahir = new DateExpression("tanggalLahir", this.getDetachedCriteria());
		webinarId = new IntegerExpression("webinar.id", this.getDetachedCriteria());
		webinar = new AssociationExpression("webinar", this.getDetachedCriteria());
	}
	
	public PesertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfopw.PesertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaPeserta = new StringExpression("namaPeserta", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		tanggalLahir = new DateExpression("tanggalLahir", this.getDetachedCriteria());
		webinarId = new IntegerExpression("webinar.id", this.getDetachedCriteria());
		webinar = new AssociationExpression("webinar", this.getDetachedCriteria());
	}
	
	public WebinarDetachedCriteria createWebinarCriteria() {
		return new WebinarDetachedCriteria(createCriteria("webinar"));
	}
	
	public Peserta uniquePeserta(PersistentSession session) {
		return (Peserta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Peserta[] listPeserta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Peserta[]) list.toArray(new Peserta[list.size()]);
	}
}

