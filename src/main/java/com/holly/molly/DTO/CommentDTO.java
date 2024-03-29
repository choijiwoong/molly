package com.holly.molly.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class CommentDTO {
    private String content;
    private String hid;
    public Long getHid(){
        return Long.parseLong(this.hid);
    }
}
