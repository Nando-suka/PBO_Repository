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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PasienDAO {
	public static Pasien loadPasienByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadPasienByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien getPasienByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getPasienByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadPasienByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien getPasienByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getPasienByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pasien) session.load(com.mercubuana.sisfors.Pasien.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien getPasienByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pasien) session.get(com.mercubuana.sisfors.Pasien.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pasien) session.load(com.mercubuana.sisfors.Pasien.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien getPasienByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pasien) session.get(com.mercubuana.sisfors.Pasien.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPasien(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryPasien(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPasien(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryPasien(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien[] listPasienByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listPasienByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien[] listPasienByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listPasienByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPasien(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Pasien as Pasien");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPasien(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Pasien as Pasien");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pasien", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien[] listPasienByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPasien(session, condition, orderBy);
			return (Pasien[]) list.toArray(new Pasien[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien[] listPasienByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPasien(session, condition, orderBy, lockMode);
			return (Pasien[]) list.toArray(new Pasien[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadPasienByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadPasienByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pasien[] pasiens = listPasienByQuery(session, condition, orderBy);
		if (pasiens != null && pasiens.length > 0)
			return pasiens[0];
		else
			return null;
	}
	
	public static Pasien loadPasienByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pasien[] pasiens = listPasienByQuery(session, condition, orderBy, lockMode);
		if (pasiens != null && pasiens.length > 0)
			return pasiens[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePasienByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iteratePasienByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePasienByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iteratePasienByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePasienByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Pasien as Pasien");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePasienByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Pasien as Pasien");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pasien", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien createPasien() {
		return new com.mercubuana.sisfors.Pasien();
	}
	
	public static boolean save(com.mercubuana.sisfors.Pasien pasien) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().saveObject(pasien);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfors.Pasien pasien) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().deleteObject(pasien);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Pasien pasien)throws PersistentException {
		try {
			if (pasien.getKamar() != null) {
				pasien.getKamar().pasien.remove(pasien);
			}
			
			return delete(pasien);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Pasien pasien, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pasien.getKamar() != null) {
				pasien.getKamar().pasien.remove(pasien);
			}
			
			try {
				session.delete(pasien);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mercubuana.sisfors.Pasien pasien) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().refresh(pasien);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfors.Pasien pasien) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().evict(pasien);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pasien loadPasienByCriteria(PasienCriteria pasienCriteria) {
		Pasien[] pasiens = listPasienByCriteria(pasienCriteria);
		if(pasiens == null || pasiens.length == 0) {
			return null;
		}
		return pasiens[0];
	}
	
	public static Pasien[] listPasienByCriteria(PasienCriteria pasienCriteria) {
		return pasienCriteria.listPasien();
	}
}
