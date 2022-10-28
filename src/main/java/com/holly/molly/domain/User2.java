package com.holly.molly.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class User2 {//봉사자
    @Id
    @GeneratedValue
    @Column(name = "user2_id")
    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private String birth;

    private String pid;

    @OneToMany(mappedBy = "user")
    private List<Accept> accepts=new ArrayList<>();
}
