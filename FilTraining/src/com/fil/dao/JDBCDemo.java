package com.fil.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fil.dao.database.dao.SupplyDAO;
import com.fil.dao.database.daoImp.SupplyDAOImpl;
import com.fil.dao.database.entity.SupplyEntity;

public class JDBCDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SupplyDAO dao = new SupplyDAOImpl();
		SupplyEntity entity = new SupplyEntity(4, 11, 4, 2343, new Date(System.currentTimeMillis()));
		dao.addSupplyEntry(entity);
		//System.out.println(dao.getAllSupplyList().toString());
	}
	
	

}
