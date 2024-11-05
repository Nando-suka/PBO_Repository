/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateSistempendaftaranwebinarData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfopw.Webinar lcommercubuanasisfopwWebinar = com.mercubuana.sisfopw.WebinarDAO.createWebinar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : peserta, jenis_Webinar, tanggalPendaftaran, sisaKapasitas, kapasitas, namaWebinar
			com.mercubuana.sisfopw.WebinarDAO.save(lcommercubuanasisfopwWebinar);
			com.mercubuana.sisfopw.Peserta lcommercubuanasisfopwPeserta = com.mercubuana.sisfopw.PesertaDAO.createPeserta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : webinar, tanggalLahir, jenisKelamin, namaPeserta
			com.mercubuana.sisfopw.PesertaDAO.save(lcommercubuanasisfopwPeserta);
			com.mercubuana.sisfopw.JenisWebinar lcommercubuanasisfopwJenisWebinar = com.mercubuana.sisfopw.JenisWebinarDAO.createJenisWebinar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : webinar, deskripsiJenis, durasi, biaya, jenisWebinar
			com.mercubuana.sisfopw.JenisWebinarDAO.save(lcommercubuanasisfopwJenisWebinar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSistempendaftaranwebinarData createSistempendaftaranwebinarData = new CreateSistempendaftaranwebinarData();
			try {
				createSistempendaftaranwebinarData.createTestData();
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
