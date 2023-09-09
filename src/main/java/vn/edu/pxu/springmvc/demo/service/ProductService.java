package vn.edu.pxu.springmvc.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import vn.edu.pxu.springmvc.demo.model.Product;

public interface ProductService {
	List<Product> fimAll();
	Product finByid(int id);
	void save(Product product);
}
