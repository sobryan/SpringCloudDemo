package com.example.demo.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class CustomLoadBalancerConfiguration {

	@Bean
	public ServiceInstanceListSupplier discoveryClientServiceInstanceListSupplier(
			ConfigurableApplicationContext context) {
		return ServiceInstanceListSupplier.builder()
				.withBlockingDiscoveryClient()
				.withRetryAwareness()
				.withZonePreference()
				.build(context);
	}
}