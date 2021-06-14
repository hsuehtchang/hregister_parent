package com.nju.hregister.hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nju.hregister.hosp.mapper.HospitalSetMapper;
import com.nju.hregister.hosp.service.HospitalSetService;
import com.nju.hregister.model.hosp.HospitalSet;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
}
