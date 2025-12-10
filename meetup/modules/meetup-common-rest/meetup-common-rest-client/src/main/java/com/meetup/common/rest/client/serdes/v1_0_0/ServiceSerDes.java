package com.meetup.common.rest.client.serdes.v1_0_0;

import com.meetup.common.rest.client.dto.v1_0_0.ScheduleMaintenance;
import com.meetup.common.rest.client.dto.v1_0_0.Service;
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
public class ServiceSerDes {

	public static Service toDTO(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToDTO(json);
	}

	public static Service[] toDTOs(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Service service) {
		if (service == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (service.getActivationDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"activationDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(service.getActivationDate()));

			sb.append("\"");
		}

		if (service.getBandwidth() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bandwidth\": ");

			sb.append("\"");

			sb.append(_escape(service.getBandwidth()));

			sb.append("\"");
		}

		if (service.getBillingFrequency() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"billingFrequency\": ");

			sb.append("\"");

			sb.append(_escape(service.getBillingFrequency()));

			sb.append("\"");
		}

		if (service.getContractPeriod() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contractPeriod\": ");

			sb.append("\"");

			sb.append(_escape(service.getContractPeriod()));

			sb.append("\"");
		}

		if (service.getContractRenewal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contractRenewal\": ");

			sb.append("\"");

			sb.append(_escape(service.getContractRenewal()));

			sb.append("\"");
		}

		if (service.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(service.getDescription()));

			sb.append("\"");
		}

		if (service.getDestinationLocation() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"destinationLocation\": ");

			sb.append("\"");

			sb.append(_escape(service.getDestinationLocation()));

			sb.append("\"");
		}

		if (service.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(service.getId());
		}

		if (service.getInterfaceType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"interfaceType\": ");

			sb.append("\"");

			sb.append(_escape(service.getInterfaceType()));

			sb.append("\"");
		}

		if (service.getModificationDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modificationDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(service.getModificationDate()));

			sb.append("\"");
		}

		if (service.getPaymentTerms() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentTerms\": ");

			sb.append("\"");

			sb.append(_escape(service.getPaymentTerms()));

			sb.append("\"");
		}

		if (service.getScheduleMaintenances() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"scheduleMaintenances\": ");

			sb.append("[");

			for (int i = 0; i < service.getScheduleMaintenances().length; i++) {
				sb.append(String.valueOf(service.getScheduleMaintenances()[i]));

				if ((i + 1) < service.getScheduleMaintenances().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (service.getServiceCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceCategory\": ");

			sb.append("\"");

			sb.append(_escape(service.getServiceCategory()));

			sb.append("\"");
		}

		if (service.getServiceId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append("\"");

			sb.append(_escape(service.getServiceId()));

			sb.append("\"");
		}

		if (service.getServiceStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceStatus\": ");

			sb.append("\"");

			sb.append(_escape(service.getServiceStatus()));

			sb.append("\"");
		}

		if (service.getServiceType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceType\": ");

			sb.append("\"");

			sb.append(_escape(service.getServiceType()));

			sb.append("\"");
		}

		if (service.getSourceLocation() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sourceLocation\": ");

			sb.append("\"");

			sb.append(_escape(service.getSourceLocation()));

			sb.append("\"");
		}

		if (service.getTickets() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tickets\": ");

			sb.append("[");

			for (int i = 0; i < service.getTickets().length; i++) {
				sb.append(String.valueOf(service.getTickets()[i]));

				if ((i + 1) < service.getTickets().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (service.getVariantName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"variantName\": ");

			sb.append("\"");

			sb.append(_escape(service.getVariantName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Service service) {
		if (service == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (service.getActivationDate() == null) {
			map.put("activationDate", null);
		}
		else {
			map.put(
				"activationDate",
				liferayToJSONDateFormat.format(service.getActivationDate()));
		}

		if (service.getBandwidth() == null) {
			map.put("bandwidth", null);
		}
		else {
			map.put("bandwidth", String.valueOf(service.getBandwidth()));
		}

		if (service.getBillingFrequency() == null) {
			map.put("billingFrequency", null);
		}
		else {
			map.put(
				"billingFrequency",
				String.valueOf(service.getBillingFrequency()));
		}

		if (service.getContractPeriod() == null) {
			map.put("contractPeriod", null);
		}
		else {
			map.put(
				"contractPeriod", String.valueOf(service.getContractPeriod()));
		}

		if (service.getContractRenewal() == null) {
			map.put("contractRenewal", null);
		}
		else {
			map.put(
				"contractRenewal",
				String.valueOf(service.getContractRenewal()));
		}

		if (service.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(service.getDescription()));
		}

		if (service.getDestinationLocation() == null) {
			map.put("destinationLocation", null);
		}
		else {
			map.put(
				"destinationLocation",
				String.valueOf(service.getDestinationLocation()));
		}

		if (service.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(service.getId()));
		}

		if (service.getInterfaceType() == null) {
			map.put("interfaceType", null);
		}
		else {
			map.put(
				"interfaceType", String.valueOf(service.getInterfaceType()));
		}

		if (service.getModificationDate() == null) {
			map.put("modificationDate", null);
		}
		else {
			map.put(
				"modificationDate",
				liferayToJSONDateFormat.format(service.getModificationDate()));
		}

		if (service.getPaymentTerms() == null) {
			map.put("paymentTerms", null);
		}
		else {
			map.put("paymentTerms", String.valueOf(service.getPaymentTerms()));
		}

		if (service.getScheduleMaintenances() == null) {
			map.put("scheduleMaintenances", null);
		}
		else {
			map.put(
				"scheduleMaintenances",
				String.valueOf(service.getScheduleMaintenances()));
		}

		if (service.getServiceCategory() == null) {
			map.put("serviceCategory", null);
		}
		else {
			map.put(
				"serviceCategory",
				String.valueOf(service.getServiceCategory()));
		}

		if (service.getServiceId() == null) {
			map.put("serviceId", null);
		}
		else {
			map.put("serviceId", String.valueOf(service.getServiceId()));
		}

		if (service.getServiceStatus() == null) {
			map.put("serviceStatus", null);
		}
		else {
			map.put(
				"serviceStatus", String.valueOf(service.getServiceStatus()));
		}

		if (service.getServiceType() == null) {
			map.put("serviceType", null);
		}
		else {
			map.put("serviceType", String.valueOf(service.getServiceType()));
		}

		if (service.getSourceLocation() == null) {
			map.put("sourceLocation", null);
		}
		else {
			map.put(
				"sourceLocation", String.valueOf(service.getSourceLocation()));
		}

		if (service.getTickets() == null) {
			map.put("tickets", null);
		}
		else {
			map.put("tickets", String.valueOf(service.getTickets()));
		}

		if (service.getVariantName() == null) {
			map.put("variantName", null);
		}
		else {
			map.put("variantName", String.valueOf(service.getVariantName()));
		}

		return map;
	}

	public static class ServiceJSONParser extends BaseJSONParser<Service> {

		@Override
		protected Service createDTO() {
			return new Service();
		}

		@Override
		protected Service[] createDTOArray(int size) {
			return new Service[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "activationDate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "bandwidth")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "billingFrequency")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "contractPeriod")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "contractRenewal")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "destinationLocation")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "interfaceType")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "modificationDate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "paymentTerms")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "scheduleMaintenances")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceCategory")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceStatus")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "serviceType")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "sourceLocation")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tickets")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "variantName")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Service service, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "activationDate")) {
				if (jsonParserFieldValue != null) {
					service.setActivationDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "bandwidth")) {
				if (jsonParserFieldValue != null) {
					service.setBandwidth((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "billingFrequency")) {
				if (jsonParserFieldValue != null) {
					service.setBillingFrequency((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "contractPeriod")) {
				if (jsonParserFieldValue != null) {
					service.setContractPeriod((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "contractRenewal")) {
				if (jsonParserFieldValue != null) {
					service.setContractRenewal((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					service.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "destinationLocation")) {

				if (jsonParserFieldValue != null) {
					service.setDestinationLocation(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					service.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "interfaceType")) {
				if (jsonParserFieldValue != null) {
					service.setInterfaceType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "modificationDate")) {
				if (jsonParserFieldValue != null) {
					service.setModificationDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "paymentTerms")) {
				if (jsonParserFieldValue != null) {
					service.setPaymentTerms((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "scheduleMaintenances")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ScheduleMaintenance[] scheduleMaintenancesArray =
						new ScheduleMaintenance[jsonParserFieldValues.length];

					for (int i = 0; i < scheduleMaintenancesArray.length; i++) {
						scheduleMaintenancesArray[i] =
							ScheduleMaintenanceSerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					service.setScheduleMaintenances(scheduleMaintenancesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceCategory")) {
				if (jsonParserFieldValue != null) {
					service.setServiceCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceId")) {
				if (jsonParserFieldValue != null) {
					service.setServiceId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceStatus")) {
				if (jsonParserFieldValue != null) {
					service.setServiceStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceType")) {
				if (jsonParserFieldValue != null) {
					service.setServiceType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "sourceLocation")) {
				if (jsonParserFieldValue != null) {
					service.setSourceLocation((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tickets")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					Ticket[] ticketsArray =
						new Ticket[jsonParserFieldValues.length];

					for (int i = 0; i < ticketsArray.length; i++) {
						ticketsArray[i] = TicketSerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					service.setTickets(ticketsArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "variantName")) {
				if (jsonParserFieldValue != null) {
					service.setVariantName((String)jsonParserFieldValue);
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