package com.meetup.common.rest.client.dto.v1_0_0;

import com.meetup.common.rest.client.function.UnsafeSupplier;
import com.meetup.common.rest.client.serdes.v1_0_0.ServiceSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class Service implements Cloneable, Serializable {

	public static Service toDTO(String json) {
		return ServiceSerDes.toDTO(json);
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public void setActivationDate(
		UnsafeSupplier<Date, Exception> activationDateUnsafeSupplier) {

		try {
			activationDate = activationDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date activationDate;

	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public void setBandwidth(
		UnsafeSupplier<String, Exception> bandwidthUnsafeSupplier) {

		try {
			bandwidth = bandwidthUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String bandwidth;

	public String getBillingFrequency() {
		return billingFrequency;
	}

	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	public void setBillingFrequency(
		UnsafeSupplier<String, Exception> billingFrequencyUnsafeSupplier) {

		try {
			billingFrequency = billingFrequencyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String billingFrequency;

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public void setContractPeriod(
		UnsafeSupplier<String, Exception> contractPeriodUnsafeSupplier) {

		try {
			contractPeriod = contractPeriodUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String contractPeriod;

	public String getContractRenewal() {
		return contractRenewal;
	}

	public void setContractRenewal(String contractRenewal) {
		this.contractRenewal = contractRenewal;
	}

	public void setContractRenewal(
		UnsafeSupplier<String, Exception> contractRenewalUnsafeSupplier) {

		try {
			contractRenewal = contractRenewalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String contractRenewal;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public void setDestinationLocation(
		UnsafeSupplier<String, Exception> destinationLocationUnsafeSupplier) {

		try {
			destinationLocation = destinationLocationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String destinationLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getInterfaceType() {
		return interfaceType;
	}

	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	public void setInterfaceType(
		UnsafeSupplier<String, Exception> interfaceTypeUnsafeSupplier) {

		try {
			interfaceType = interfaceTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String interfaceType;

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public void setModificationDate(
		UnsafeSupplier<Date, Exception> modificationDateUnsafeSupplier) {

		try {
			modificationDate = modificationDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date modificationDate;

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public void setPaymentTerms(
		UnsafeSupplier<String, Exception> paymentTermsUnsafeSupplier) {

		try {
			paymentTerms = paymentTermsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String paymentTerms;

	public ScheduleMaintenance[] getScheduleMaintenances() {
		return scheduleMaintenances;
	}

	public void setScheduleMaintenances(
		ScheduleMaintenance[] scheduleMaintenances) {

		this.scheduleMaintenances = scheduleMaintenances;
	}

	public void setScheduleMaintenances(
		UnsafeSupplier<ScheduleMaintenance[], Exception>
			scheduleMaintenancesUnsafeSupplier) {

		try {
			scheduleMaintenances = scheduleMaintenancesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ScheduleMaintenance[] scheduleMaintenances;

	public String getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public void setServiceCategory(
		UnsafeSupplier<String, Exception> serviceCategoryUnsafeSupplier) {

		try {
			serviceCategory = serviceCategoryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serviceCategory;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public void setServiceId(
		UnsafeSupplier<String, Exception> serviceIdUnsafeSupplier) {

		try {
			serviceId = serviceIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serviceId;

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public void setServiceStatus(
		UnsafeSupplier<String, Exception> serviceStatusUnsafeSupplier) {

		try {
			serviceStatus = serviceStatusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serviceStatus;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void setServiceType(
		UnsafeSupplier<String, Exception> serviceTypeUnsafeSupplier) {

		try {
			serviceType = serviceTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serviceType;

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public void setSourceLocation(
		UnsafeSupplier<String, Exception> sourceLocationUnsafeSupplier) {

		try {
			sourceLocation = sourceLocationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String sourceLocation;

	public Ticket[] getTickets() {
		return tickets;
	}

	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;
	}

	public void setTickets(
		UnsafeSupplier<Ticket[], Exception> ticketsUnsafeSupplier) {

		try {
			tickets = ticketsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Ticket[] tickets;

	public String getVariantName() {
		return variantName;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}

	public void setVariantName(
		UnsafeSupplier<String, Exception> variantNameUnsafeSupplier) {

		try {
			variantName = variantNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String variantName;

	@Override
	public Service clone() throws CloneNotSupportedException {
		return (Service)super.clone();
	}

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
		return ServiceSerDes.toJSON(this);
	}

}