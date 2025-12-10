package com.meetup.common.rest.client.dto.v1_0_0;

import com.meetup.common.rest.client.function.UnsafeSupplier;
import com.meetup.common.rest.client.serdes.v1_0_0.ScheduleMaintenanceSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class ScheduleMaintenance implements Cloneable, Serializable {

	public static ScheduleMaintenance toDTO(String json) {
		return ScheduleMaintenanceSerDes.toDTO(json);
	}

	public Date getActualEndTime() {
		return actualEndTime;
	}

	public void setActualEndTime(Date actualEndTime) {
		this.actualEndTime = actualEndTime;
	}

	public void setActualEndTime(
		UnsafeSupplier<Date, Exception> actualEndTimeUnsafeSupplier) {

		try {
			actualEndTime = actualEndTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date actualEndTime;

	public Date getActualStartTime() {
		return actualStartTime;
	}

	public void setActualStartTime(Date actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public void setActualStartTime(
		UnsafeSupplier<Date, Exception> actualStartTimeUnsafeSupplier) {

		try {
			actualStartTime = actualStartTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date actualStartTime;

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

	public String getImpactType() {
		return impactType;
	}

	public void setImpactType(String impactType) {
		this.impactType = impactType;
	}

	public void setImpactType(
		UnsafeSupplier<String, Exception> impactTypeUnsafeSupplier) {

		try {
			impactType = impactTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String impactType;

	public String getMaintenanceID() {
		return maintenanceID;
	}

	public void setMaintenanceID(String maintenanceID) {
		this.maintenanceID = maintenanceID;
	}

	public void setMaintenanceID(
		UnsafeSupplier<String, Exception> maintenanceIDUnsafeSupplier) {

		try {
			maintenanceID = maintenanceIDUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String maintenanceID;

	public String getMaintenanceStatus() {
		return maintenanceStatus;
	}

	public void setMaintenanceStatus(String maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;
	}

	public void setMaintenanceStatus(
		UnsafeSupplier<String, Exception> maintenanceStatusUnsafeSupplier) {

		try {
			maintenanceStatus = maintenanceStatusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String maintenanceStatus;

	public Date getPlannedMaintenanceEndTime() {
		return plannedMaintenanceEndTime;
	}

	public void setPlannedMaintenanceEndTime(Date plannedMaintenanceEndTime) {
		this.plannedMaintenanceEndTime = plannedMaintenanceEndTime;
	}

	public void setPlannedMaintenanceEndTime(
		UnsafeSupplier<Date, Exception>
			plannedMaintenanceEndTimeUnsafeSupplier) {

		try {
			plannedMaintenanceEndTime =
				plannedMaintenanceEndTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date plannedMaintenanceEndTime;

	public Date getPlannedMaintenanceStartTime() {
		return plannedMaintenanceStartTime;
	}

	public void setPlannedMaintenanceStartTime(
		Date plannedMaintenanceStartTime) {

		this.plannedMaintenanceStartTime = plannedMaintenanceStartTime;
	}

	public void setPlannedMaintenanceStartTime(
		UnsafeSupplier<Date, Exception>
			plannedMaintenanceStartTimeUnsafeSupplier) {

		try {
			plannedMaintenanceStartTime =
				plannedMaintenanceStartTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date plannedMaintenanceStartTime;

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public void setServiceId(
		UnsafeSupplier<Long, Exception> serviceIdUnsafeSupplier) {

		try {
			serviceId = serviceIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long serviceId;

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public void setUrgency(
		UnsafeSupplier<String, Exception> urgencyUnsafeSupplier) {

		try {
			urgency = urgencyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String urgency;

	@Override
	public ScheduleMaintenance clone() throws CloneNotSupportedException {
		return (ScheduleMaintenance)super.clone();
	}

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
		return ScheduleMaintenanceSerDes.toJSON(this);
	}

}