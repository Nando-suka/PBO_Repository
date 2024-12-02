/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateSistempendaftaranwebinarData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfopw.Webinar lcommercubuanasisfopwWebinar = com.mercubuana.sisfopw.WebinarDAO.loadWebinarByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfopw.WebinarDAO.save(lcommercubuanasisfopwWebinar);
			com.mercubuana.sisfopw.Peserta lcommercubuanasisfopwPeserta = com.mercubuana.sisfopw.PesertaDAO.loadPesertaByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfopw.PesertaDAO.save(lcommercubuanasisfopwPeserta);
			com.mercubuana.sisfopw.JenisWebinar lcommercubuanasisfopwJenisWebinar = com.mercubuana.sisfopw.JenisWebinarDAO.loadJenisWebinarByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfopw.JenisWebinarDAO.save(lcommercubuanasisfopwJenisWebinar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Webinar by WebinarCriteria");
		com.mercubuana.sisfopw.WebinarCriteria lcommercubuanasisfopwWebinarCriteria = new com.mercubuana.sisfopw.WebinarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfopwWebinarCriteria.id.eq();
		System.out.println(lcommercubuanasisfopwWebinarCriteria.uniqueWebinar());
		
		System.out.println("Retrieving Peserta by PesertaCriteria");
		com.mercubuana.sisfopw.PesertaCriteria lcommercubuanasisfopwPesertaCriteria = new com.mercubuana.sisfopw.PesertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfopwPesertaCriteria.id.eq();
		System.out.println(lcommercubuanasisfopwPesertaCriteria.uniquePeserta());
		
		System.out.println("Retrieving JenisWebinar by JenisWebinarCriteria");
		com.mercubuana.sisfopw.JenisWebinarCriteria lcommercubuanasisfopwJenisWebinarCriteria = new com.mercubuana.sisfopw.JenisWebinarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfopwJenisWebinarCriteria.id.eq();
		System.out.println(lcommercubuanasisfopwJenisWebinarCriteria.uniqueJenisWebinar());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateSistempendaftaranwebinarData retrieveAndUpdateSistempendaftaranwebinarData = new RetrieveAndUpdateSistempendaftaranwebinarData();
			try {
				retrieveAndUpdateSistempendaftaranwebinarData.retrieveAndUpdateTestData();
				//retrieveAndUpdateSistempendaftaranwebinarData.retrieveByCriteria();
			}
			finally {
				com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
