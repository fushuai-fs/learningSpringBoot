package mylearning.demo.entity;

import java.io.Serializable;

public class ClientEntity  implements Serializable {

    private static final Long serialVersionUID=1L;

    private Long clientId;
    private String clientName;
    private int age;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
