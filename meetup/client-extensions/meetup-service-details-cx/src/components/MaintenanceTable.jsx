import React from "react";
import { dateUtil } from "../common/dateUtil";

const MaintenanceTable = ({ maintenances = [] }) => {
  return (
    <div className="mt-4">
      <div className="table-main-body mt-4">
        <h5 className="mb-3">Scheduled Maintenance</h5>
        <div className="table-container">
          <table className="table dataTable" style={{ width: "100%" }}>
            <thead>
              <tr>
                <th>Maintenance ID</th>
                <th>Impact Type</th>
                <th>Description</th>
                <th>Planned Outage</th>
                <th>Actual Outage</th>
                <th>Status</th>
                <th>Urgency</th>
              </tr>
            </thead>
            <tbody>
              {maintenances.length > 0 ? (
                maintenances.map((m) => (
                  <tr key={m.id}>
                    <td>
                      <span className="number">{m.maintenanceID}</span>
                    </td>
                    <td>{m.impactType}</td>
                    <td>{m.description}</td>
                    <td>
                      {dateUtil().formatDateTime(m.plannedMaintenanceStartTime)}
                    </td>
                    <td>
                      {dateUtil().formatDateTime(m.actualStartTime)}
                    </td>
                    <td>
                      <span className="status-active">
                        <img src="assets/icons/checkmark-circle.png" alt="" />
                        {m.maintenanceStatus}
                      </span>
                    </td>
                    <td>{m.urgency}</td>
                  </tr>
                ))
              ) : (
                <tr>
                  <td colSpan={7} className="text-center">
                    No maintenance records
                  </td>
                </tr>
              )}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
};

export default MaintenanceTable;
