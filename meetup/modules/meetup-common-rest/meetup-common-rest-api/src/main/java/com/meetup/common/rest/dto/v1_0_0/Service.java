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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
@GraphQLName(description = "Liferay object Service", value = "Service")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Service")
public class Service implements Serializable {

	public static Service toDTO(String json) {
		return ObjectMapperUtil.readValue(Service.class, json);
	}

	public static Service unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Service.class, json);
	}

	@Schema
	public Date getActivationDate() {
		if (_activationDateSupplier != null) {
			activationDate = _activationDateSupplier.get();

			_activationDateSupplier = null;
		}

		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;

		_activationDateSupplier = null;
	}

	@JsonIgnore
	public void setActivationDate(
		UnsafeSupplier<Date, Exception> activationDateUnsafeSupplier) {

		_activationDateSupplier = () -> {
			try {
				return activationDateUnsafeSupplier.get();
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
	protected Date activationDate;

	@JsonIgnore
	private Supplier<Date> _activationDateSupplier;

	@Schema
	public String getBandwidth() {
		if (_bandwidthSupplier != null) {
			bandwidth = _bandwidthSupplier.get();

			_bandwidthSupplier = null;
		}

		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;

		_bandwidthSupplier = null;
	}

	@JsonIgnore
	public void setBandwidth(
		UnsafeSupplier<String, Exception> bandwidthUnsafeSupplier) {

		_bandwidthSupplier = () -> {
			try {
				return bandwidthUnsafeSupplier.get();
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
	protected String bandwidth;

	@JsonIgnore
	private Supplier<String> _bandwidthSupplier;

	@Schema
	public String getBillingFrequency() {
		if (_billingFrequencySupplier != null) {
			billingFrequency = _billingFrequencySupplier.get();

			_billingFrequencySupplier = null;
		}

		return billingFrequency;
	}

	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;

		_billingFrequencySupplier = null;
	}

	@JsonIgnore
	public void setBillingFrequency(
		UnsafeSupplier<String, Exception> billingFrequencyUnsafeSupplier) {

		_billingFrequencySupplier = () -> {
			try {
				return billingFrequencyUnsafeSupplier.get();
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
	protected String billingFrequency;

	@JsonIgnore
	private Supplier<String> _billingFrequencySupplier;

	@Schema
	public String getContractPeriod() {
		if (_contractPeriodSupplier != null) {
			contractPeriod = _contractPeriodSupplier.get();

			_contractPeriodSupplier = null;
		}

		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;

		_contractPeriodSupplier = null;
	}

	@JsonIgnore
	public void setContractPeriod(
		UnsafeSupplier<String, Exception> contractPeriodUnsafeSupplier) {

		_contractPeriodSupplier = () -> {
			try {
				return contractPeriodUnsafeSupplier.get();
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
	protected String contractPeriod;

	@JsonIgnore
	private Supplier<String> _contractPeriodSupplier;

	@Schema
	public String getContractRenewal() {
		if (_contractRenewalSupplier != null) {
			contractRenewal = _contractRenewalSupplier.get();

			_contractRenewalSupplier = null;
		}

		return contractRenewal;
	}

	public void setContractRenewal(String contractRenewal) {
		this.contractRenewal = contractRenewal;

		_contractRenewalSupplier = null;
	}

	@JsonIgnore
	public void setContractRenewal(
		UnsafeSupplier<String, Exception> contractRenewalUnsafeSupplier) {

		_contractRenewalSupplier = () -> {
			try {
				return contractRenewalUnsafeSupplier.get();
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
	protected String contractRenewal;

	@JsonIgnore
	private Supplier<String> _contractRenewalSupplier;

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
	public String getDestinationLocation() {
		if (_destinationLocationSupplier != null) {
			destinationLocation = _destinationLocationSupplier.get();

			_destinationLocationSupplier = null;
		}

		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;

		_destinationLocationSupplier = null;
	}

	@JsonIgnore
	public void setDestinationLocation(
		UnsafeSupplier<String, Exception> destinationLocationUnsafeSupplier) {

		_destinationLocationSupplier = () -> {
			try {
				return destinationLocationUnsafeSupplier.get();
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
	protected String destinationLocation;

	@JsonIgnore
	private Supplier<String> _destinationLocationSupplier;

	@Schema(description = "Internal Service entry ID")
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

	@GraphQLField(description = "Internal Service entry ID")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	@JsonIgnore
	private Supplier<Long> _idSupplier;

	@Schema
	public String getInterfaceType() {
		if (_interfaceTypeSupplier != null) {
			interfaceType = _interfaceTypeSupplier.get();

			_interfaceTypeSupplier = null;
		}

		return interfaceType;
	}

	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;

		_interfaceTypeSupplier = null;
	}

	@JsonIgnore
	public void setInterfaceType(
		UnsafeSupplier<String, Exception> interfaceTypeUnsafeSupplier) {

		_interfaceTypeSupplier = () -> {
			try {
				return interfaceTypeUnsafeSupplier.get();
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
	protected String interfaceType;

	@JsonIgnore
	private Supplier<String> _interfaceTypeSupplier;

	@Schema
	public Date getModificationDate() {
		if (_modificationDateSupplier != null) {
			modificationDate = _modificationDateSupplier.get();

			_modificationDateSupplier = null;
		}

		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;

		_modificationDateSupplier = null;
	}

	@JsonIgnore
	public void setModificationDate(
		UnsafeSupplier<Date, Exception> modificationDateUnsafeSupplier) {

		_modificationDateSupplier = () -> {
			try {
				return modificationDateUnsafeSupplier.get();
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
	protected Date modificationDate;

	@JsonIgnore
	private Supplier<Date> _modificationDateSupplier;

	@Schema
	public String getPaymentTerms() {
		if (_paymentTermsSupplier != null) {
			paymentTerms = _paymentTermsSupplier.get();

			_paymentTermsSupplier = null;
		}

		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;

		_paymentTermsSupplier = null;
	}

	@JsonIgnore
	public void setPaymentTerms(
		UnsafeSupplier<String, Exception> paymentTermsUnsafeSupplier) {

		_paymentTermsSupplier = () -> {
			try {
				return paymentTermsUnsafeSupplier.get();
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
	protected String paymentTerms;

	@JsonIgnore
	private Supplier<String> _paymentTermsSupplier;

	@Schema
	@Valid
	public ScheduleMaintenance[] getScheduleMaintenances() {
		if (_scheduleMaintenancesSupplier != null) {
			scheduleMaintenances = _scheduleMaintenancesSupplier.get();

			_scheduleMaintenancesSupplier = null;
		}

		return scheduleMaintenances;
	}

	public void setScheduleMaintenances(
		ScheduleMaintenance[] scheduleMaintenances) {

		this.scheduleMaintenances = scheduleMaintenances;

		_scheduleMaintenancesSupplier = null;
	}

	@JsonIgnore
	public void setScheduleMaintenances(
		UnsafeSupplier<ScheduleMaintenance[], Exception>
			scheduleMaintenancesUnsafeSupplier) {

		_scheduleMaintenancesSupplier = () -> {
			try {
				return scheduleMaintenancesUnsafeSupplier.get();
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
	protected ScheduleMaintenance[] scheduleMaintenances;

	@JsonIgnore
	private Supplier<ScheduleMaintenance[]> _scheduleMaintenancesSupplier;

	@Schema
	public String getServiceCategory() {
		if (_serviceCategorySupplier != null) {
			serviceCategory = _serviceCategorySupplier.get();

			_serviceCategorySupplier = null;
		}

		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;

		_serviceCategorySupplier = null;
	}

	@JsonIgnore
	public void setServiceCategory(
		UnsafeSupplier<String, Exception> serviceCategoryUnsafeSupplier) {

		_serviceCategorySupplier = () -> {
			try {
				return serviceCategoryUnsafeSupplier.get();
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
	protected String serviceCategory;

	@JsonIgnore
	private Supplier<String> _serviceCategorySupplier;

	@Schema(description = "Business Service ID")
	public String getServiceId() {
		if (_serviceIdSupplier != null) {
			serviceId = _serviceIdSupplier.get();

			_serviceIdSupplier = null;
		}

		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;

		_serviceIdSupplier = null;
	}

	@JsonIgnore
	public void setServiceId(
		UnsafeSupplier<String, Exception> serviceIdUnsafeSupplier) {

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

	@GraphQLField(description = "Business Service ID")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String serviceId;

	@JsonIgnore
	private Supplier<String> _serviceIdSupplier;

	@Schema
	public String getServiceStatus() {
		if (_serviceStatusSupplier != null) {
			serviceStatus = _serviceStatusSupplier.get();

			_serviceStatusSupplier = null;
		}

		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;

		_serviceStatusSupplier = null;
	}

	@JsonIgnore
	public void setServiceStatus(
		UnsafeSupplier<String, Exception> serviceStatusUnsafeSupplier) {

		_serviceStatusSupplier = () -> {
			try {
				return serviceStatusUnsafeSupplier.get();
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
	protected String serviceStatus;

	@JsonIgnore
	private Supplier<String> _serviceStatusSupplier;

	@Schema
	public String getServiceType() {
		if (_serviceTypeSupplier != null) {
			serviceType = _serviceTypeSupplier.get();

			_serviceTypeSupplier = null;
		}

		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;

		_serviceTypeSupplier = null;
	}

	@JsonIgnore
	public void setServiceType(
		UnsafeSupplier<String, Exception> serviceTypeUnsafeSupplier) {

		_serviceTypeSupplier = () -> {
			try {
				return serviceTypeUnsafeSupplier.get();
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
	protected String serviceType;

	@JsonIgnore
	private Supplier<String> _serviceTypeSupplier;

	@Schema
	public String getSourceLocation() {
		if (_sourceLocationSupplier != null) {
			sourceLocation = _sourceLocationSupplier.get();

			_sourceLocationSupplier = null;
		}

		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;

		_sourceLocationSupplier = null;
	}

	@JsonIgnore
	public void setSourceLocation(
		UnsafeSupplier<String, Exception> sourceLocationUnsafeSupplier) {

		_sourceLocationSupplier = () -> {
			try {
				return sourceLocationUnsafeSupplier.get();
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
	protected String sourceLocation;

	@JsonIgnore
	private Supplier<String> _sourceLocationSupplier;

	@Schema
	@Valid
	public Ticket[] getTickets() {
		if (_ticketsSupplier != null) {
			tickets = _ticketsSupplier.get();

			_ticketsSupplier = null;
		}

		return tickets;
	}

	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;

		_ticketsSupplier = null;
	}

	@JsonIgnore
	public void setTickets(
		UnsafeSupplier<Ticket[], Exception> ticketsUnsafeSupplier) {

		_ticketsSupplier = () -> {
			try {
				return ticketsUnsafeSupplier.get();
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
	protected Ticket[] tickets;

	@JsonIgnore
	private Supplier<Ticket[]> _ticketsSupplier;

	@Schema
	public String getVariantName() {
		if (_variantNameSupplier != null) {
			variantName = _variantNameSupplier.get();

			_variantNameSupplier = null;
		}

		return variantName;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;

		_variantNameSupplier = null;
	}

	@JsonIgnore
	public void setVariantName(
		UnsafeSupplier<String, Exception> variantNameUnsafeSupplier) {

		_variantNameSupplier = () -> {
			try {
				return variantNameUnsafeSupplier.get();
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
	protected String variantName;

	@JsonIgnore
	private Supplier<String> _variantNameSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Service)) {
			return false;
		}

		Service service = (Service)object;

		return Objects.equals(toString(), service.toString());
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

		Date activationDate = getActivationDate();

		if (activationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"activationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(activationDate));

			sb.append("\"");
		}

		String bandwidth = getBandwidth();

		if (bandwidth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bandwidth\": ");

			sb.append("\"");

			sb.append(_escape(bandwidth));

			sb.append("\"");
		}

		String billingFrequency = getBillingFrequency();

		if (billingFrequency != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"billingFrequency\": ");

			sb.append("\"");

			sb.append(_escape(billingFrequency));

			sb.append("\"");
		}

		String contractPeriod = getContractPeriod();

		if (contractPeriod != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contractPeriod\": ");

			sb.append("\"");

			sb.append(_escape(contractPeriod));

			sb.append("\"");
		}

		String contractRenewal = getContractRenewal();

		if (contractRenewal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contractRenewal\": ");

			sb.append("\"");

			sb.append(_escape(contractRenewal));

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

		String destinationLocation = getDestinationLocation();

		if (destinationLocation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"destinationLocation\": ");

			sb.append("\"");

			sb.append(_escape(destinationLocation));

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

		String interfaceType = getInterfaceType();

		if (interfaceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"interfaceType\": ");

			sb.append("\"");

			sb.append(_escape(interfaceType));

			sb.append("\"");
		}

		Date modificationDate = getModificationDate();

		if (modificationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modificationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modificationDate));

			sb.append("\"");
		}

		String paymentTerms = getPaymentTerms();

		if (paymentTerms != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentTerms\": ");

			sb.append("\"");

			sb.append(_escape(paymentTerms));

			sb.append("\"");
		}

		ScheduleMaintenance[] scheduleMaintenances = getScheduleMaintenances();

		if (scheduleMaintenances != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"scheduleMaintenances\": ");

			sb.append("[");

			for (int i = 0; i < scheduleMaintenances.length; i++) {
				sb.append(String.valueOf(scheduleMaintenances[i]));

				if ((i + 1) < scheduleMaintenances.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String serviceCategory = getServiceCategory();

		if (serviceCategory != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceCategory\": ");

			sb.append("\"");

			sb.append(_escape(serviceCategory));

			sb.append("\"");
		}

		String serviceId = getServiceId();

		if (serviceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceId\": ");

			sb.append("\"");

			sb.append(_escape(serviceId));

			sb.append("\"");
		}

		String serviceStatus = getServiceStatus();

		if (serviceStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceStatus\": ");

			sb.append("\"");

			sb.append(_escape(serviceStatus));

			sb.append("\"");
		}

		String serviceType = getServiceType();

		if (serviceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceType\": ");

			sb.append("\"");

			sb.append(_escape(serviceType));

			sb.append("\"");
		}

		String sourceLocation = getSourceLocation();

		if (sourceLocation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sourceLocation\": ");

			sb.append("\"");

			sb.append(_escape(sourceLocation));

			sb.append("\"");
		}

		Ticket[] tickets = getTickets();

		if (tickets != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tickets\": ");

			sb.append("[");

			for (int i = 0; i < tickets.length; i++) {
				sb.append(String.valueOf(tickets[i]));

				if ((i + 1) < tickets.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String variantName = getVariantName();

		if (variantName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"variantName\": ");

			sb.append("\"");

			sb.append(_escape(variantName));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.meetup.common.rest.dto.v1_0_0.Service",
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