package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImplV2 implements IDAO{

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 7;
	}

	
}
