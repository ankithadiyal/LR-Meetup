import React from "react";
import { dateUtil } from "../common/dateUtil";

const TicketsTable = ({ tickets = [] }) => {
  return (
    <div className="mt-5">
      <div className="table-main-body mt-4">
        <h5 className="mb-3">Tickets</h5>
        <div className="table-container">
          <table className="table dataTable" style={{ width: "100%" }}>
            <thead>
              <tr>
                <th>Ticket ID</th>
                <th>Subject</th>
                <th>Status</th>
                <th>Date</th>
                <th>Description</th>
              </tr>
            </thead>
            <tbody>
              {tickets.length > 0 ? (
                tickets.map((ticket) => (
                  <tr key={ticket.id}>
                    <td>
                      <span className="number">{ticket.ticketID}</span>
                    </td>
                    <td>{ticket.subject}</td>
                    <td>
                      <span className="status-active">
                        <img src="assets/icons/checkmark-circle.png" alt="" />
                        {ticket.ticketStatus}
                      </span>
                    </td>
                    <td>
                        {dateUtil().formatDateTime(ticket.date)}
                    </td>
                    <td>{ticket.description}</td>
                  </tr>
                ))
              ) : (
                <tr>
                  <td colSpan={5} className="text-center">
                    No tickets available
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

export default TicketsTable;
