/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteSistemInformasiRSData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfors.SistemInformasiRSPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfors.Kamar lcommercubuanasisforsKamar = com.mercubuana.sisfors.KamarDAO.loadKamarByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfors.KamarDAO.delete(lcommercubuanasisforsKamar);
			com.mercubuana.sisfors.Pasien lcommercubuanasisforsPasien = com.mercubuana.sisfors.PasienDAO.loadPasienByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfors.PasienDAO.delete(lcommercubuanasisforsPasien);
			com.mercubuana.sisfors.Kelas lcommercubuanasisforsKelas = com.mercubuana.sisfors.KelasDAO.loadKelasByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfors.KelasDAO.delete(lcommercubuanasisforsKelas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSistemInformasiRSData deleteSistemInformasiRSData = new DeleteSistemInformasiRSData();
			try {
				deleteSistemInformasiRSData.deleteTestData();
			}
			finally {
				com.mercubuana.sisfors.SistemInformasiRSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
