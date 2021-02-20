package com.baomidou.mybatisplus.samples.generator.service.impl;

import com.baomidou.mybatisplus.samples.generator.entity.BrandInfo;
import com.baomidou.mybatisplus.samples.generator.mapper.BrandInfoMapper;
import com.baomidou.mybatisplus.samples.generator.service.IBrandInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息表 服务实现类
 * </p>
 *
 * @author hhzh
 * @since 2021-02-20
 */
@Service
public class BrandInfoServiceImpl extends ServiceImpl<BrandInfoMapper, BrandInfo> implements IBrandInfoService {

}
