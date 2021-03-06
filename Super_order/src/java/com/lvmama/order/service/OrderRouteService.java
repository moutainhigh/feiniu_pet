package com.lvmama.order.service;

import com.lvmama.comm.bee.po.ord.OrdOrderRoute;
import com.lvmama.order.dao.OrderRouteDAO;

/**
 * @author kevin
 * @version  1.0  2011-9-23
 *  
 */
public interface OrderRouteService {

	
	/**
	 * 根据订单ID查询订单团附加表.
	 * 
	 * @param orderId
	 *            订单ID.
	 * @return OrdOrderRoute 订单团附加表.
	 */
	OrdOrderRoute queryOrdOrderRouteByOrderId(final Long orderId);
	/**
	 * 增加订单关于团的附加表记录.
	 * @param orderRoute
	 */
	boolean insertOrderRoute(final OrdOrderRoute orderRoute);

	/**
	 * 修改订单关于团的附加表记录.
	 * @param orderRoute
	 * @return 
	 */
	boolean updateOrderRoute(final OrdOrderRoute orderRoute);

	/**
	 * 获取订单附加表属性DAO.
	 * @return
	 */
	OrderRouteDAO getOrderRouteDAO();

	/**
	 * 设置订单附加表属性DAO.
	 * @param orderRouteDAO
	 */
    void setOrderRouteDAO(OrderRouteDAO orderRouteDAO);

}