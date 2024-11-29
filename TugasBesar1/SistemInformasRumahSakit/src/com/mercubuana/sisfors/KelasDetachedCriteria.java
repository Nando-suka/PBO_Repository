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

public class KelasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression namaKelas;
	public final IntegerExpression hargaPerMalam;
	public final IntegerExpression hargaDokter;
	public final CollectionExpression kamar;
	
	public KelasDetachedCriteria() {
		super(com.mercubuana.sisfors.Kelas.class, com.mercubuana.sisfors.KelasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaKelas = new StringExpression("namaKelas", this.getDetachedCriteria());
		hargaPerMalam = new IntegerExpression("hargaPerMalam", this.getDetachedCriteria());
		hargaDokter = new IntegerExpression("hargaDokter", this.getDetachedCriteria());
		kamar = new CollectionExpression("ORM_Kamar", this.getDetachedCriteria());
	}
	
	public KelasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfors.KelasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaKelas = new StringExpression("namaKelas", this.getDetachedCriteria());
		hargaPerMalam = new IntegerExpression("hargaPerMalam", this.getDetachedCriteria());
		hargaDokter = new IntegerExpression("hargaDokter", this.getDetachedCriteria());
		kamar = new CollectionExpression("ORM_Kamar", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria createKamarCriteria() {
		return new KamarDetachedCriteria(createCriteria("ORM_Kamar"));
	}
	
	public Kelas uniqueKelas(PersistentSession session) {
		return (Kelas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Kelas[] listKelas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Kelas[]) list.toArray(new Kelas[list.size()]);
	}
}

