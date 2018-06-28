package pers.lisiyan.relestate.serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.model.IdentityModel;
import pers.lisiyan.relestate.service.IIdentityService;


@Service("identitySeriveImpl")
@Transactional
public class IdentitySeriveImpl implements IIdentityService{

	private SessionFactory sf;
	
	
	@Autowired
	public IdentitySeriveImpl(SessionFactory sf) {
		// TODO Auto-generated constructor stub
		this.sf=sf;
	}
	
	
	
	public SessionFactory getSf() {
		return sf;
	}

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(IdentityModel identityModel) throws Exception {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().save(identityModel);
	}

	@Override
	public void modify() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(IdentityModel identityModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(identityModel);
	}

	@Override
	public void view() throws Exception {
		// TODO Auto-generated method stub
		
		
	}
	
	
	@Override
	public List<IdentityModel> getIdentityByUserID(int id){
		
		StringBuffer hql =new StringBuffer("from IdentityModel ide where ide.user_id =:id");
		Query query = sf.getCurrentSession().createQuery(hql.toString());
		query.setInteger("id",id);
		List<IdentityModel> list = query.getResultList();
		return list;
	}

}
