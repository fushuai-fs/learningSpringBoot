package springBoot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.mapper.ClientMapper;

import java.util.ArrayList;
import java.util.List;

@Service(value = "ClientService")
public class ClientService {
    @Autowired
    private ClientMapper clientMapper;

    public int add(ClientEntity client) {

        return clientMapper.add(client);
    }

    public List<ClientEntity> getList() {

        List<ClientEntity> list = null;
        list = clientMapper.getList();
        return list;
    }

}
