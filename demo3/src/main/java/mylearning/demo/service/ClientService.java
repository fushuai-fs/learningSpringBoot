package mylearning.demo.service;

import mylearning.demo.entity.ClientEntity;
import mylearning.demo.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "ClientService")
public class ClientService {

    @Autowired
    private ClientMapper clientMapper;

    public int add(ClientEntity client){

        return clientMapper.add(client);
    }


}
