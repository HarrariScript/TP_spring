package metier;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDAO;
@Component("metier")
public class MetierImpl implements Imetier {
   
	@Autowired
	@Resource(name ="dao")
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
