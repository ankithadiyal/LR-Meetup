package com.meetup.common.rest.client.serdes.v1_0_0;

import com.meetup.common.rest.client.dto.v1_0_0.Ticket;
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
public class TicketSerDes {

	public static Ticket toDTO(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToDTO(json);
	}

	public static Ticket[] toDTOs(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Ticket ticket) {
		if (ticket == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (ticket.getDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(ticket.getDate()));

			sb.append("\"");
		}

		if (ticket.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getDescription()));

			sb.append("\"");
		}

		if (ticket.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(ticket.getId());
		}

		if (ticket.getServiceId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append(ticket.getServiceId());
		}

		if (ticket.getSubject() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subject\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getSubject()));

			sb.append("\"");
		}

		if (ticket.getTicketID() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ticketID\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getTicketID()));

			sb.append("\"");
		}

		if (ticket.getTicketStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ticketStatus\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getTicketStatus()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Ticket ticket) {
		if (ticket == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (ticket.getDate() == null) {
			map.put("date", null);
		}
		else {
			map.put("date", liferayToJSONDateFormat.format(ticket.getDate()));
		}

		if (ticket.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(ticket.getDescription()));
		}

		if (ticket.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(ticket.getId()));
		}

		if (ticket.getServiceId() == null) {
			map.put("serviceId", null);
		}
		else {
			map.put("serviceId", String.valueOf(ticket.getServiceId()));
		}

		if (ticket.getSubject() == null) {
			map.put("subject", null);
		}
		else {
			map.put("subject", String.valueOf(ticket.getSubject()));
		}

		if (ticket.getTicketID() == null) {
			map.put("ticketID", null);
		}
		else {
			map.put("ticketID", String.valueOf(ticket.getTicketID()));
		}

		if (ticket.getTicketStatus() == null) {
			map.put("ticketStatus", null);
		}
		else {
			map.put("ticketStatus", String.valueOf(ticket.getTicketStatus()));
		}

		return map;
	}

	public static class TicketJSONParser extends BaseJSONParser<Ticket> {

		@Override
		protected Ticket createDTO() {
			return new Ticket();
		}

		@Override
		protected Ticket[] createDTOArray(int size) {
			return new Ticket[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "date")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "subject")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "ticketID")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "ticketStatus")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Ticket ticket, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "date")) {
				if (jsonParserFieldValue != null) {
					ticket.setDate(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					ticket.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					ticket.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				if (jsonParserFieldValue != null) {
					ticket.setServiceId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "subject")) {
				if (jsonParserFieldValue != null) {
					ticket.setSubject((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "ticketID")) {
				if (jsonParserFieldValue != null) {
					ticket.setTicketID((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "ticketStatus")) {
				if (jsonParserFieldValue != null) {
					ticket.setTicketStatus((String)jsonParserFieldValue);
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