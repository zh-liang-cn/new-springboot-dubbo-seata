package io.seata.samples.integration.call.config;

import io.seata.samples.integration.common.dubbo.OrderDubboService;
import io.seata.samples.integration.common.dubbo.StockDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReferenceConfiguration {

    @Bean
    @DubboReference
    public ReferenceBean<OrderDubboService> orderDubboService() {
        return new ReferenceBean<>();
    }

    @Bean
    @DubboReference
    public ReferenceBean<StockDubboService> stockDubboService() {
        return new ReferenceBean<>();
    }

}
