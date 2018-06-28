package pers.lisiyan.relestate.serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IContractService;

@Service("contractServiceImpl")
@Transactional
public class ContractServiceImpl implements IContractService {
	
	private SessionFactory sf;


	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Autowired
	public ContractServiceImpl(SessionFactory sf) {
		// TODO Auto-generated constructor stub
		this.sf = sf;
	}


	@Override
	public List<ContractModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from ContractModel ",ContractModel.class).getResultList();
	
	}

	@Override
	public void modify(ContractModel contractModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(contractModel);
	}

	@Override
	public void delete(ContractModel contractModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(contractModel);
	}

	@Override
	public ContractModel getQueryById(int id) throws Exception {
		// TODO Auto-generated method stub
		
		ContractModel contractModel = sf.getCurrentSession().get(ContractModel.class,id);

		
		return contractModel;
	}

	@Override
	public void add(ContractModel contractModel) {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().save(contractModel);
	}

	@Override
	public void add(int c_id, int[] user_ids) throws Exception {
		// TODO Auto-generated method stub
		
		ContractModel contractModel = sf.getCurrentSession().get(ContractModel.class,c_id);
		for(int user_id : user_ids){
			UserModel userModel = sf.getCurrentSession().get(UserModel.class,user_id);
			userModel.getContracts().add(contractModel);
			contractModel.getUsers().add(userModel);
		}
	}

	@Override
	public List<Integer> getListByUserId(int id) throws Exception {
		// TODO Auto-generated method stub
		
		String hql = "select cm.c_id from ContractModel cm inner join cm.users user where user.user_id=:id";
		
		Query query = sf.getCurrentSession().createQuery(hql);
		query.setInteger("id",id);
		List<Integer> list =query.getResultList();
		return list;
	}

	@Override
	public List<Integer> getSellHouse(int id) throws Exception {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
