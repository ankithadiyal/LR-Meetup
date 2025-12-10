package com.meetup.common.rest.client.dto.v1_0_0;

import com.meetup.common.rest.client.function.UnsafeSupplier;
import com.meetup.common.rest.client.serdes.v1_0_0.InternalServerErrorResponseSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class InternalServerErrorResponse implements Cloneable, Serializable {

	public static InternalServerErrorResponse toDTO(String json) {
		return InternalServerErrorResponseSerDes.toDTO(json);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setData(UnsafeSupplier<Object, Exception> dataUnsafeSupplier) {
		try {
			data = dataUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Object data;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessage(
		UnsafeSupplier<String, Exception> messageUnsafeSupplier) {

		try {
			message = messageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String message;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<Integer, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer status;

	@Override
	public InternalServerErrorResponse clone()
		throws CloneNotSupportedException {

		return (InternalServerErrorResponse)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InternalServerErrorResponse)) {
			return false;
		}

		InternalServerErrorResponse internalServerErrorResponse =
			(InternalServerErrorResponse)object;

		return Objects.equals(
			toString(), internalServerErrorResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return InternalServerErrorResponseSerDes.toJSON(this);
	}

}