package io.seata.samples.integration.order.config;

import io.seata.samples.integration.common.dubbo.AccountDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {

    @Bean
    @DubboReference
    public ReferenceBean<AccountDubboService> accountDubboService() {
        return new ReferenceBean();
    }

}
