package ssm_service.impl;

import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import ssm_dao.IProductDao;
import ssm_service.IProductService;

import java.util.List;

/**
 * @author
 * @since 2021-06-30 16:51
 */

public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return null;
    }
}
