import React, { useEffect, useState } from "react";
import { axiosPrivate } from "../../../meetup-service-details-cx/src/common/axios";

const ServicesList = ({ onServiceSelect }) => {

  const [serviceListConfig, setServiceListConfig] = useState({});
  const [serviceList, setServiceList] = useState([]);

  useEffect(() => {
    Liferay.on("allPortletsReady", function () {
      let mainContent = document.getElementsByTagName(
        "meetup-service-master-cx"
      );

      if (mainContent && mainContent.length > 0) {
        let serviceListDataConfigEnc =
          mainContent[0].getAttribute("data-serviceList");

        let serviceListDataConfigStr = atob(serviceListDataConfigEnc);
        setServiceListConfig(JSON.parse(serviceListDataConfigStr));
        console.debug("serviceListDataConfigStr::", serviceListDataConfigStr);
      }
    });
  }, []);


  useEffect(() => {
    if (!serviceListConfig.restBuilderApiURL) return;

    fetchServiceList();
  }, [serviceListConfig]);

  const fetchServiceList = async () => {
    const restBuilderApiURL = serviceListConfig.restBuilderApiURL;

    const userId = Liferay.ThemeDisplay.getUserId();
    const siteId = Liferay.ThemeDisplay.getSiteGroupId();

    const propsDataEnc = btoa(
      JSON.stringify(serviceListConfig.propsData)
    );

    const constructedUrl = `${restBuilderApiURL}?propsData=${propsDataEnc}&userId=${userId}&siteId=${siteId}`;

    const response = await axiosPrivate.get(constructedUrl);

    setServiceList(response.data);
    console.log("serviceList::", response.data)
  };



  const handleServiceClick = (serviceId) => {
    window.location.href = `/web/demo/service-details?serviceId=${serviceId}`;
  };

  return (
    
    <div className="table-main-body">
       <div class="searchbar">
        <input
          type="text"
          id="searchBox"
          placeholder="Search here..."
          value={searchQuery}
          onChange={(e) => onSearch(e)}
        />
      </div>
      <div className="table-container">
        <table
          id="example"
          className="table dataTable"
          style={{ width: "100%" }}
        >
          <thead>
            <tr>
              <th>Service ID</th>
              <th>Status</th>
              <th>Variant Name</th>
              <th>Service Category</th>
              <th>A-End Site</th>
              <th>Z-End Site</th>
              <th>Bandwidth</th>
              <th>Contract Period</th>
            </tr>
          </thead>

          <tbody>
            {serviceList?.items?.map((service) => (
              <tr key={service.id}>
                <td>
                  <span
                    className="number"
                    style={{ cursor: "pointer", textDecoration: "underline" }}
                    onClick={() => handleServiceClick(service.id)}
                  >
                    {service.id}
                  </span>
                </td>

                <td>
                  <span className="status-active">
                    <img src="assets/icons/checkmark-circle.png" alt="" />
                    {service.serviceStatus}
                  </span>
                </td>

                <td>{service.variantName}</td>
                <td>{service.serviceCategory}</td>
                <td>{service.sourceLocation}</td>
                <td>{service.destinationLocation}</td>
                <td>{service.bandwidth}</td>
                <td>{service.contractPeriod}</td>
              </tr>
            ))}
          </tbody>


        </table>
      </div>
    </div>
  );
};

export default ServicesList;
