package com.helani.SpringBootProject1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class userDTO {
    private int id;
    private String name;
    private String address;
}
