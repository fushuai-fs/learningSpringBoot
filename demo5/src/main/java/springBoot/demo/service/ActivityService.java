package springBoot.demo.service;

import org.springframework.stereotype.Service;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.mapper.ClientMapper;
import springBoot.demo.param.ClientParam;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "ActivityService")
public class ActivityService {
    @Resource
    private ClientMapper clientMapper;

    public int add(ClientEntity client) {

        return clientMapper.add(client);
    }
    public int delete(Long id)
    {
        return clientMapper.delete(id);
    }


    public List<ClientEntity> getList(ClientParam clientParam) {

        List<ClientEntity> list = null;
        list = clientMapper.getList(clientParam);
        return list;
    }

    public Long getCount(ClientParam clientParam) {
        return clientMapper.getCount(clientParam);

    }

}
