package model.dao;

import java.util.List;

import mode.utilities.Seller;
import model.utilities.Department;

public interface SellerDao {
	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department dep);

}


