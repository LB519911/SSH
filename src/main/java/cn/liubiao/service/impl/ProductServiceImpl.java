package cn.liubiao.service.impl;

import cn.liubiao.dao.ProductDao;
import cn.liubiao.pojo.Product;
import cn.liubiao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProduct(Product product) {

        productDao.saveProduct(product);

    }

}
