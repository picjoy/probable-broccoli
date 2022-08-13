package com.seven.codesnippet.Controller.Dto;

import com.seven.codesnippet.Domain.TitlePost;
import lombok.Getter;

@Getter
public class TitlePostListDto {
    String title;
    String userNickname;
    String imageUrl;
    Long like_num;

    public TitlePostListDto(TitlePost titlePost) {
        this.title = titlePost.getTitle();
        this.userNickname = titlePost.getMember().getNickname();
        this.imageUrl = titlePost.getImage();
        this.like_num = titlePost.getHeart();
    }
}