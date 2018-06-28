 package pers.lisiyan.relestate.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IRentHouseService;

@Service("rentHouseServiceImpl")
@Transactional
public class RentHouseServiceImpl implements IRentHouseService {

	private SessionFactory sf;

	@Autowired
	public RentHouseServiceImpl(SessionFactory sf) {
		// TODO Auto-generated constructor stub
		this.sf = sf;
	}

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(RentHouseModel rentHouseModel,File photo) throws Exception {
		// TODO Auto-generated method stub
		InputStream fin=new FileInputStream(photo);
		Blob blob = sf.getCurrentSession().getLobHelper().createBlob(fin,fin.available());
		rentHouseModel.setR_house_picture(blob);
		sf.getCurrentSession().save(rentHouseModel);
	}

	@Override
	public List<RentHouseModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from RentHouseModel ", RentHouseModel.class).getResultList();
	}

	@Override
	public List<RentHouseModel> getListBySearchWithPage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(RentHouseModel rentHouseModel) throws Exception {
		// TODO Auto-generated method stub

		sf.getCurrentSession().update(rentHouseModel);
	}

	@Override
	public void delete(RentHouseModel rentHouseModel) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(rentHouseModel);
	}

	@Override
	public RentHouseModel getQueryById(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		RentHouseModel rentHouseModel = session.get(RentHouseModel.class, id);
		transaction.commit();
		session.close();
		return rentHouseModel;
	}

	@Override
	public void add(RentHouseModel rentHouseModel, File photo, int userId) throws Exception {
		// TODO Auto-generated method stub
		
		UserModel userModel = sf.getCurrentSession().get(UserModel.class,userId);
		rentHouseModel.setRent_user(userModel);
		InputStream fin=new FileInputStream(photo);
		Blob blob = sf.getCurrentSession().getLobHelper().createBlob(fin,fin.available());
		rentHouseModel.setR_house_picture(blob);
		sf.getCurrentSession().save(rentHouseModel);
	
	}

}
