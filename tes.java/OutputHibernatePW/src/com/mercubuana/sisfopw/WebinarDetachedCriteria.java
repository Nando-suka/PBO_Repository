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

public class WebinarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression namaWebinar;
	public final IntegerExpression kapasitas;
	public final IntegerExpression sisaKapasitas;
	public final DateExpression tanggalPendaftaran;
	public final IntegerExpression jenis_WebinarId;
	public final AssociationExpression jenis_Webinar;
	public final CollectionExpression peserta;
	
	public WebinarDetachedCriteria() {
		super(com.mercubuana.sisfopw.Webinar.class, com.mercubuana.sisfopw.WebinarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaWebinar = new StringExpression("namaWebinar", this.getDetachedCriteria());
		kapasitas = new IntegerExpression("kapasitas", this.getDetachedCriteria());
		sisaKapasitas = new IntegerExpression("sisaKapasitas", this.getDetachedCriteria());
		tanggalPendaftaran = new DateExpression("tanggalPendaftaran", this.getDetachedCriteria());
		jenis_WebinarId = new IntegerExpression("jenis_Webinar.id", this.getDetachedCriteria());
		jenis_Webinar = new AssociationExpression("jenis_Webinar", this.getDetachedCriteria());
		peserta = new CollectionExpression("ORM_Peserta", this.getDetachedCriteria());
	}
	
	public WebinarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfopw.WebinarCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaWebinar = new StringExpression("namaWebinar", this.getDetachedCriteria());
		kapasitas = new IntegerExpression("kapasitas", this.getDetachedCriteria());
		sisaKapasitas = new IntegerExpression("sisaKapasitas", this.getDetachedCriteria());
		tanggalPendaftaran = new DateExpression("tanggalPendaftaran", this.getDetachedCriteria());
		jenis_WebinarId = new IntegerExpression("jenis_Webinar.id", this.getDetachedCriteria());
		jenis_Webinar = new AssociationExpression("jenis_Webinar", this.getDetachedCriteria());
		peserta = new CollectionExpression("ORM_Peserta", this.getDetachedCriteria());
	}
	
	public JenisWebinarDetachedCriteria createJenis_WebinarCriteria() {
		return new JenisWebinarDetachedCriteria(createCriteria("jenis_Webinar"));
	}
	
	public PesertaDetachedCriteria createPesertaCriteria() {
		return new PesertaDetachedCriteria(createCriteria("ORM_Peserta"));
	}
	
	public Webinar uniqueWebinar(PersistentSession session) {
		return (Webinar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Webinar[] listWebinar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Webinar[]) list.toArray(new Webinar[list.size()]);
	}
}

