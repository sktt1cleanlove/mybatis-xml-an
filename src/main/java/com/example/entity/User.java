package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String name;
    private String pwd;
    @Transient
    private List<Account> accounts;
}
