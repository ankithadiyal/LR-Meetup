import React, { useState, useEffect } from "react";


const ErrorModal = ({ modalId, modalBody,handleCloseModal,openModal}) => {
    return openModal && <div class="modal theme-modal d-block" id={modalId}>
        <div class="modal-dialog modal-md modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <button
                        type="button"
                        class="close"
                        data-dismiss="modal"
                        onClick={handleCloseModal}
                    >
                        <span className="material-symbols-outlined constl-icon">
close
</span>
                    </button>
                </div>

                <div class="modal-body">
                    <div class="row">
                        <div class="col-12 mb-4">
                            <div class="confirmation-detail">
                                <p class="description">{modalBody}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
}

export default ErrorModal;