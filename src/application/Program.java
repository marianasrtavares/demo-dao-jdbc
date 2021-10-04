package application;

import java.util.Date;

import mode.utilities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.utilities.Department;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("TEST 1: seller findByID");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
