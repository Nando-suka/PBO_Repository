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

public class WebinarCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression namaWebinar;
	public final IntegerExpression kapasitas;
	public final IntegerExpression sisaKapasitas;
	public final DateExpression tanggalPendaftaran;
	public final IntegerExpression jenis_WebinarId;
	public final AssociationExpression jenis_Webinar;
	public final CollectionExpression peserta;
	
	public WebinarCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		namaWebinar = new StringExpression("namaWebinar", this);
		kapasitas = new IntegerExpression("kapasitas", this);
		sisaKapasitas = new IntegerExpression("sisaKapasitas", this);
		tanggalPendaftaran = new DateExpression("tanggalPendaftaran", this);
		jenis_WebinarId = new IntegerExpression("jenis_Webinar.id", this);
		jenis_Webinar = new AssociationExpression("jenis_Webinar", this);
		peserta = new CollectionExpression("ORM_Peserta", this);
	}
	
	public WebinarCriteria(PersistentSession session) {
		this(session.createCriteria(Webinar.class));
	}
	
	public WebinarCriteria() throws PersistentException {
		this(SistempendaftaranwebinarPersistentManager.instance().getSession());
	}
	
	public JenisWebinarCriteria createJenis_WebinarCriteria() {
		return new JenisWebinarCriteria(createCriteria("jenis_Webinar"));
	}
	
	public PesertaCriteria createPesertaCriteria() {
		return new PesertaCriteria(createCriteria("ORM_Peserta"));
	}
	
	public Webinar uniqueWebinar() {
		return (Webinar) super.uniqueResult();
	}
	
	public Webinar[] listWebinar() {
		java.util.List list = super.list();
		return (Webinar[]) list.toArray(new Webinar[list.size()]);
	}
}

