/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import java.text.SimpleDateFormat;

import org.orm.*;

import com.mercubuana.sisfopw.JenisWebinar;
import com.mercubuana.sisfopw.JenisWebinarDAO;
import com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager;
import com.mercubuana.sisfopw.Webinar;
import com.mercubuana.sisfopw.WebinarDAO;
public class CreateSistempendaftaranwebinarData {
	public void createTestData() throws PersistentException {
		//PersistentTransaction t = com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().getSession().beginTransaction();
		PersistentTransaction t = 
				SistempendaftaranwebinarPersistentManager
				.instance().getSession()
				.beginTransaction();
		try {
//			com.mercubuana.sisfopw.Webinar lcommercubuanasisfopwWebinar = com.mercubuana.sisfopw.WebinarDAO.createWebinar();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : peserta, jenis_Webinar, tanggalPendaftaran, sisaKapasitas, kapasitas, namaWebinar
//			com.mercubuana.sisfopw.WebinarDAO.save(lcommercubuanasisfopwWebinar);
//			com.mercubuana.sisfopw.Peserta lcommercubuanasisfopwPeserta = com.mercubuana.sisfopw.PesertaDAO.createPeserta();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : webinar, tanggalLahir, jenisKelamin, namaPeserta
//			com.mercubuana.sisfopw.PesertaDAO.save(lcommercubuanasisfopwPeserta);
//			com.mercubuana.sisfopw.JenisWebinar lcommercubuanasisfopwJenisWebinar = com.mercubuana.sisfopw.JenisWebinarDAO.createJenisWebinar();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : webinar, deskripsiJenis, durasi, biaya, jenisWebinar
//			com.mercubuana.sisfopw.JenisWebinarDAO.save(lcommercubuanasisfopwJenisWebinar);
			JenisWebinar jeniswebinarbaru = JenisWebinarDAO
					.createJenisWebinar();
			jeniswebinarbaru.setJenisWebinar("Soft Launching");
			jeniswebinarbaru.setBiaya(50000);
			jeniswebinarbaru.setDurasi(2);
			jeniswebinarbaru.setDeskripsiJenis("terima kasih");
			JenisWebinarDAO.save(jeniswebinarbaru);
			
			Webinar webinarbaru = WebinarDAO
					.createWebinar();
			webinarbaru.setNamaWebinar("Webinar Nasional");
			webinarbaru.setKapasitas(2);
			webinarbaru.setSisaKapasitas(3);
			webinarbaru.setJenis_Webinar(jeniswebinarbaru);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Format tanggal
		    java.util.Date tanggalPendaftaran = formatter.parse("2023-11-06"); // Konversi String ke Date
		    webinarbaru.setTanggalPendaftaran(tanggalPendaftaran);
		    WebinarDAO.save(webinarbaru);
			
			
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
