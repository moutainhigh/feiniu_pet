package com.lvmama.clutter.service.client.v3_2;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.lvmama.clutter.model.MobileCouponPoint;
import com.lvmama.clutter.model.MobileGroupOn;
import com.lvmama.clutter.model.MobilePersonItem;
import com.lvmama.clutter.model.MobileProduct;
import com.lvmama.clutter.model.MobileProductRoute;
import com.lvmama.clutter.model.MobileProductTitle;
import com.lvmama.clutter.model.MobileTimePrice;
import com.lvmama.clutter.service.impl.ClientProductServiceImpl;
import com.lvmama.comm.bee.po.prod.ViewJourney;
import com.lvmama.comm.vo.visa.VisaVO;

public class ClientProductServiceV321 extends ClientProductServiceImpl {

	@Override
	public MobileProduct getProduct(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return super.getProduct(params);
	}

	@Override
	public List<MobileTimePrice> timePrice(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return super.timePrice(params);
	}

	@Override
	public Map<String, Object> getGroupOnList(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return super.getGroupOnList(param);
	}

	@Override
	public MobileGroupOn getGroupOnDetail(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return super.getGroupOnDetail(param);
	}

	@Override
	public Map<String, Object> getBranches(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return super.getBranches(param);
	}

	@Override
	public List<MobileProductTitle> getPlaceRoutes(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return super.getPlaceRoutes(param);
	}

	@Override
	public Map<String, Object> getProductItems(Map<String, Object> param) {
		// TODO Auto-generated method stub
				Map<String, Object> result = super.getProductItems(param);
				if ((Boolean)result.get("isRoute")&&!(Boolean)result.get("isEContract")){
					result.put("xieyiUrl", "/app/xieyi.html");
					result.put("xieyiName", "驴妈妈委托服务协议");
				}   else if((Boolean)result.get("isTicket")){
					result.put("xieyiUrl", "/app/xieyi_ticket.html");
					result.put("xieyiName", "驴妈妈票务预订协议");
				} else {
					result.put("xieyiUrl", "");
					result.put("xieyiName", "");
				}
				result.remove("isRoute");
				result.remove("isTicket");
				return result;
	}

	@Override
	public void couponActivities(Map<String, Object> resultMap,
			boolean isAperiodic, Long brancId, Date validEndTime,
			Date visitDate, boolean isTodayOrder) {
		// TODO Auto-generated method stub
		super.couponActivities(resultMap, isAperiodic, brancId, validEndTime,
				visitDate, isTodayOrder);
	}

	@Override
	public void getCouponByPoint(String subProductType, String userNo,
			MobileCouponPoint mpoint) {
		// TODO Auto-generated method stub
		super.getCouponByPoint(subProductType, userNo, mpoint);
	}

	@Override
	public MobileProductRoute getRouteDetail(Map<String, Object> params)
			throws Exception {
		// TODO Auto-generated method stub
		return super.getRouteDetail(params);
	}

	@Override
	public Map<String, Object> getRouteDetail4Wap(Map<String, Object> params)
			throws Exception {
		// TODO Auto-generated method stub
		return super.getRouteDetail4Wap(params);
	}

	@Override
	public List<MobilePersonItem> getLatestPersonList(String userNo,
			String productType) {
		// TODO Auto-generated method stub
		return super.getLatestPersonList(userNo, productType);
	}

	@Override
	public List<ViewJourney> getViewJourneyList(Map<String, Object> param)
			throws Exception {
		// TODO Auto-generated method stub
		return super.getViewJourneyList(param);
	}

	@Override
	public Map<String, Object> checkStock(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return super.checkStock(param);
	}

	@Override
	public List<VisaVO> getVisaList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return super.getVisaList(params);
	}
	
}
