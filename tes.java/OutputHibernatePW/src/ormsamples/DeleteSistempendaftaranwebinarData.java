/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteSistempendaftaranwebinarData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfopw.Webinar lcommercubuanasisfopwWebinar = com.mercubuana.sisfopw.WebinarDAO.loadWebinarByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfopw.WebinarDAO.delete(lcommercubuanasisfopwWebinar);
			com.mercubuana.sisfopw.Peserta lcommercubuanasisfopwPeserta = com.mercubuana.sisfopw.PesertaDAO.loadPesertaByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfopw.PesertaDAO.delete(lcommercubuanasisfopwPeserta);
			com.mercubuana.sisfopw.JenisWebinar lcommercubuanasisfopwJenisWebinar = com.mercubuana.sisfopw.JenisWebinarDAO.loadJenisWebinarByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfopw.JenisWebinarDAO.delete(lcommercubuanasisfopwJenisWebinar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSistempendaftaranwebinarData deleteSistempendaftaranwebinarData = new DeleteSistempendaftaranwebinarData();
			try {
				deleteSistempendaftaranwebinarData.deleteTestData();
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
