package com.wisewin.erp.service.tenant;

import com.wisewin.erp.service.ResourceInfo;

import java.lang.annotation.*;

@ResourceInfo(value = "tenant", type = 1574002444)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TenantResource {
}
