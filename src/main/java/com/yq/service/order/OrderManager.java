package com.yq.service.order;

import java.util.List;
import org.change.entity.Page;
import org.change.util.PageData;

/** 
 * 说明： 订单接口
 * 创建人：壹仟科技 qq 357788906
 * 创建时间：2017-01-05
 * @version
 */
public interface OrderManager{

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public int save(PageData pd)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public int delete(PageData pd)throws Exception;
	
	
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public int edit(PageData pd)throws Exception;
	
	
	public int refund(PageData pd) throws Exception ;
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	public int count(PageData pd)throws Exception;
	
	public int order_count(PageData pd)throws Exception;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

        public int update(PageData pd);

        public List<PageData> listByUser(Page page) throws Exception;
	
}

