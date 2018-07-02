package springBoot.demo.service;

import org.springframework.stereotype.Service;
import springBoot.demo.entity.OrderEntity;
import springBoot.demo.mapper.OrderMapper;
import springBoot.demo.param.OrderParam;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "OrderService")
public class OrderService {

    @Resource
    private OrderMapper mapper;

    public int save(OrderEntity entity) {

        return mapper.save(entity);
    }
    public int delete(Long id)
    {
        return mapper.delete(id);
    }

    public int update(OrderEntity entity) {

        return mapper.update(entity);
    }

    public List<OrderEntity> getList(OrderParam param) {

        List<OrderEntity> list = null;
        list = mapper.getList(param);
        return list;
    }

    public Long getCount(OrderParam param) {
        return mapper.getCount(param);

    }
}
