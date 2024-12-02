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

public class JenisWebinarDAO {
	public static JenisWebinar loadJenisWebinarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadJenisWebinarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar getJenisWebinarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getJenisWebinarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadJenisWebinarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar getJenisWebinarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getJenisWebinarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (JenisWebinar) session.load(com.mercubuana.sisfopw.JenisWebinar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar getJenisWebinarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (JenisWebinar) session.get(com.mercubuana.sisfopw.JenisWebinar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (JenisWebinar) session.load(com.mercubuana.sisfopw.JenisWebinar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar getJenisWebinarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (JenisWebinar) session.get(com.mercubuana.sisfopw.JenisWebinar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJenisWebinar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryJenisWebinar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJenisWebinar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryJenisWebinar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar[] listJenisWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listJenisWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar[] listJenisWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listJenisWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJenisWebinar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.JenisWebinar as JenisWebinar");
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
	
	public static List queryJenisWebinar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.JenisWebinar as JenisWebinar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("JenisWebinar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar[] listJenisWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJenisWebinar(session, condition, orderBy);
			return (JenisWebinar[]) list.toArray(new JenisWebinar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar[] listJenisWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJenisWebinar(session, condition, orderBy, lockMode);
			return (JenisWebinar[]) list.toArray(new JenisWebinar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadJenisWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadJenisWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		JenisWebinar[] jenisWebinars = listJenisWebinarByQuery(session, condition, orderBy);
		if (jenisWebinars != null && jenisWebinars.length > 0)
			return jenisWebinars[0];
		else
			return null;
	}
	
	public static JenisWebinar loadJenisWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		JenisWebinar[] jenisWebinars = listJenisWebinarByQuery(session, condition, orderBy, lockMode);
		if (jenisWebinars != null && jenisWebinars.length > 0)
			return jenisWebinars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJenisWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iterateJenisWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJenisWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iterateJenisWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJenisWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.JenisWebinar as JenisWebinar");
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
	
	public static java.util.Iterator iterateJenisWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.JenisWebinar as JenisWebinar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("JenisWebinar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar createJenisWebinar() {
		return new com.mercubuana.sisfopw.JenisWebinar();
	}
	
	public static boolean save(com.mercubuana.sisfopw.JenisWebinar jenisWebinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().saveObject(jenisWebinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfopw.JenisWebinar jenisWebinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().deleteObject(jenisWebinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.JenisWebinar jenisWebinar)throws PersistentException {
		try {
			com.mercubuana.sisfopw.Webinar[] lWebinars = jenisWebinar.webinar.toArray();
			for(int i = 0; i < lWebinars.length; i++) {
				lWebinars[i].setJenis_Webinar(null);
			}
			return delete(jenisWebinar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.JenisWebinar jenisWebinar, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mercubuana.sisfopw.Webinar[] lWebinars = jenisWebinar.webinar.toArray();
			for(int i = 0; i < lWebinars.length; i++) {
				lWebinars[i].setJenis_Webinar(null);
			}
			try {
				session.delete(jenisWebinar);
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
	
	public static boolean refresh(com.mercubuana.sisfopw.JenisWebinar jenisWebinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().refresh(jenisWebinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfopw.JenisWebinar jenisWebinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().evict(jenisWebinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JenisWebinar loadJenisWebinarByCriteria(JenisWebinarCriteria jenisWebinarCriteria) {
		JenisWebinar[] jenisWebinars = listJenisWebinarByCriteria(jenisWebinarCriteria);
		if(jenisWebinars == null || jenisWebinars.length == 0) {
			return null;
		}
		return jenisWebinars[0];
	}
	
	public static JenisWebinar[] listJenisWebinarByCriteria(JenisWebinarCriteria jenisWebinarCriteria) {
		return jenisWebinarCriteria.listJenisWebinar();
	}
}
