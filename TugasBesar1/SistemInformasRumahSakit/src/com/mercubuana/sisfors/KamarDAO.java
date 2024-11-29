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

public class KamarDAO {
	public static Kamar loadKamarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKamarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getKamarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKamarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getKamarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Kamar) session.load(com.mercubuana.sisfors.Kamar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Kamar) session.get(com.mercubuana.sisfors.Kamar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kamar) session.load(com.mercubuana.sisfors.Kamar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kamar) session.get(com.mercubuana.sisfors.Kamar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryKamar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryKamar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kamar as Kamar");
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
	
	public static List queryKamar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kamar as Kamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kamar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryKamar(session, condition, orderBy);
			return (Kamar[]) list.toArray(new Kamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryKamar(session, condition, orderBy, lockMode);
			return (Kamar[]) list.toArray(new Kamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Kamar[] kamars = listKamarByQuery(session, condition, orderBy);
		if (kamars != null && kamars.length > 0)
			return kamars[0];
		else
			return null;
	}
	
	public static Kamar loadKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Kamar[] kamars = listKamarByQuery(session, condition, orderBy, lockMode);
		if (kamars != null && kamars.length > 0)
			return kamars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iterateKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iterateKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kamar as Kamar");
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
	
	public static java.util.Iterator iterateKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kamar as Kamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kamar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar createKamar() {
		return new com.mercubuana.sisfors.Kamar();
	}
	
	public static boolean save(com.mercubuana.sisfors.Kamar kamar) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().saveObject(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfors.Kamar kamar) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().deleteObject(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Kamar kamar)throws PersistentException {
		try {
			if (kamar.getKelas() != null) {
				kamar.getKelas().kamar.remove(kamar);
			}
			
			com.mercubuana.sisfors.Pasien[] lPasiens = kamar.pasien.toArray();
			for(int i = 0; i < lPasiens.length; i++) {
				lPasiens[i].setKamar(null);
			}
			return delete(kamar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Kamar kamar, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (kamar.getKelas() != null) {
				kamar.getKelas().kamar.remove(kamar);
			}
			
			com.mercubuana.sisfors.Pasien[] lPasiens = kamar.pasien.toArray();
			for(int i = 0; i < lPasiens.length; i++) {
				lPasiens[i].setKamar(null);
			}
			try {
				session.delete(kamar);
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
	
	public static boolean refresh(com.mercubuana.sisfors.Kamar kamar) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().refresh(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfors.Kamar kamar) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().evict(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByCriteria(KamarCriteria kamarCriteria) {
		Kamar[] kamars = listKamarByCriteria(kamarCriteria);
		if(kamars == null || kamars.length == 0) {
			return null;
		}
		return kamars[0];
	}
	
	public static Kamar[] listKamarByCriteria(KamarCriteria kamarCriteria) {
		return kamarCriteria.listKamar();
	}
}
