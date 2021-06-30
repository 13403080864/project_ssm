package ssm_dao;

import domain.Product;

import java.util.List;

/**
 * @author
 * @since 2021-06-30 16:33
 */

public interface IProductDao {
    //查询所有产品信息
    public List<Product> findAll() throws Exception;
}
