package es.upm.dit.isst.inube.dao;

import java.util.List;
import es.upm.dit.isst.inube.dao.model.Restaurant;;

public interface RestauranteDAO {

	public List<Restaurant> readAllRestaurante();
	public List<Restaurant> readUser(String id);
	public List<Restaurant> readNombreRestaurante(String nombre_restaurante);
	public List<Restaurant> readCodigoPostal(String codigo_postal);
	public List<Restaurant> readTipoRestaurante(String tipo_restaurante);
	public List<Restaurant> readPrecioMenuMedio(String preci_menu_medio);
	public void createRestaurante( Restaurant restaurante );
	public void updateRestaurante( Restaurant restaurante );
	public void deleteRestaurante( Restaurant restaurnate );
	
}
