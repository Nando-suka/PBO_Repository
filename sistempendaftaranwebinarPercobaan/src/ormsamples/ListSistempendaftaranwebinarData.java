/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListSistempendaftaranwebinarData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Webinar...");
		com.mercubuana.sisfopw.Webinar[] commercubuanasisfopwWebinars = com.mercubuana.sisfopw.WebinarDAO.listWebinarByQuery(null, null);
		int length = Math.min(commercubuanasisfopwWebinars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfopwWebinars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Peserta...");
		com.mercubuana.sisfopw.Peserta[] commercubuanasisfopwPesertas = com.mercubuana.sisfopw.PesertaDAO.listPesertaByQuery(null, null);
		length = Math.min(commercubuanasisfopwPesertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfopwPesertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing JenisWebinar...");
		com.mercubuana.sisfopw.JenisWebinar[] commercubuanasisfopwJenisWebinars = com.mercubuana.sisfopw.JenisWebinarDAO.listJenisWebinarByQuery(null, null);
		length = Math.min(commercubuanasisfopwJenisWebinars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfopwJenisWebinars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Webinar by Criteria...");
		com.mercubuana.sisfopw.WebinarCriteria lcommercubuanasisfopwWebinarCriteria = new com.mercubuana.sisfopw.WebinarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfopwWebinarCriteria.id.eq();
		lcommercubuanasisfopwWebinarCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfopw.Webinar[] commercubuanasisfopwWebinars = lcommercubuanasisfopwWebinarCriteria.listWebinar();
		int length =commercubuanasisfopwWebinars== null ? 0 : Math.min(commercubuanasisfopwWebinars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfopwWebinars[i]);
		}
		System.out.println(length + " Webinar record(s) retrieved."); 
		
		System.out.println("Listing Peserta by Criteria...");
		com.mercubuana.sisfopw.PesertaCriteria lcommercubuanasisfopwPesertaCriteria = new com.mercubuana.sisfopw.PesertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfopwPesertaCriteria.id.eq();
		lcommercubuanasisfopwPesertaCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfopw.Peserta[] commercubuanasisfopwPesertas = lcommercubuanasisfopwPesertaCriteria.listPeserta();
		length =commercubuanasisfopwPesertas== null ? 0 : Math.min(commercubuanasisfopwPesertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfopwPesertas[i]);
		}
		System.out.println(length + " Peserta record(s) retrieved."); 
		
		System.out.println("Listing JenisWebinar by Criteria...");
		com.mercubuana.sisfopw.JenisWebinarCriteria lcommercubuanasisfopwJenisWebinarCriteria = new com.mercubuana.sisfopw.JenisWebinarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfopwJenisWebinarCriteria.id.eq();
		lcommercubuanasisfopwJenisWebinarCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfopw.JenisWebinar[] commercubuanasisfopwJenisWebinars = lcommercubuanasisfopwJenisWebinarCriteria.listJenisWebinar();
		length =commercubuanasisfopwJenisWebinars== null ? 0 : Math.min(commercubuanasisfopwJenisWebinars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfopwJenisWebinars[i]);
		}
		System.out.println(length + " JenisWebinar record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListSistempendaftaranwebinarData listSistempendaftaranwebinarData = new ListSistempendaftaranwebinarData();
			try {
				listSistempendaftaranwebinarData.listTestData();
				//listSistempendaftaranwebinarData.listByCriteria();
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
