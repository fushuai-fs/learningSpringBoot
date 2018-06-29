package springBoot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.mapper.ClientMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = "ClientService")
public class ClientService {
    @Autowired
    private ClientMapper clientMapper;

    public int add(ClientEntity client) {

        return clientMapper.add(client);
    }

    public List<ClientEntity> getList(Integer pageNumber,
                                      Integer pageSize,
                                      String name,
                                      Long cusID,
                                      Date beginDate,
                                      Date endDate,
                                      String mobile,
                                      Integer type) {

        List<ClientEntity> list = null;
        list = clientMapper.getList(pageNumber, pageSize, name, cusID, beginDate, endDate, mobile, type);
        return list;
    }

    public Long getCount(String name,
                         Long cusID,
                         Date beginDate,
                         Date endDate,
                         String mobile,
                         Integer type) {
        return clientMapper.getCount(name, cusID, beginDate, endDate, mobile, type);

    }

    public int delete(Long id)
    {
        return clientMapper.delete(id);
    }

}
