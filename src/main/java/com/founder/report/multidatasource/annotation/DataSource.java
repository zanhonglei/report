package com.founder.report.multidatasource.annotation;


import com.founder.report.multidatasource.core.DataSourceEnum;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DataSource {
    DataSourceEnum value() default DataSourceEnum.master;
}
