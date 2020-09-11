package com.unishop.server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageUrl {
    public Integer id;
    public String imgUrl;
    public String type;
}
