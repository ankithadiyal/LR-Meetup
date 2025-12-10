package com.meetup.common.rest.client.serdes.v1_0_0;

import com.meetup.common.rest.client.dto.v1_0_0.InternalServerErrorResponse;
import com.meetup.common.rest.client.json.BaseJSONParser;

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
public class InternalServerErrorResponseSerDes {

	public static InternalServerErrorResponse toDTO(String json) {
		InternalServerErrorResponseJSONParser
			internalServerErrorResponseJSONParser =
				new InternalServerErrorResponseJSONParser();

		return internalServerErrorResponseJSONParser.parseToDTO(json);
	}

	public static InternalServerErrorResponse[] toDTOs(String json) {
		InternalServerErrorResponseJSONParser
			internalServerErrorResponseJSONParser =
				new InternalServerErrorResponseJSONParser();

		return internalServerErrorResponseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		InternalServerErrorResponse internalServerErrorResponse) {

		if (internalServerErrorResponse == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (internalServerErrorResponse.getData() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"data\": ");

			if (internalServerErrorResponse.getData() instanceof String) {
				sb.append("\"");
				sb.append((String)internalServerErrorResponse.getData());
				sb.append("\"");
			}
			else {
				sb.append(internalServerErrorResponse.getData());
			}
		}

		if (internalServerErrorResponse.getMessage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"message\": ");

			sb.append("\"");

			sb.append(_escape(internalServerErrorResponse.getMessage()));

			sb.append("\"");
		}

		if (internalServerErrorResponse.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(internalServerErrorResponse.getStatus());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		InternalServerErrorResponseJSONParser
			internalServerErrorResponseJSONParser =
				new InternalServerErrorResponseJSONParser();

		return internalServerErrorResponseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		InternalServerErrorResponse internalServerErrorResponse) {

		if (internalServerErrorResponse == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (internalServerErrorResponse.getData() == null) {
			map.put("data", null);
		}
		else {
			map.put(
				"data", String.valueOf(internalServerErrorResponse.getData()));
		}

		if (internalServerErrorResponse.getMessage() == null) {
			map.put("message", null);
		}
		else {
			map.put(
				"message",
				String.valueOf(internalServerErrorResponse.getMessage()));
		}

		if (internalServerErrorResponse.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put(
				"status",
				String.valueOf(internalServerErrorResponse.getStatus()));
		}

		return map;
	}

	public static class InternalServerErrorResponseJSONParser
		extends BaseJSONParser<InternalServerErrorResponse> {

		@Override
		protected InternalServerErrorResponse createDTO() {
			return new InternalServerErrorResponse();
		}

		@Override
		protected InternalServerErrorResponse[] createDTOArray(int size) {
			return new InternalServerErrorResponse[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "data")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "message")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			InternalServerErrorResponse internalServerErrorResponse,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "data")) {
				if (jsonParserFieldValue != null) {
					internalServerErrorResponse.setData(
						(Object)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "message")) {
				if (jsonParserFieldValue != null) {
					internalServerErrorResponse.setMessage(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					internalServerErrorResponse.setStatus(
						Integer.valueOf((String)jsonParserFieldValue));
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