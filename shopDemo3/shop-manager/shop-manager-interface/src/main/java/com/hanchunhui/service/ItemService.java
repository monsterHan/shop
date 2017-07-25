package com.hanchunhui.service;

import com.hanchunhui.pojo.EasyUIDataGridResult;
import com.hanchunhui.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);

}
