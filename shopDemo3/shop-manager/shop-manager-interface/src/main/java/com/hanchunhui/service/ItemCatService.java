package com.hanchunhui.service;

import com.hanchunhui.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatlist(long parentId);


}
