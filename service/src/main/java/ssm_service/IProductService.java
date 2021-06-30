package ssm_service;

import domain.Product;

import java.util.List;

/**
 * @author
 * @since 2021-06-30 16:48
 */

public interface IProductService {
    public List<Product> findAll() throws Exception;
}
