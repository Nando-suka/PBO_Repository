/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListSistemInformasiRSData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Kamar...");
		com.mercubuana.sisfors.Kamar[] commercubuanasisforsKamars = com.mercubuana.sisfors.KamarDAO.listKamarByQuery(null, null);
		int length = Math.min(commercubuanasisforsKamars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisforsKamars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pasien...");
		com.mercubuana.sisfors.Pasien[] commercubuanasisforsPasiens = com.mercubuana.sisfors.PasienDAO.listPasienByQuery(null, null);
		length = Math.min(commercubuanasisforsPasiens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisforsPasiens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Kelas...");
		com.mercubuana.sisfors.Kelas[] commercubuanasisforsKelases = com.mercubuana.sisfors.KelasDAO.listKelasByQuery(null, null);
		length = Math.min(commercubuanasisforsKelases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisforsKelases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Kamar by Criteria...");
		com.mercubuana.sisfors.KamarCriteria lcommercubuanasisforsKamarCriteria = new com.mercubuana.sisfors.KamarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisforsKamarCriteria.id.eq();
		lcommercubuanasisforsKamarCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfors.Kamar[] commercubuanasisforsKamars = lcommercubuanasisforsKamarCriteria.listKamar();
		int length =commercubuanasisforsKamars== null ? 0 : Math.min(commercubuanasisforsKamars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisforsKamars[i]);
		}
		System.out.println(length + " Kamar record(s) retrieved."); 
		
		System.out.println("Listing Pasien by Criteria...");
		com.mercubuana.sisfors.PasienCriteria lcommercubuanasisforsPasienCriteria = new com.mercubuana.sisfors.PasienCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisforsPasienCriteria.id.eq();
		lcommercubuanasisforsPasienCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfors.Pasien[] commercubuanasisforsPasiens = lcommercubuanasisforsPasienCriteria.listPasien();
		length =commercubuanasisforsPasiens== null ? 0 : Math.min(commercubuanasisforsPasiens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisforsPasiens[i]);
		}
		System.out.println(length + " Pasien record(s) retrieved."); 
		
		System.out.println("Listing Kelas by Criteria...");
		com.mercubuana.sisfors.KelasCriteria lcommercubuanasisforsKelasCriteria = new com.mercubuana.sisfors.KelasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisforsKelasCriteria.id.eq();
		lcommercubuanasisforsKelasCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfors.Kelas[] commercubuanasisforsKelases = lcommercubuanasisforsKelasCriteria.listKelas();
		length =commercubuanasisforsKelases== null ? 0 : Math.min(commercubuanasisforsKelases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisforsKelases[i]);
		}
		System.out.println(length + " Kelas record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListSistemInformasiRSData listSistemInformasiRSData = new ListSistemInformasiRSData();
			try {
				listSistemInformasiRSData.listTestData();
				//listSistemInformasiRSData.listByCriteria();
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
