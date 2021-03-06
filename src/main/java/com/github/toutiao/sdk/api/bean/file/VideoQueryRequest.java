package com.github.toutiao.sdk.api.bean.file;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

@Data
public class VideoQueryRequest {
    Long advertiser_id;
    List<String> video_ids;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&video_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(video_ids));
    }
}
