package springBoot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.mapper.ClientMapper;
import springBoot.demo.param.ClientParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = "ClientService")
public class ClientService {
    @Resource
    private ClientMapper clientMapper;

    public int add(ClientEntity client) {

        return clientMapper.add(client);
    }

    public List<ClientEntity> getList(ClientParam clientParam) {

        List<ClientEntity> list = null;
        list = clientMapper.getList(clientParam);
        return list;
    }

    public Long getCount(ClientParam clientParam) {
        return clientMapper.getCount(clientParam);

    }

    public int delete(Long id)
    {
        return clientMapper.delete(id);
    }

}
