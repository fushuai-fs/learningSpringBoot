package springBoot.demo.service;

import org.springframework.stereotype.Service;
import springBoot.demo.entity.ActivityEntity;
import springBoot.demo.mapper.ActivityMapper;
import springBoot.demo.param.ActivityParam;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "ActivityService")
public class ActivityService {
    @Resource
    private ActivityMapper mapper;

    public int save(ActivityEntity entity) {

        return mapper.save(entity);
    }
    public int delete(Long id)
    {
        return mapper.delete(id);
    }

    public int update(ActivityEntity entity) {

        return mapper.update(entity);
    }

    public List<ActivityEntity> getList(ActivityParam param) {

        List<ActivityEntity> list = null;
        list = mapper.getList(param);
        return list;
    }

    public Long getCount(ActivityParam param) {
        return mapper.getCount(param);

    }

}
