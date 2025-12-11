import React, { useEffect, useState } from "react";
import { axiosPrivate } from "../../../meetup-service-details-cx/src/common/axios";
import FilterSidebar from "./Filter";
 
const ServicesList = ({ onServiceSelect }) => {

  const [serviceListConfig, setServiceListConfig] = useState({});
  const [serviceList, setServiceList] = useState([]);
  const [searchQuery, setSearchQuery] = useState("");
  const [sidebarOpen, setSidebarOpen] = useState(false);
  const [statusList, setStatusList] = useState([]);
  const [categoryList, setCategoryList] = useState([]);
  const [selectedCategory, setSelectedCategory] = useState("");
  const [selectedStatuses, setSelectedStatuses] = useState([]);

 

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

 const applyFilters = (clearAll = false) => {
    if (clearAll) {
        setSelectedCategory("");
        setSelectedStatuses([]);
    }
    fetchServiceList(searchQuery, clearAll);
};

  useEffect(() => {
    if (
      !serviceListConfig ||
      !serviceListConfig.restBuilderApiURL ||
      !serviceListConfig.propsData
    ) {
      return;
    }

    fetchServiceList("");
  }, [serviceListConfig]);

  const fetchServiceList = async (searchValue = "", clearAll = false) => {
    const restBuilderApiURL = serviceListConfig.restBuilderApiURL;
    const userId = Liferay.ThemeDisplay.getUserId();
    const siteId = Liferay.ThemeDisplay.getSiteGroupId();

    let updatedPropsData = { ...serviceListConfig.propsData };

    if (searchValue) {
      const formattedSearchValue = `'${searchValue}'`;
      updatedPropsData.screenFilters =
        serviceListConfig.propsData.screenFilters.map(filter => ({
          ...filter,
          fields: filter.fields.map(field => ({
            ...field,
            value: formattedSearchValue
          }))
        }));
    } else {
      delete updatedPropsData.screenFilters;
    }

    if (!clearAll) {
      const filters = [];
      if (selectedCategory) {
        filters.push({
          key: "serviceCategory",
          value: `'${selectedCategory}'`,
          operator: "eq"
        });
      }
      if (selectedStatuses.length > 0) {
        selectedStatuses.forEach(status => {
          filters.push({
            key: "serviceStatus",
            value: `'${status}'`,
            operator: "eq"
          });
        });
      }

      if (filters.length > 0) {
        updatedPropsData.filters = [
          {
            logicalOperator: "and",
            fields: filters
          }
        ];
      } else {
        delete updatedPropsData.filters;
      }
    } else {
      delete updatedPropsData.filters;
    }

    const propsDataEnc = btoa(JSON.stringify(updatedPropsData));
    const constructedUrl = `${restBuilderApiURL}?propsData=${propsDataEnc}&userId=${userId}&siteId=${siteId}`;

    const response = await axiosPrivate.get(constructedUrl);
    setServiceList(response.data);

    if (!statusList.length) {
      const uniqueStatuses = [
        ...new Set(response.data?.items?.map(item => item.serviceStatus))
      ];
      setStatusList(uniqueStatuses);
    }

    if (!categoryList.length) {
      const uniqueCategories = [
        ...new Set(response.data?.items?.map(item => item.serviceCategory).filter(Boolean))
      ];
      setCategoryList(uniqueCategories);
    }
  };

  const toggleSidebar = () => {
    console.log("Sidebar toggled");  
    setSidebarOpen(!sidebarOpen);
  };

  useEffect(() => {
    if (searchQuery === undefined) return;

    const delayDebounce = setTimeout(() => {
      fetchServiceList(searchQuery);
    }, 500); 

    return () => clearTimeout(delayDebounce);
  }, [searchQuery]);


  const handleServiceClick = (serviceId) => {
    window.location.href = `/web/demo/service-details?serviceId=${serviceId}`;
  };

  return (
    
    
    <div className="table-main-body mt-5">
      
      <div className="service-list-table-header table-header d-flex mt-5">
        <span className="font-weight-bold">Services</span>
      <div className="left-controls"></div>
      <div className="right-controls">
       <div class="searchbar">
        <input
          type="text"
          id="searchBox"
          placeholder="Search here..."
          value={searchQuery}
          onChange={(e) => setSearchQuery(e.target.value)}
        />
      </div>

      <div className="action-controls">
        <div className="filterIcon">
          <span className="material-symbols-outlined constl-icon" onClick={toggleSidebar}>
            filter_alt
          </span>
        </div>
      </div>
      </div>
       

      </div>
      <FilterSidebar
        sidebarOpen={sidebarOpen}
        toggleSidebar={toggleSidebar}
        categoryList={categoryList}
        statusList={statusList}
        selectedCategory={selectedCategory}
        setSelectedCategory={setSelectedCategory}
        selectedStatuses={selectedStatuses}
        setSelectedStatuses={setSelectedStatuses}
        applyFilters={applyFilters}
      />

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
