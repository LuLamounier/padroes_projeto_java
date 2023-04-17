package One_digitalInnovationFacade;

import subsistema1crm.CrmService;
import subsistema2cep.CepAPI;

public class Facade {
	
	public void migrarCliente(String name, String cep) {
	String cidade = CepAPI.getInstancia().recuperarCidade(cep);
	String estado = CepAPI.getInstancia().recuperarEstado(cep);
	
	CrmService.gravarCliente(name, cep, estado, cidade);
	}

}
