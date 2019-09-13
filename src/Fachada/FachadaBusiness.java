package Fachada;

import infra.DAO.DAOFactoryIF;
import infra.errorMessageException;


public class FachadaBusiness {

	private DAOFactoryIF DAOFactoryIF;
        //
	public FachadaBusiness(DAOFactoryIF DAOFactoryIF) throws errorMessageException {
		this.DAOFactoryIF = DAOFactoryIF;
	}
        
        



}
