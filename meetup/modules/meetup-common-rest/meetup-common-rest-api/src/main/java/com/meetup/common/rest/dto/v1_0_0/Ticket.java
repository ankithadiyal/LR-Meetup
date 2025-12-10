package com.meetup.common.rest.dto.v1_0_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
@GraphQLName(description = "Liferay object Ticket", value = "Ticket")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Ticket")
public class Ticket implements Serializable {

	public static Ticket toDTO(String json) {
		return ObjectMapperUtil.readValue(Ticket.class, json);
	}

	public static Ticket unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Ticket.class, json);
	}

	@Schema
	public Date getDate() {
		if (_dateSupplier != null) {
			date = _dateSupplier.get();

			_dateSupplier = null;
		}

		return date;
	}

	public void setDate(Date date) {
		this.date = date;

		_dateSupplier = null;
	}

	@JsonIgnore
	public void setDate(UnsafeSupplier<Date, Exception> dateUnsafeSupplier) {
		_dateSupplier = () -> {
			try {
				return dateUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date date;

	@JsonIgnore
	private Supplier<Date> _dateSupplier;

	@Schema
	public String getDescription() {
		if (_descriptionSupplier != null) {
			description = _descriptionSupplier.get();

			_descriptionSupplier = null;
		}

		return description;
	}

	public void setDescription(String description) {
		this.description = description;

		_descriptionSupplier = null;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	@JsonIgnore
	private Supplier<String> _descriptionSupplier;

	@Schema
	public Long getId() {
		if (_idSupplier != null) {
			id = _idSupplier.get();

			_idSupplier = null;
		}

		return id;
	}

	public void setId(Long id) {
		this.id = id;

		_idSupplier = null;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		_idSupplier = () -> {
			try {
				return idUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	@JsonIgnore
	private Supplier<Long> _idSupplier;

	@Schema(
		description = "Related Service ID (relationship field r_ticketServiceId_c_serviceId)"
	)
	public Long getServiceId() {
		if (_serviceIdSupplier != null) {
			serviceId = _serviceIdSupplier.get();

			_serviceIdSupplier = null;
		}

		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;

		_serviceIdSupplier = null;
	}

	@JsonIgnore
	public void setServiceId(
		UnsafeSupplier<Long, Exception> serviceIdUnsafeSupplier) {

		_serviceIdSupplier = () -> {
			try {
				return serviceIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(
		description = "Related Service ID (relationship field r_ticketServiceId_c_serviceId)"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long serviceId;

	@JsonIgnore
	private Supplier<Long> _serviceIdSupplier;

	@Schema
	public String getSubject() {
		if (_subjectSupplier != null) {
			subject = _subjectSupplier.get();

			_subjectSupplier = null;
		}

		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;

		_subjectSupplier = null;
	}

	@JsonIgnore
	public void setSubject(
		UnsafeSupplier<String, Exception> subjectUnsafeSupplier) {

		_subjectSupplier = () -> {
			try {
				return subjectUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String subject;

	@JsonIgnore
	private Supplier<String> _subjectSupplier;

	@Schema
	public String getTicketID() {
		if (_ticketIDSupplier != null) {
			ticketID = _ticketIDSupplier.get();

			_ticketIDSupplier = null;
		}

		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;

		_ticketIDSupplier = null;
	}

	@JsonIgnore
	public void setTicketID(
		UnsafeSupplier<String, Exception> ticketIDUnsafeSupplier) {

		_ticketIDSupplier = () -> {
			try {
				return ticketIDUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String ticketID;

	@JsonIgnore
	private Supplier<String> _ticketIDSupplier;

	@Schema
	public String getTicketStatus() {
		if (_ticketStatusSupplier != null) {
			ticketStatus = _ticketStatusSupplier.get();

			_ticketStatusSupplier = null;
		}

		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;

		_ticketStatusSupplier = null;
	}

	@JsonIgnore
	public void setTicketStatus(
		UnsafeSupplier<String, Exception> ticketStatusUnsafeSupplier) {

		_ticketStatusSupplier = () -> {
			try {
				return ticketStatusUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String ticketStatus;

	@JsonIgnore
	private Supplier<String> _ticketStatusSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Ticket)) {
			return false;
		}

		Ticket ticket = (Ticket)object;

		return Objects.equals(toString(), ticket.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		Date date = getDate();

		if (date != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(date));

			sb.append("\"");
		}

		String description = getDescription();

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		Long id = getId();

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		Long serviceId = getServiceId();

		if (serviceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append(serviceId);
		}

		String subject = getSubject();

		if (subject != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subject\": ");

			sb.append("\"");

			sb.append(_escape(subject));

			sb.append("\"");
		}

		String ticketID = getTicketID();

		if (ticketID != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ticketID\": ");

			sb.append("\"");

			sb.append(_escape(ticketID));

			sb.append("\"");
		}

		String ticketStatus = getTicketStatus();

		if (ticketStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ticketStatus\": ");

			sb.append("\"");

			sb.append(_escape(ticketStatus));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.meetup.common.rest.dto.v1_0_0.Ticket",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof Map) {
						sb.append(_toJSON((Map<String, ?>)valueArray[i]));
					}
					else if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}