import React, { useEffect, useState } from "react";
import TicketsTable from "./TicketsTable";
import MaintenanceTable from "./MaintenanceTable";
import { axiosPrivate } from "../common/axios";
import { dateUtil } from "../common/dateUtil";

const ServiceDetails = () => {
  const [serviceId, setServiceId] = useState(null);
  const [serviceData, setServiceData] = useState(null);

  useEffect(() => {
    const params = new URLSearchParams(window.location.search);
    const id = params.get("serviceId");
    setServiceId(id);

    if (id) {
      axiosPrivate
        .get(`/o/meetup-common-rest/v1.0.0/service-details-by-serviceid?serviceId=${id}`)
        .then((res) => {
          if (res.data && res.data.service) {
            setServiceData(res.data.service);
          }
        })
        .catch((err) => {
          console.error("Error fetching service details:", err);
        });
    }
  }, []);

  if (!serviceData) {
    return <div>Loading service details...</div>;
  }

  return (
    <div className="row mt-2">
      <div className="col-md-12 mb-25 mt-5">
        <div className="card service-detail-card">
          <div className="card-header">
            <div className="orderNumber">
              Service - <span>#{serviceData.serviceID}</span>
              <img src="assets/icons/checkmark-circle-number.png" alt="" />
            </div>
          </div>
          <div className="card-body">
            <div className="row">
              <div className="col-md-12">
                <div className="row">
                  <div className="col-md-12">
                    <div className="rout-detail">
                      <ul>
                        <li className="rout-from">
                          <div className="rout-info">
                            <div className="destination-title source">
                              {serviceData.sourceLocation}
                              <span className="icon">
                                <span className="material-symbols-outlined constl-icon">
                                  distance
                                </span>
                              </span>
                            </div>
                          </div>
                        </li>
                        <li className="rout-to">
                          <div className="rout-info">
                            <div className="destination-title destination">
                              {serviceData.destinationLocation}
                              <span className="icon">
                                <span className="material-symbols-outlined constl-icon">
                                  distance
                                </span>
                              </span>
                            </div>
                          </div>
                        </li>
                      </ul>
                    </div>
                  </div>

                  <div className="col-md-12">
                    <div className="row">
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Variant Name</div>
                          <div className="value">{serviceData.variantName}</div>
                        </div>
                      </div>
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Service Category</div>
                          <div className="value">{serviceData.serviceCategory}</div>
                        </div>
                      </div>
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Service Type</div>
                          <div className="value">{serviceData.serviceType}</div>
                        </div>
                      </div>
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Interface</div>
                          <div className="value">{serviceData.interface}</div>
                        </div>
                      </div>
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Bandwidth</div>
                          <div className="value">{serviceData.bandwidth}</div>
                        </div>
                      </div>
                      <div className="col-md-4 col-sm-6 col-xs-12 mb-30">
                        <div className="form-group-view">
                          <div className="title">Status</div>
                          <div className="value">
                            <span className="status-active">{serviceData.serviceStatus}</span>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div className="col-md-12">
                    <div className="status-rout-time">
                      <div className="row-cols">
                        <div className="status-time-row">
                          <div className="title">Contract Period</div>
                          <div className="value">{serviceData.contractPeriod}</div>
                        </div>
                      </div>
                      <div className="row-cols">
                        <div className="status-time-row">
                          <div className="title">Contract Renewal</div>
                          <div className="value">{serviceData.contractRenewal}</div>
                        </div>
                      </div>
                      <div className="row-cols">
                        <div className="status-time-row">
                          <div className="title">Activation Date</div>
                          <div className="value">
                              {dateUtil().formatDateTime(serviceData.activationDate)}
                            </div>
                        </div>
                      </div>
                      <div className="row-cols">
                        <div className="status-time-row">
                          <div className="title">Modification Date</div>
                          <div className="value">
                              {dateUtil().formatDateTime(serviceData.modificationDate)}
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="col-md-12">
        <TicketsTable tickets={serviceData.tickets} />
      </div>
      <div className="col-md-12">
        <MaintenanceTable maintenances={serviceData.scheduleMaintenances} />
      </div>
    </div>
  );
};

export default ServiceDetails;
