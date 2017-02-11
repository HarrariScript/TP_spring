package metier;

import dao.IDAO;

public class MetierImpl implements Imetier {

	private IDAO dao ;
	
	public IDAO getDao() {
		return dao;
	}

	public void setDao(IDAO dao) {
		this.dao = dao;
	}

	@Override
	public double calcul() {
		return dao.getValue()*2;
	}
   
}
