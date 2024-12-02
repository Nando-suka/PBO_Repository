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

public class JenisWebinarCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression jenisWebinar;
	public final IntegerExpression biaya;
	public final IntegerExpression durasi;
	public final StringExpression deskripsiJenis;
	public final CollectionExpression webinar;
	
	public JenisWebinarCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		jenisWebinar = new StringExpression("jenisWebinar", this);
		biaya = new IntegerExpression("biaya", this);
		durasi = new IntegerExpression("durasi", this);
		deskripsiJenis = new StringExpression("deskripsiJenis", this);
		webinar = new CollectionExpression("ORM_Webinar", this);
	}
	
	public JenisWebinarCriteria(PersistentSession session) {
		this(session.createCriteria(JenisWebinar.class));
	}
	
	public JenisWebinarCriteria() throws PersistentException {
		this(SistempendaftaranwebinarPersistentManager.instance().getSession());
	}
	
	public WebinarCriteria createWebinarCriteria() {
		return new WebinarCriteria(createCriteria("ORM_Webinar"));
	}
	
	public JenisWebinar uniqueJenisWebinar() {
		return (JenisWebinar) super.uniqueResult();
	}
	
	public JenisWebinar[] listJenisWebinar() {
		java.util.List list = super.list();
		return (JenisWebinar[]) list.toArray(new JenisWebinar[list.size()]);
	}
}

