package com.meetup.common.rest.client.function;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}