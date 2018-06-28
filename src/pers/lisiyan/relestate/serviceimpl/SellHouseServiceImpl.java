package pers.lisiyan.relestate.serviceimpl;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.config.TxNamespaceHandler;

import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.ISellHouseService;

@Service("sellHouseServiceImpl")
@Transactional
public class SellHouseServiceImpl implements ISellHouseService {

	
	private SessionFactory sf;
	
	@Autowired
	public SellHouseServiceImpl(SessionFactory sf) {
		// TODO Auto-generated constructor stub
		this.sf = sf;
	}
	
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	

	@Override
	public List<SellHouseModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from SellHouseModel",SellHouseModel.class).getResultList();
	}

	@Override
	public List<SellHouseModel> getListBySearchWithPage(int rows,int page) throws Exception {
		// TODO Auto-generated method stub
		
		String hql="from SellHouseModel";
		Query query =sf.getCurrentSession().createQuery(hql);
		query.setFirstResult(rows*(page-1));
		query.setMaxResults(rows);
		List<SellHouseModel> list =query.list();
	    return list;
	}

	@Override
	public void modify(SellHouseModel sellHouseModel) throws Exception {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().update(sellHouseModel);
	}

	@Override
	public void delete(SellHouseModel sellHouseModel) throws Exception {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().delete(sellHouseModel);
	}

	@Override
	public void add(SellHouseModel sellHouseModel, File photo) throws Exception {
		// TODO Auto-generated method stub
		InputStream fin=new FileInputStream(photo);
		Blob blob = sf.getCurrentSession().getLobHelper().createBlob(fin,fin.available());
		sellHouseModel.setS_house_pricture(blob);
		sf.getCurrentSession().save(sellHouseModel);
		
	}

	@Override
	public SellHouseModel getQueryById(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		SellHouseModel sellHouseModel = session.get(SellHouseModel.class,id);
	    transaction.commit();
		session.close();

		return sellHouseModel;
	}

	@Override
	public void add(SellHouseModel sellHouseModel, File photo, int userId) throws Exception {
		// TODO Auto-generated method stub
		UserModel userModel = sf.getCurrentSession().get(UserModel.class,userId);
		sellHouseModel.setSell_user(userModel);
		InputStream fin=new FileInputStream(photo);
		Blob blob = sf.getCurrentSession().getLobHelper().createBlob(fin,fin.available());
		sellHouseModel.setS_house_pricture(blob);
		sf.getCurrentSession().save(sellHouseModel);
	}

	@Override
	public int getPageCountBySearch(int rows) throws Exception {
		// TODO Auto-generated method stub
		int page=0;
		int count=this.getCountBySearch();
		if(count%rows==0){
			page=count/rows;
			
		}else{
			page=(count/rows)+1;
		}
		return page;

	}

	@Override
	public int getCountBySearch() throws Exception {
		// TODO Auto-generated method stub
		String hql="select count(sm.s_house_id) from SellHouseModel sm ";
		Query query = sf.getCurrentSession().createQuery(hql);
		Long aLong = (Long) query.uniqueResult();
		
		return aLong.intValue();
	}

}
