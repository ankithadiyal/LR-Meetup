package com.meetup.common.rest.client.dto.v1_0_0;

import com.meetup.common.rest.client.function.UnsafeSupplier;
import com.meetup.common.rest.client.serdes.v1_0_0.ResponseSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class Response implements Cloneable, Serializable {

	public static Response toDTO(String json) {
		return ResponseSerDes.toDTO(json);
	}

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
	public Response clone() throws CloneNotSupportedException {
		return (Response)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Response)) {
			return false;
		}

		Response response = (Response)object;

		return Objects.equals(toString(), response.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ResponseSerDes.toJSON(this);
	}

}