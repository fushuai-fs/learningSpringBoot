package springBoot.demo.domain1;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    public Message(){}

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}