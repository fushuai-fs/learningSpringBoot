package springBoot.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false, length = 20)
    private String UserName;
    @Column(nullable = false, length = 50)
    private String Pwd;
    @Column(nullable = false, length = 20)
    private String FullName;
    @Column(nullable = false, length = 11,columnDefinition = "")
    private String Mobile;
    @Column(nullable = false)
    private int DepID;
    @Column(nullable = false)
    private int State;
    @Column(nullable = false)
    private int IsAdmin;
    @Column(nullable = true)
    private Date AddTime;


    public Account() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public int getDepID() {
        return DepID;
    }

    public void setDepID(int depID) {
        DepID = depID;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        IsAdmin = isAdmin;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }
}
