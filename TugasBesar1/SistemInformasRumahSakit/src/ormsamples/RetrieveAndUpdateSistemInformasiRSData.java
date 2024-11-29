/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateSistemInformasiRSData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfors.SistemInformasiRSPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfors.Kamar lcommercubuanasisforsKamar = com.mercubuana.sisfors.KamarDAO.loadKamarByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfors.KamarDAO.save(lcommercubuanasisforsKamar);
			com.mercubuana.sisfors.Pasien lcommercubuanasisforsPasien = com.mercubuana.sisfors.PasienDAO.loadPasienByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfors.PasienDAO.save(lcommercubuanasisforsPasien);
			com.mercubuana.sisfors.Kelas lcommercubuanasisforsKelas = com.mercubuana.sisfors.KelasDAO.loadKelasByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfors.KelasDAO.save(lcommercubuanasisforsKelas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Kamar by KamarCriteria");
		com.mercubuana.sisfors.KamarCriteria lcommercubuanasisforsKamarCriteria = new com.mercubuana.sisfors.KamarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisforsKamarCriteria.id.eq();
		System.out.println(lcommercubuanasisforsKamarCriteria.uniqueKamar());
		
		System.out.println("Retrieving Pasien by PasienCriteria");
		com.mercubuana.sisfors.PasienCriteria lcommercubuanasisforsPasienCriteria = new com.mercubuana.sisfors.PasienCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisforsPasienCriteria.id.eq();
		System.out.println(lcommercubuanasisforsPasienCriteria.uniquePasien());
		
		System.out.println("Retrieving Kelas by KelasCriteria");
		com.mercubuana.sisfors.KelasCriteria lcommercubuanasisforsKelasCriteria = new com.mercubuana.sisfors.KelasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisforsKelasCriteria.id.eq();
		System.out.println(lcommercubuanasisforsKelasCriteria.uniqueKelas());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateSistemInformasiRSData retrieveAndUpdateSistemInformasiRSData = new RetrieveAndUpdateSistemInformasiRSData();
			try {
				retrieveAndUpdateSistemInformasiRSData.retrieveAndUpdateTestData();
				//retrieveAndUpdateSistemInformasiRSData.retrieveByCriteria();
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
