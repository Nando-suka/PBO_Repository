/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;

import com.mercubuana.sisfors.Kamar;
import com.mercubuana.sisfors.KamarDAO;
import com.mercubuana.sisfors.Kelas;
import com.mercubuana.sisfors.KelasDAO;
import com.mercubuana.sisfors.SistemInformasiRSPersistentManager;

public class CreateSistemInformasiRSData {
	public void createTestData() throws PersistentException {
		//PersistentTransaction t = com.mercubuana.sisfors.SistemInformasiRSPersistentManager.instance().getSession().beginTransaction();
		PersistentTransaction t =
				SistemInformasiRSPersistentManager
				.instance().getSession()
				.beginTransaction();
		
		try {
			//com.mercubuana.sisfors.Kamar lcommercubuanasisforsKamar = com.mercubuana.sisfors.KamarDAO.createKamar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pasien, kelas, sisa_tempat, kapasitas, jenisKelamin, namaKamar
			Kelas kelasBaru = KelasDAO
					.createKelas();
			kelasBaru.setNamaKelas("II");
			kelasBaru.setHargaPerMalam(157000);
			kelasBaru.setHargaDokter(850000);
			KelasDAO.save(kelasBaru);
			
			Kamar kamarBaru = KamarDAO
					.createKamar();
			kamarBaru.setNamaKamar("Minami");
			kamarBaru.setJenisKelamin('P');
			kamarBaru.setKapasitas(1);
			kamarBaru.setSisa_tempat(1);
			kamarBaru.setKelas(kelasBaru);
			KamarDAO.save(kamarBaru);
			//com.mercubuana.sisfors.KamarDAO.save(lcommercubuanasisforsKamar);
			//com.mercubuana.sisfors.Pasien lcommercubuanasisforsPasien = com.mercubuana.sisfors.PasienDAO.createPasien();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : kamar, tanggalLahir, jenisKelamin, namaPasien
			//com.mercubuana.sisfors.PasienDAO.save(lcommercubuanasisforsPasien);
			//com.mercubuana.sisfors.Kelas lcommercubuanasisforsKelas = com.mercubuana.sisfors.KelasDAO.createKelas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : kamar, hargaDokter, hargaPerMalam, namaKelas
			//com.mercubuana.sisfors.KelasDAO.save(lcommercubuanasisforsKelas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSistemInformasiRSData createSistemInformasiRSData = new CreateSistemInformasiRSData();
			try {
				createSistemInformasiRSData.createTestData();
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
