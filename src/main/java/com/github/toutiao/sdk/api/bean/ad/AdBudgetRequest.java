package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class AdBudgetRequest extends BaseModel {
    private Long advertiser_id;
    private Long ad_id;
    private Double budget;
    private List<AdBudget> data;

    @Data
    public static class AdBudget {
        Long ad_id;
        Double budget;
    }
}
