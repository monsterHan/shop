package com.hanchunhui;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hanchunhui.mapper.TbItemMapper;
import com.hanchunhui.pojo.TbItem;
import com.hanchunhui.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/7/21.
 */
public class test {
    @Test
    public void testPageHelper() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 10);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        System.out.println(list.size());
    }
}
