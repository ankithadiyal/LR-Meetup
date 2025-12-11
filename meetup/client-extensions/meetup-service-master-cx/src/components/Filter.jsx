import React from "react";
const FilterSidebar = ({
  sidebarOpen,
  toggleSidebar,
  categoryList,
  statusList,
  selectedCategory,
  setSelectedCategory,
  selectedStatuses,
  setSelectedStatuses,
  applyFilters
}) => {
  return (
    <div id="mySidebar" className={`sidebar ${sidebarOpen ? "show" : ""}`}>
      <a className="closebtn" onClick={toggleSidebar}>
        <span className="material-symbols-outlined constl-icon">close</span>
      </a>

      <div className="sidebar-wrapper">
        <div className="sidebar-header">
          <h5>Filter & Sort Options</h5>
        </div>

        <div className="sidebar-content">
            <div className="sidebar-filter-reset">
                <div className="title">Filters</div>
                      <a
                          href="javascript:void(0)"
                          onClick={() => {
                              setSelectedCategory("");
                              setSelectedStatuses([]);

                              applyFilters(true); 

                              toggleSidebar();
                          }}
                      >
                          Clear all
                      </a>


            </div>
          <div className="input-group-header">
            <div>Select</div>
            <span className="material-symbols-outlined constl-icon">expand_more</span>
          </div>

          <div className="row">
            <div className="col-12 mb-15">
              <div className="form-group">
                <select
                  className="custom-select"
                  id="ServiceCategory"
                  value={selectedCategory}
                  onChange={(e) => setSelectedCategory(e.target.value)}
                >
                  <option value="" disabled>Select Service Category</option>
                  {categoryList.map((cat) => (
                    <option key={cat} value={cat}>{cat}</option>
                  ))}
                </select>
              </div>
            </div>
          </div>

          <div className="input-group-header mt-2">
            <div>Status</div>
            <span className="material-symbols-outlined constl-icon">expand_more</span>
          </div>

          <div className="row">
            {statusList.map((status) => (
              <div key={status} className="col-6 mb-15">
                <div className="form-group custom-checkbox">
                  <input
                    type="checkbox"
                    className="custom-control-input"
                    id={status}
                    checked={selectedStatuses.includes(status)}
                    onChange={(e) => {
                      if (e.target.checked) {
                        setSelectedStatuses([...selectedStatuses, status]);
                      } else {
                        setSelectedStatuses(selectedStatuses.filter(s => s !== status));
                      }
                    }}
                  />
                  <label className="custom-control-label" htmlFor={status}>{status}</label>
                </div>
              </div>
            ))}
          </div>
        </div>

        <div className="sidebar-footer">
          <div className="text-right">
            <button
              className="button button-icon-text"
              onClick={() => {
                applyFilters();
                toggleSidebar();
              }}
            >
              <span className="material-symbols-outlined constl-icon">check_circle</span>
              Apply
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default FilterSidebar;
