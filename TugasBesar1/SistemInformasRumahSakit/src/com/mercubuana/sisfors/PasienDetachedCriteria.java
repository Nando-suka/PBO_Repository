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

public class PasienDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression namaPasien;
	public final CharacterExpression jenisKelamin;
	public final DateExpression tanggalLahir;
	public final IntegerExpression kamarId;
	public final AssociationExpression kamar;
	
	public PasienDetachedCriteria() {
		super(com.mercubuana.sisfors.Pasien.class, com.mercubuana.sisfors.PasienCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaPasien = new StringExpression("namaPasien", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		tanggalLahir = new DateExpression("tanggalLahir", this.getDetachedCriteria());
		kamarId = new IntegerExpression("kamar.id", this.getDetachedCriteria());
		kamar = new AssociationExpression("kamar", this.getDetachedCriteria());
	}
	
	public PasienDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfors.PasienCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		namaPasien = new StringExpression("namaPasien", this.getDetachedCriteria());
		jenisKelamin = new CharacterExpression("jenisKelamin", this.getDetachedCriteria());
		tanggalLahir = new DateExpression("tanggalLahir", this.getDetachedCriteria());
		kamarId = new IntegerExpression("kamar.id", this.getDetachedCriteria());
		kamar = new AssociationExpression("kamar", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria createKamarCriteria() {
		return new KamarDetachedCriteria(createCriteria("kamar"));
	}
	
	public Pasien uniquePasien(PersistentSession session) {
		return (Pasien) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pasien[] listPasien(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pasien[]) list.toArray(new Pasien[list.size()]);
	}
}

