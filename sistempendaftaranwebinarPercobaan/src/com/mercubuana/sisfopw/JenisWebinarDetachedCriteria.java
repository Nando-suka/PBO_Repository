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

public class JenisWebinarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression jenisWebinar;
	public final IntegerExpression biaya;
	public final IntegerExpression durasi;
	public final StringExpression deskripsiJenis;
	public final CollectionExpression webinar;
	
	public JenisWebinarDetachedCriteria() {
		super(com.mercubuana.sisfopw.JenisWebinar.class, com.mercubuana.sisfopw.JenisWebinarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jenisWebinar = new StringExpression("jenisWebinar", this.getDetachedCriteria());
		biaya = new IntegerExpression("biaya", this.getDetachedCriteria());
		durasi = new IntegerExpression("durasi", this.getDetachedCriteria());
		deskripsiJenis = new StringExpression("deskripsiJenis", this.getDetachedCriteria());
		webinar = new CollectionExpression("ORM_Webinar", this.getDetachedCriteria());
	}
	
	public JenisWebinarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfopw.JenisWebinarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jenisWebinar = new StringExpression("jenisWebinar", this.getDetachedCriteria());
		biaya = new IntegerExpression("biaya", this.getDetachedCriteria());
		durasi = new IntegerExpression("durasi", this.getDetachedCriteria());
		deskripsiJenis = new StringExpression("deskripsiJenis", this.getDetachedCriteria());
		webinar = new CollectionExpression("ORM_Webinar", this.getDetachedCriteria());
	}
	
	public WebinarDetachedCriteria createWebinarCriteria() {
		return new WebinarDetachedCriteria(createCriteria("ORM_Webinar"));
	}
	
	public JenisWebinar uniqueJenisWebinar(PersistentSession session) {
		return (JenisWebinar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public JenisWebinar[] listJenisWebinar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (JenisWebinar[]) list.toArray(new JenisWebinar[list.size()]);
	}
}

