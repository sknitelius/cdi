package com.vaadin.cdi.viewscope;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Scope;

/**
 * Annotation used for declaring bean class scope for VaadinUI beans
 * 
 * @author Adam Bien
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Inherited
public @interface VaadinViewScoped {
}
