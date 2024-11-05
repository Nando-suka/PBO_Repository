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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PesertaDAO {
	public static Peserta loadPesertaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadPesertaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta getPesertaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getPesertaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadPesertaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta getPesertaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getPesertaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Peserta) session.load(com.mercubuana.sisfopw.Peserta.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta getPesertaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Peserta) session.get(com.mercubuana.sisfopw.Peserta.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Peserta) session.load(com.mercubuana.sisfopw.Peserta.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta getPesertaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Peserta) session.get(com.mercubuana.sisfopw.Peserta.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeserta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryPeserta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeserta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryPeserta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta[] listPesertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listPesertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta[] listPesertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listPesertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeserta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Peserta as Peserta");
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
	
	public static List queryPeserta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Peserta as Peserta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Peserta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta[] listPesertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeserta(session, condition, orderBy);
			return (Peserta[]) list.toArray(new Peserta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta[] listPesertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeserta(session, condition, orderBy, lockMode);
			return (Peserta[]) list.toArray(new Peserta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadPesertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadPesertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Peserta[] pesertas = listPesertaByQuery(session, condition, orderBy);
		if (pesertas != null && pesertas.length > 0)
			return pesertas[0];
		else
			return null;
	}
	
	public static Peserta loadPesertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Peserta[] pesertas = listPesertaByQuery(session, condition, orderBy, lockMode);
		if (pesertas != null && pesertas.length > 0)
			return pesertas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePesertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iteratePesertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePesertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iteratePesertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePesertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Peserta as Peserta");
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
	
	public static java.util.Iterator iteratePesertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Peserta as Peserta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Peserta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta createPeserta() {
		return new com.mercubuana.sisfopw.Peserta();
	}
	
	public static boolean save(com.mercubuana.sisfopw.Peserta peserta) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().saveObject(peserta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfopw.Peserta peserta) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().deleteObject(peserta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.Peserta peserta)throws PersistentException {
		try {
			if (peserta.getWebinar() != null) {
				peserta.getWebinar().peserta.remove(peserta);
			}
			
			return delete(peserta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.Peserta peserta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (peserta.getWebinar() != null) {
				peserta.getWebinar().peserta.remove(peserta);
			}
			
			try {
				session.delete(peserta);
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
	
	public static boolean refresh(com.mercubuana.sisfopw.Peserta peserta) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().refresh(peserta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfopw.Peserta peserta) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().evict(peserta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Peserta loadPesertaByCriteria(PesertaCriteria pesertaCriteria) {
		Peserta[] pesertas = listPesertaByCriteria(pesertaCriteria);
		if(pesertas == null || pesertas.length == 0) {
			return null;
		}
		return pesertas[0];
	}
	
	public static Peserta[] listPesertaByCriteria(PesertaCriteria pesertaCriteria) {
		return pesertaCriteria.listPeserta();
	}
}
