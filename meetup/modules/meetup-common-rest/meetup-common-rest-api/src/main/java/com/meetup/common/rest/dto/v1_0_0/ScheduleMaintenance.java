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
@GraphQLName(
	description = "Liferay object ScheduleMaintenance",
	value = "ScheduleMaintenance"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ScheduleMaintenance")
public class ScheduleMaintenance implements Serializable {

	public static ScheduleMaintenance toDTO(String json) {
		return ObjectMapperUtil.readValue(ScheduleMaintenance.class, json);
	}

	public static ScheduleMaintenance unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ScheduleMaintenance.class, json);
	}

	@Schema
	public Date getActualEndTime() {
		if (_actualEndTimeSupplier != null) {
			actualEndTime = _actualEndTimeSupplier.get();

			_actualEndTimeSupplier = null;
		}

		return actualEndTime;
	}

	public void setActualEndTime(Date actualEndTime) {
		this.actualEndTime = actualEndTime;

		_actualEndTimeSupplier = null;
	}

	@JsonIgnore
	public void setActualEndTime(
		UnsafeSupplier<Date, Exception> actualEndTimeUnsafeSupplier) {

		_actualEndTimeSupplier = () -> {
			try {
				return actualEndTimeUnsafeSupplier.get();
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
	protected Date actualEndTime;

	@JsonIgnore
	private Supplier<Date> _actualEndTimeSupplier;

	@Schema
	public Date getActualStartTime() {
		if (_actualStartTimeSupplier != null) {
			actualStartTime = _actualStartTimeSupplier.get();

			_actualStartTimeSupplier = null;
		}

		return actualStartTime;
	}

	public void setActualStartTime(Date actualStartTime) {
		this.actualStartTime = actualStartTime;

		_actualStartTimeSupplier = null;
	}

	@JsonIgnore
	public void setActualStartTime(
		UnsafeSupplier<Date, Exception> actualStartTimeUnsafeSupplier) {

		_actualStartTimeSupplier = () -> {
			try {
				return actualStartTimeUnsafeSupplier.get();
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
	protected Date actualStartTime;

	@JsonIgnore
	private Supplier<Date> _actualStartTimeSupplier;

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

	@Schema
	public String getImpactType() {
		if (_impactTypeSupplier != null) {
			impactType = _impactTypeSupplier.get();

			_impactTypeSupplier = null;
		}

		return impactType;
	}

	public void setImpactType(String impactType) {
		this.impactType = impactType;

		_impactTypeSupplier = null;
	}

	@JsonIgnore
	public void setImpactType(
		UnsafeSupplier<String, Exception> impactTypeUnsafeSupplier) {

		_impactTypeSupplier = () -> {
			try {
				return impactTypeUnsafeSupplier.get();
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
	protected String impactType;

	@JsonIgnore
	private Supplier<String> _impactTypeSupplier;

	@Schema
	public String getMaintenanceID() {
		if (_maintenanceIDSupplier != null) {
			maintenanceID = _maintenanceIDSupplier.get();

			_maintenanceIDSupplier = null;
		}

		return maintenanceID;
	}

	public void setMaintenanceID(String maintenanceID) {
		this.maintenanceID = maintenanceID;

		_maintenanceIDSupplier = null;
	}

	@JsonIgnore
	public void setMaintenanceID(
		UnsafeSupplier<String, Exception> maintenanceIDUnsafeSupplier) {

		_maintenanceIDSupplier = () -> {
			try {
				return maintenanceIDUnsafeSupplier.get();
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
	protected String maintenanceID;

	@JsonIgnore
	private Supplier<String> _maintenanceIDSupplier;

	@Schema
	public String getMaintenanceStatus() {
		if (_maintenanceStatusSupplier != null) {
			maintenanceStatus = _maintenanceStatusSupplier.get();

			_maintenanceStatusSupplier = null;
		}

		return maintenanceStatus;
	}

	public void setMaintenanceStatus(String maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;

		_maintenanceStatusSupplier = null;
	}

	@JsonIgnore
	public void setMaintenanceStatus(
		UnsafeSupplier<String, Exception> maintenanceStatusUnsafeSupplier) {

		_maintenanceStatusSupplier = () -> {
			try {
				return maintenanceStatusUnsafeSupplier.get();
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
	protected String maintenanceStatus;

	@JsonIgnore
	private Supplier<String> _maintenanceStatusSupplier;

	@Schema
	public Date getPlannedMaintenanceEndTime() {
		if (_plannedMaintenanceEndTimeSupplier != null) {
			plannedMaintenanceEndTime =
				_plannedMaintenanceEndTimeSupplier.get();

			_plannedMaintenanceEndTimeSupplier = null;
		}

		return plannedMaintenanceEndTime;
	}

	public void setPlannedMaintenanceEndTime(Date plannedMaintenanceEndTime) {
		this.plannedMaintenanceEndTime = plannedMaintenanceEndTime;

		_plannedMaintenanceEndTimeSupplier = null;
	}

	@JsonIgnore
	public void setPlannedMaintenanceEndTime(
		UnsafeSupplier<Date, Exception>
			plannedMaintenanceEndTimeUnsafeSupplier) {

		_plannedMaintenanceEndTimeSupplier = () -> {
			try {
				return plannedMaintenanceEndTimeUnsafeSupplier.get();
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
	protected Date plannedMaintenanceEndTime;

	@JsonIgnore
	private Supplier<Date> _plannedMaintenanceEndTimeSupplier;

	@Schema
	public Date getPlannedMaintenanceStartTime() {
		if (_plannedMaintenanceStartTimeSupplier != null) {
			plannedMaintenanceStartTime =
				_plannedMaintenanceStartTimeSupplier.get();

			_plannedMaintenanceStartTimeSupplier = null;
		}

		return plannedMaintenanceStartTime;
	}

	public void setPlannedMaintenanceStartTime(
		Date plannedMaintenanceStartTime) {

		this.plannedMaintenanceStartTime = plannedMaintenanceStartTime;

		_plannedMaintenanceStartTimeSupplier = null;
	}

	@JsonIgnore
	public void setPlannedMaintenanceStartTime(
		UnsafeSupplier<Date, Exception>
			plannedMaintenanceStartTimeUnsafeSupplier) {

		_plannedMaintenanceStartTimeSupplier = () -> {
			try {
				return plannedMaintenanceStartTimeUnsafeSupplier.get();
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
	protected Date plannedMaintenanceStartTime;

	@JsonIgnore
	private Supplier<Date> _plannedMaintenanceStartTimeSupplier;

	@Schema(
		description = "Related Service ID (relationship field r_serviceId_c_serviceId)"
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
		description = "Related Service ID (relationship field r_serviceId_c_serviceId)"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long serviceId;

	@JsonIgnore
	private Supplier<Long> _serviceIdSupplier;

	@Schema
	public String getUrgency() {
		if (_urgencySupplier != null) {
			urgency = _urgencySupplier.get();

			_urgencySupplier = null;
		}

		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;

		_urgencySupplier = null;
	}

	@JsonIgnore
	public void setUrgency(
		UnsafeSupplier<String, Exception> urgencyUnsafeSupplier) {

		_urgencySupplier = () -> {
			try {
				return urgencyUnsafeSupplier.get();
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
	protected String urgency;

	@JsonIgnore
	private Supplier<String> _urgencySupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ScheduleMaintenance)) {
			return false;
		}

		ScheduleMaintenance scheduleMaintenance = (ScheduleMaintenance)object;

		return Objects.equals(toString(), scheduleMaintenance.toString());
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

		Date actualEndTime = getActualEndTime();

		if (actualEndTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actualEndTime\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(actualEndTime));

			sb.append("\"");
		}

		Date actualStartTime = getActualStartTime();

		if (actualStartTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actualStartTime\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(actualStartTime));

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

		String impactType = getImpactType();

		if (impactType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"impactType\": ");

			sb.append("\"");

			sb.append(_escape(impactType));

			sb.append("\"");
		}

		String maintenanceID = getMaintenanceID();

		if (maintenanceID != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maintenanceID\": ");

			sb.append("\"");

			sb.append(_escape(maintenanceID));

			sb.append("\"");
		}

		String maintenanceStatus = getMaintenanceStatus();

		if (maintenanceStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maintenanceStatus\": ");

			sb.append("\"");

			sb.append(_escape(maintenanceStatus));

			sb.append("\"");
		}

		Date plannedMaintenanceEndTime = getPlannedMaintenanceEndTime();

		if (plannedMaintenanceEndTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"plannedMaintenanceEndTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(plannedMaintenanceEndTime));

			sb.append("\"");
		}

		Date plannedMaintenanceStartTime = getPlannedMaintenanceStartTime();

		if (plannedMaintenanceStartTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"plannedMaintenanceStartTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(plannedMaintenanceStartTime));

			sb.append("\"");
		}

		Long serviceId = getServiceId();

		if (serviceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append(serviceId);
		}

		String urgency = getUrgency();

		if (urgency != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urgency\": ");

			sb.append("\"");

			sb.append(_escape(urgency));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.meetup.common.rest.dto.v1_0_0.ScheduleMaintenance",
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