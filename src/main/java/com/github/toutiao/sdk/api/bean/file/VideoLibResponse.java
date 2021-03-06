package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class VideoLibResponse extends ToutiaoResponse<ImageQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        List<VideoInfo> list;
        PageInfo page_info;
    }

    @lombok.Data
    public static class VideoInfo {
        String id;
        Integer size;
        Integer width;
        Integer height;
        String url;
        String format;
        String signature;
        Integer poster_url;
        String bit_rate;
        Integer duration;
    }

    public static class PageInfo {
        Integer page;
        Integer total_page;
        Integer total_number;
    }
}
