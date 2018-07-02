package springBoot.demo.service;

import org.springframework.stereotype.Service;
import springBoot.demo.entity.ProductEntity;
import springBoot.demo.mapper.ProductMapper;
import springBoot.demo.param.ProductParam;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "ProductService")
public class ProductService {

    @Resource
    private ProductMapper mapper;

    public int save(ProductEntity entity) {

        return mapper.save(entity);
    }
    public int delete(Long id)
    {
        return mapper.delete(id);
    }

    public int update(ProductEntity entity) {

        return mapper.update(entity);
    }

    public List<ProductEntity> getList(ProductParam param) {

        List<ProductEntity> list = null;
        list = mapper.getList(param);
        return list;
    }

    public Long getCount(ProductParam param) {
        return mapper.getCount(param);

    }

}
