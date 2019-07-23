package com.atguigu.gmall0218.usermanage.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class UserInfo {
    @Id
    @Column
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}