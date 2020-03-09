package com.example.form;


import com.example.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class QueryForm {

    private User user;

    private List<Long> ids;
}
