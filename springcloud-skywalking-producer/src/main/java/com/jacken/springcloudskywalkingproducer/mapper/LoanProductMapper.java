package com.jacken.springcloudskywalkingproducer.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacken.springcloudskywalkingproducer.domain.LoanProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanProductMapper extends BaseMapper<LoanProduct> {
    List<LoanProduct> findByLoanProduct();


}
