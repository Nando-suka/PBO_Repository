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

public class WebinarDAO {
	public static Webinar loadWebinarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadWebinarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar getWebinarByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getWebinarByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadWebinarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar getWebinarByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return getWebinarByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Webinar) session.load(com.mercubuana.sisfopw.Webinar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar getWebinarByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Webinar) session.get(com.mercubuana.sisfopw.Webinar.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Webinar) session.load(com.mercubuana.sisfopw.Webinar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar getWebinarByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Webinar) session.get(com.mercubuana.sisfopw.Webinar.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWebinar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryWebinar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWebinar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return queryWebinar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar[] listWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar[] listWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return listWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWebinar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Webinar as Webinar");
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
	
	public static List queryWebinar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Webinar as Webinar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Webinar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar[] listWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryWebinar(session, condition, orderBy);
			return (Webinar[]) list.toArray(new Webinar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar[] listWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryWebinar(session, condition, orderBy, lockMode);
			return (Webinar[]) list.toArray(new Webinar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return loadWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Webinar[] webinars = listWebinarByQuery(session, condition, orderBy);
		if (webinars != null && webinars.length > 0)
			return webinars[0];
		else
			return null;
	}
	
	public static Webinar loadWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Webinar[] webinars = listWebinarByQuery(session, condition, orderBy, lockMode);
		if (webinars != null && webinars.length > 0)
			return webinars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateWebinarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iterateWebinarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWebinarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SistempendaftaranwebinarPersistentManager.instance().getSession();
			return iterateWebinarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWebinarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Webinar as Webinar");
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
	
	public static java.util.Iterator iterateWebinarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfopw.Webinar as Webinar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Webinar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar createWebinar() {
		return new com.mercubuana.sisfopw.Webinar();
	}
	
	public static boolean save(com.mercubuana.sisfopw.Webinar webinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().saveObject(webinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfopw.Webinar webinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().deleteObject(webinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.Webinar webinar)throws PersistentException {
		try {
			if (webinar.getJenis_Webinar() != null) {
				webinar.getJenis_Webinar().webinar.remove(webinar);
			}
			
			com.mercubuana.sisfopw.Peserta[] lPesertas = webinar.peserta.toArray();
			for(int i = 0; i < lPesertas.length; i++) {
				lPesertas[i].setWebinar(null);
			}
			return delete(webinar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfopw.Webinar webinar, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (webinar.getJenis_Webinar() != null) {
				webinar.getJenis_Webinar().webinar.remove(webinar);
			}
			
			com.mercubuana.sisfopw.Peserta[] lPesertas = webinar.peserta.toArray();
			for(int i = 0; i < lPesertas.length; i++) {
				lPesertas[i].setWebinar(null);
			}
			try {
				session.delete(webinar);
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
	
	public static boolean refresh(com.mercubuana.sisfopw.Webinar webinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().refresh(webinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfopw.Webinar webinar) throws PersistentException {
		try {
			SistempendaftaranwebinarPersistentManager.instance().getSession().evict(webinar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Webinar loadWebinarByCriteria(WebinarCriteria webinarCriteria) {
		Webinar[] webinars = listWebinarByCriteria(webinarCriteria);
		if(webinars == null || webinars.length == 0) {
			return null;
		}
		return webinars[0];
	}
	
	public static Webinar[] listWebinarByCriteria(WebinarCriteria webinarCriteria) {
		return webinarCriteria.listWebinar();
	}
}
