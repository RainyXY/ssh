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
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IUserService;


@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements IUserService{
	
	private SessionFactory sf;
	
	@Autowired
	public UserServiceImpl(SessionFactory sf) {
		// TODO Auto-generated constructor stub
		
		this.sf = sf;
	}
	
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void addUser(UserModel userModel) throws Exception {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().save(userModel);
		
	}

	@Override
	public void usertoContract(int userid, int contractid) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		UserModel userModel = session.get(UserModel.class,userid);
		ContractModel contractModel = session.get(ContractModel.class,contractid);
		userModel.getContracts().add(contractModel);
		contractModel.getUsers().add(userModel);
		tx.commit();
		session.close();
	}

	@Override
	public List<UserModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		
		return sf.getCurrentSession().createQuery("from UserModel",UserModel.class).getResultList();
	}

	@Override
	public void modify(UserModel userModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(userModel);
		
	}

	@Override
	public void delete(UserModel userModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(userModel);
	}

	@Override
	public boolean validate(int id, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean result = false;
		String hql="select count(um.user_email) from UserModel um where um.user_id=:id and user_password=:password";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setInteger("id",id);
		query.setString("password", password);
		Long lcount=(Long)query.uniqueResult();
		if(lcount!=null&&lcount>0){
			result=true;
		}
		
		return result;
		
	
	}

	@Override
	public List<ContractModel> getUserBuyList(int userid, int contractid) throws Exception {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public UserModel getUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		return sf.getCurrentSession().get(UserModel.class,id);
	}
	
	

}
