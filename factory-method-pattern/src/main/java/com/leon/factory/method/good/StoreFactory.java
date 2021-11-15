package com.leon.factory.method.good;


import com.leon.factory.method.good.store.ICommodity;
import com.leon.factory.method.good.store.impl.CardCommodityService;
import com.leon.factory.method.good.store.impl.CouponCommodityService;
import com.leon.factory.method.good.store.impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
