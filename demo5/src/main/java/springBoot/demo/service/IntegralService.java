package springBoot.demo.service;

import org.springframework.stereotype.Service;
import springBoot.demo.entity.IntegralEntity;
import springBoot.demo.mapper.IntegralMapper;
import springBoot.demo.param.IntegralParam;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "IntegralService")
public class IntegralService {

    @Resource
    private IntegralMapper mapper;

    public int save(IntegralEntity entity) {

        return mapper.save(entity);
    }
    public int delete(Long id)
    {
        return mapper.delete(id);
    }

    public int update(IntegralEntity entity) {

        return mapper.update(entity);
    }

    public List<IntegralEntity> getList(IntegralParam param) {

        List<IntegralEntity> list = null;
        list = mapper.getList(param);
        return list;
    }

    public Long getCount(IntegralParam param) {
        return mapper.getCount(param);

    }
}
