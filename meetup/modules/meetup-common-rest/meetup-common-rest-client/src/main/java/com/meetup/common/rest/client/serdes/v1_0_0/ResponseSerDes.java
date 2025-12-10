package com.meetup.common.rest.client.serdes.v1_0_0;

import com.meetup.common.rest.client.dto.v1_0_0.Response;
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
public class ResponseSerDes {

	public static Response toDTO(String json) {
		ResponseJSONParser responseJSONParser = new ResponseJSONParser();

		return responseJSONParser.parseToDTO(json);
	}

	public static Response[] toDTOs(String json) {
		ResponseJSONParser responseJSONParser = new ResponseJSONParser();

		return responseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Response response) {
		if (response == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (response.getMessage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"message\": ");

			sb.append("\"");

			sb.append(_escape(response.getMessage()));

			sb.append("\"");
		}

		if (response.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(response.getStatus());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ResponseJSONParser responseJSONParser = new ResponseJSONParser();

		return responseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Response response) {
		if (response == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (response.getMessage() == null) {
			map.put("message", null);
		}
		else {
			map.put("message", String.valueOf(response.getMessage()));
		}

		if (response.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(response.getStatus()));
		}

		return map;
	}

	public static class ResponseJSONParser extends BaseJSONParser<Response> {

		@Override
		protected Response createDTO() {
			return new Response();
		}

		@Override
		protected Response[] createDTOArray(int size) {
			return new Response[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "message")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Response response, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "message")) {
				if (jsonParserFieldValue != null) {
					response.setMessage((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					response.setStatus(
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