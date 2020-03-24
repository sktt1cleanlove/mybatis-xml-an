package com.example.entity;

/**
 * @author: czh;
 * @date: 2020/3/23;
 * @description: ;
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "area")
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    @Id
    private String id;
    private String name;
    private String code;
    private String areaAlias;
    private String parentAreaId;
}
