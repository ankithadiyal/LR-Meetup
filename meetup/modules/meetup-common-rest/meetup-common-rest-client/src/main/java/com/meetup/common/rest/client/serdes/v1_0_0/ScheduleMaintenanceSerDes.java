package com.meetup.common.rest.client.serdes.v1_0_0;

import com.meetup.common.rest.client.dto.v1_0_0.ScheduleMaintenance;
import com.meetup.common.rest.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class ScheduleMaintenanceSerDes {

	public static ScheduleMaintenance toDTO(String json) {
		ScheduleMaintenanceJSONParser scheduleMaintenanceJSONParser =
			new ScheduleMaintenanceJSONParser();

		return scheduleMaintenanceJSONParser.parseToDTO(json);
	}

	public static ScheduleMaintenance[] toDTOs(String json) {
		ScheduleMaintenanceJSONParser scheduleMaintenanceJSONParser =
			new ScheduleMaintenanceJSONParser();

		return scheduleMaintenanceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ScheduleMaintenance scheduleMaintenance) {
		if (scheduleMaintenance == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (scheduleMaintenance.getActualEndTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actualEndTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getActualEndTime()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getActualStartTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actualStartTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getActualStartTime()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(scheduleMaintenance.getDescription()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(scheduleMaintenance.getId());
		}

		if (scheduleMaintenance.getImpactType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"impactType\": ");

			sb.append("\"");

			sb.append(_escape(scheduleMaintenance.getImpactType()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getMaintenanceID() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maintenanceID\": ");

			sb.append("\"");

			sb.append(_escape(scheduleMaintenance.getMaintenanceID()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getMaintenanceStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maintenanceStatus\": ");

			sb.append("\"");

			sb.append(_escape(scheduleMaintenance.getMaintenanceStatus()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getPlannedMaintenanceEndTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"plannedMaintenanceEndTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getPlannedMaintenanceEndTime()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getPlannedMaintenanceStartTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"plannedMaintenanceStartTime\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getPlannedMaintenanceStartTime()));

			sb.append("\"");
		}

		if (scheduleMaintenance.getServiceId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append(scheduleMaintenance.getServiceId());
		}

		if (scheduleMaintenance.getUrgency() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urgency\": ");

			sb.append("\"");

			sb.append(_escape(scheduleMaintenance.getUrgency()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ScheduleMaintenanceJSONParser scheduleMaintenanceJSONParser =
			new ScheduleMaintenanceJSONParser();

		return scheduleMaintenanceJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		ScheduleMaintenance scheduleMaintenance) {

		if (scheduleMaintenance == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (scheduleMaintenance.getActualEndTime() == null) {
			map.put("actualEndTime", null);
		}
		else {
			map.put(
				"actualEndTime",
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getActualEndTime()));
		}

		if (scheduleMaintenance.getActualStartTime() == null) {
			map.put("actualStartTime", null);
		}
		else {
			map.put(
				"actualStartTime",
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getActualStartTime()));
		}

		if (scheduleMaintenance.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put(
				"description",
				String.valueOf(scheduleMaintenance.getDescription()));
		}

		if (scheduleMaintenance.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(scheduleMaintenance.getId()));
		}

		if (scheduleMaintenance.getImpactType() == null) {
			map.put("impactType", null);
		}
		else {
			map.put(
				"impactType",
				String.valueOf(scheduleMaintenance.getImpactType()));
		}

		if (scheduleMaintenance.getMaintenanceID() == null) {
			map.put("maintenanceID", null);
		}
		else {
			map.put(
				"maintenanceID",
				String.valueOf(scheduleMaintenance.getMaintenanceID()));
		}

		if (scheduleMaintenance.getMaintenanceStatus() == null) {
			map.put("maintenanceStatus", null);
		}
		else {
			map.put(
				"maintenanceStatus",
				String.valueOf(scheduleMaintenance.getMaintenanceStatus()));
		}

		if (scheduleMaintenance.getPlannedMaintenanceEndTime() == null) {
			map.put("plannedMaintenanceEndTime", null);
		}
		else {
			map.put(
				"plannedMaintenanceEndTime",
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getPlannedMaintenanceEndTime()));
		}

		if (scheduleMaintenance.getPlannedMaintenanceStartTime() == null) {
			map.put("plannedMaintenanceStartTime", null);
		}
		else {
			map.put(
				"plannedMaintenanceStartTime",
				liferayToJSONDateFormat.format(
					scheduleMaintenance.getPlannedMaintenanceStartTime()));
		}

		if (scheduleMaintenance.getServiceId() == null) {
			map.put("serviceId", null);
		}
		else {
			map.put(
				"serviceId",
				String.valueOf(scheduleMaintenance.getServiceId()));
		}

		if (scheduleMaintenance.getUrgency() == null) {
			map.put("urgency", null);
		}
		else {
			map.put(
				"urgency", String.valueOf(scheduleMaintenance.getUrgency()));
		}

		return map;
	}

	public static class ScheduleMaintenanceJSONParser
		extends BaseJSONParser<ScheduleMaintenance> {

		@Override
		protected ScheduleMaintenance createDTO() {
			return new ScheduleMaintenance();
		}

		@Override
		protected ScheduleMaintenance[] createDTOArray(int size) {
			return new ScheduleMaintenance[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "actualEndTime")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "actualStartTime")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "impactType")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "maintenanceID")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "maintenanceStatus")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "plannedMaintenanceEndTime")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "plannedMaintenanceStartTime")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "urgency")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ScheduleMaintenance scheduleMaintenance, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "actualEndTime")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setActualEndTime(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "actualStartTime")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setActualStartTime(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setDescription(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "impactType")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setImpactType(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "maintenanceID")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setMaintenanceID(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "maintenanceStatus")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setMaintenanceStatus(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "plannedMaintenanceEndTime")) {

				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setPlannedMaintenanceEndTime(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "plannedMaintenanceStartTime")) {

				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setPlannedMaintenanceStartTime(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setServiceId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "urgency")) {
				if (jsonParserFieldValue != null) {
					scheduleMaintenance.setUrgency(
						(String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			sb.append(_toJSON(value));

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static String _toJSON(Object value) {
		if (value instanceof Map) {
			return _toJSON((Map)value);
		}

		Class<?> clazz = value.getClass();

		if (clazz.isArray()) {
			StringBuilder sb = new StringBuilder("[");

			Object[] values = (Object[])value;

			for (int i = 0; i < values.length; i++) {
				sb.append(_toJSON(values[i]));

				if ((i + 1) < values.length) {
					sb.append(", ");
				}
			}

			sb.append("]");

			return sb.toString();
		}

		if (value instanceof String) {
			return "\"" + _escape(value) + "\"";
		}

		return String.valueOf(value);
	}

}