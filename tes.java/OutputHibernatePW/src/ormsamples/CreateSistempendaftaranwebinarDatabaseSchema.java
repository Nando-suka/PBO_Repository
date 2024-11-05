/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateSistempendaftaranwebinarDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance());
			com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
