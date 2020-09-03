package cn.ywb.springcloudalibaba.business.purchase.api.service;

public interface PurchaseService {

    /**
     * 采购
     */
    void purchase(String userId, String commodityCode, int orderCount);

}
