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

public class KelasDAO {
	public static Kelas loadKelasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKelasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas getKelasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getKelasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKelasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas getKelasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return getKelasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Kelas) session.load(com.mercubuana.sisfors.Kelas.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas getKelasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Kelas) session.get(com.mercubuana.sisfors.Kelas.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kelas) session.load(com.mercubuana.sisfors.Kelas.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas getKelasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kelas) session.get(com.mercubuana.sisfors.Kelas.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKelas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryKelas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKelas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return queryKelas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas[] listKelasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listKelasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas[] listKelasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return listKelasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKelas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kelas as Kelas");
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
	
	public static List queryKelas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kelas as Kelas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kelas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas[] listKelasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryKelas(session, condition, orderBy);
			return (Kelas[]) list.toArray(new Kelas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas[] listKelasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryKelas(session, condition, orderBy, lockMode);
			return (Kelas[]) list.toArray(new Kelas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKelasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return loadKelasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Kelas[] kelases = listKelasByQuery(session, condition, orderBy);
		if (kelases != null && kelases.length > 0)
			return kelases[0];
		else
			return null;
	}
	
	public static Kelas loadKelasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Kelas[] kelases = listKelasByQuery(session, condition, orderBy, lockMode);
		if (kelases != null && kelases.length > 0)
			return kelases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateKelasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iterateKelasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKelasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistemInformasiRSPersistentManager.instance().getSession();
			return iterateKelasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKelasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kelas as Kelas");
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
	
	public static java.util.Iterator iterateKelasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfors.Kelas as Kelas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kelas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas createKelas() {
		return new com.mercubuana.sisfors.Kelas();
	}
	
	public static boolean save(com.mercubuana.sisfors.Kelas kelas) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().saveObject(kelas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfors.Kelas kelas) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().deleteObject(kelas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Kelas kelas)throws PersistentException {
		try {
			com.mercubuana.sisfors.Kamar[] lKamars = kelas.kamar.toArray();
			for(int i = 0; i < lKamars.length; i++) {
				lKamars[i].setKelas(null);
			}
			return delete(kelas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfors.Kelas kelas, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mercubuana.sisfors.Kamar[] lKamars = kelas.kamar.toArray();
			for(int i = 0; i < lKamars.length; i++) {
				lKamars[i].setKelas(null);
			}
			try {
				session.delete(kelas);
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
	
	public static boolean refresh(com.mercubuana.sisfors.Kelas kelas) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().refresh(kelas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfors.Kelas kelas) throws PersistentException {
		try {
			SistemInformasiRSPersistentManager.instance().getSession().evict(kelas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kelas loadKelasByCriteria(KelasCriteria kelasCriteria) {
		Kelas[] kelases = listKelasByCriteria(kelasCriteria);
		if(kelases == null || kelases.length == 0) {
			return null;
		}
		return kelases[0];
	}
	
	public static Kelas[] listKelasByCriteria(KelasCriteria kelasCriteria) {
		return kelasCriteria.listKelas();
	}
}
