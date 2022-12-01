package com.ego.dubbo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.ego.dubbo.service.TbItemDescDubboService;
import com.ego.mapper.TbItemDescMapper;
import com.ego.pojo.TbItemDesc;

public class TbItemDescDubboServiceImpl implements TbItemDescDubboService {
	@Autowired
	private TbItemDescMapper tbItemDescMapper;
	@Override
	public int insDesc(TbItemDesc itemDesc) {
		return tbItemDescMapper.insert(itemDesc);
	}

}
