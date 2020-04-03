package com.xc.domain;


import javax.persistence.*;

/**
 * T_ROLE
 *
 * @author
 */
@Table(name = "t_role")
public class TRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleid;
    private String rolename;
    private String roledesc;

    public TRole() {
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public TRole(String rolename, String roledesc) {
        this.rolename = rolename;
        this.roledesc = roledesc;
    }
}