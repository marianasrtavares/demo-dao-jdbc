package application;

import java.util.List;

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
		
		System.out.println("TEST 2: seller findByDepartment");
        Department dep= new Department(2,null);
        List<Seller> list= sellerDao.findByDepartment(dep);
        
        for(Seller sel:list) {
        	System.out.println(sel);
        }
        
        System.out.println("TEST 3: seller findAll");
        list= sellerDao.findAll();
        
        for(Seller sel:list) {
        	System.out.println(sel);
	}

}
}
