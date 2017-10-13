package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sparrow_user")
public class SparrowUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private Integer credits;

    @Column(name = "last_visit")
    private Date lastVisit;

    @Column(name = "last_ip")
    private String lastIp;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return credits
     */
    public Integer getCredits() {
        return credits;
    }

    /**
     * @param credits
     */
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * @return last_visit
     */
    public Date getLastVisit() {
        return lastVisit;
    }

    /**
     * @param lastVisit
     */
    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    /**
     * @return last_ip
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * @param lastIp
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }
}