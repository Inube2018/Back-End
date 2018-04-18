package es.upm.dit.isst.inube.dao;

import java.util.List;
import es.upm.dit.isst.inube.dao.model.TPV;;

public interface TPVDAO {
	
	public List<TPV> readAllTPV();
	public List<TPV> readIBAN(String restaurante_id);
	public void createTPV(TPV tpv);
	public void updateTPV(TPV tpv);
	public void deleteTPV(TPV tpv);
}
