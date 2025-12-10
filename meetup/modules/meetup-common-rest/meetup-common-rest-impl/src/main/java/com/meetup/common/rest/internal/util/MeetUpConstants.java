package com.meetup.common.rest.internal.util;

 

import com.liferay.portal.kernel.util.PropsUtil;

public final class MeetUpConstants {

    private MeetUpConstants() {
        // Prevent instantiation
    }
    public static final String CREDIT_NOTES_RELATIONSHIP_INVOICE_ID = "r_creditNotesInvoiceNo_c_cstlinvoicesId";
    public static final String R_PARTYINFOINVOICEID_C_CSTLINVOICESID = "r_partyInfoInvoiceId_c_cstlinvoicesId";
    public static final String R_TAXSUMMARYINVOICEID_C_CSTLINVOICESID = "r_taxSummaryInvoiceId_c_cstlinvoicesId";
    public static final String R_INVOICECREDITNOTEID_C_CSTLCREDITNOTES = "r_invoiceCreditNoteId_c_cstlcreditnotes";
    public static final String R_COUNTRYMASTERID_C_COUNTRYMASTER = "r_countryMasterId_c_cstlcountrymaster";
    public static final String COUNTRY = "country";
    
    public static final String EMPLOYEE_NAME = "employeeName";
    public static final String ESCALATION_LEVEL_CONTACT_ID = "r_escalationLevelContactId_c_cstlcontacts";
    public static final String EMPLOYEE_ID = "employeeId";
    public static final String DESK_CONTACT = "deskContact";
    public static final String IS_DISPLAY = "isDisplay";

    
    public static final String R_USERSTATUSID_C_CSTLSTATUSMASTERID = "r_userStatusId_c_cstlstatusmasterId";
    public static final String R_PORTALUSERID_USERID = "r_portalUserId_userId";
    public static final String R_PORTALUSERID_USER = "r_portalUserId_user";
    
    public static final String FILTERS_LOGICAL_OPERATOR = "filtersLogicalOperator";
    public static final String SCREEN_FILTERS_LOGICAL_OPERATOR = "screenFiltersLogicalOperator";
    public static final String R_PAYMENTINVOICENO_C_CSTLINVOICESID = "r_paymentInvoiceNo_c_cstlinvoicesId";
    public static final String R_ESCALATIONMATRIXSEGMENTID_C_CSTLESCALATIONSEGMENTSID = "r_escalationMatrixSegmentId_c_cstlescalationsegmentsId";
    public static final String R_ESCALATIONLEVELEMPLOYEEUSERID_USERID = "r_escalationLevelEmployeeUserId_userId";
    public static final String R_ESCALATIONLEVELDURATIONID_C_CSTLESCALATIONDURATIONMASTERID = "r_escalationLevelDurationId_c_cstlescalationdurationmasterId";
    public static final String R_ESCALATIONMATRIXID_C_CSTLESCALATIONMATRIXID = "r_escalationMatrixId_c_cstlescalationmatrixId";
    public static final String R_ESCALATIONLEVELCONTACTID_C_CSTLCONTACTSID = "r_escalationLevelContactId_c_cstlcontactsId";
    public static final String R_ESCALATION_LEVEL_EMPLOYEE_USER = "r_escalationLevelEmployeeUserId_user";
    public static final String PRODUCT = "product";
    public static final String PRODUCT_NAME = "productName";
    public static final String SERVICE_IDS = "serviceIds";
    public static final String CUSTOMER_ACCOUNT_NOS = "customerAccountNos";
    public static final String R_EMCUSTOMERCATEGORY_C_CUSTOMERCATEGORYMASTERID = "r_emCustomerCategory_c_cstlcustomercategorymasterId";
    public static final String ESCALATION_MATRIX_ID = "escalationMatrixId";
    public static final String ESCALATION_MATRIX_SEGMENT_ID = "escalationMatrixSegmentId";
    public static final String LEVEL_ID = "levelId";
    public static final String ESCALATION_LEVELS = "escalationLevels";
    public static final String ESCALATION_NAME = "escalationName";
    
    public static final String USER_GROUP_ID = "userGroupId";
    public static final String USER_GROUP_IDS = "userGroupIds";
    public static final String ROLE_ID = "roleId";
    public static final String FULL_NAME = "fullName";
    public static final String USER_ID = "userId";
    public static final String USER_SITE_URL = "userSiteUrl";
    public static final String CUSTOM_FIELDS = "customFields";

    public static final String CAPTCHA_ERROR = "captcha-error";
    public static final String CONTENT = "content";
    public static final String STATE = "state";
    public static final String USER_NAME = "userName";
    public static final String STATUS = "status";
    public static final String RESPONSE = "response";
    public static final String LIFERAY_LOGIN_PORTLET = "com_liferay_login_web_portlet_LoginPortlet";
    public static final String SITE_GUEST = "Guest";
    public static final String PRIVATE_FRIENDLY_URL_PATH = "/group";
    public static final String PUBLIC_FRIENDLY_URL_PATH = "/web";
    public static final String INTERNAL_FRIENDLY_URL_PATH = "/internal";
    public static final String ADMINISTRATOR = "Administrator";

    public static final String KRYPTON_ADMIN_EMAIL_FROM_NAME = PropsUtil.get("krypton.admin.email.from.name");
    public static final String KRYPTON_ADMIN_EMAIL_FROM_ADDRESS = PropsUtil.get("krypton.admin.email.from.address");
    
    public static final String START_DATE_TIME = "startDateTime";
    public static final String END_DATE_TIME = "endDateTime";
    public static final String R_STATUSID_C_CSTLSTATUSMASTERID = "r_statusId_c_cstlstatusmasterId";
    
    //File name
    public static final String CUSTOMER_ONBOARD_DEFAULT_FILE_NAME = "Customers";

    public static final String YES = "Yes";
    public static final String NO = "No";
    public static final String WEB = "Web";
    public static final String API = "API";
    public static final String URL = "url";
    public static final String ITEMS = "items";

    public static final String OK_MESSAGE = "The request has succeeded.";
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = 
        "Server encountered an unexpected condition that prevented it for executing a request.";
    public static final String BAD_REQUEST_ERROR_MESSAGE = 
        "Invalid data entered in system. Please correct the data and try again.";

    public static final String BEARER = "Bearer ";
    public static final String ACCEPT = "Accept";
    public static final String AUTHORIZATION = "Authorization";
    public static final String CORRELATION_ID = "CorrelationId";
    public static final String FROM_DATE_FORMAT = "dd-MMM-yyyy hh:mm a";
    
    public static final String RESTRICTED_FIELDS = "restrictedFields";
    public static final String AGGREGRATION_TERMS = "aggregationTerms";
    public static final String FILTERS = "filters";
    public static final String FILTER = "filter";
    public static final String SORT = "sort";
    public static final String PAGE = "page";
    public static final String PAGE_SIZE = "pageSize";
    public static final String SEARCH = "search";
    public static final String FIELDS = "fields";
    public static final String LAST_PAGE = "lastPage";
    public static final String TOTAL_COUNT = "totalCount";
    
    // General messages
    public static final String HAS_PERMISSION_FOR_ACTION = " has permission for action: ";
    public static final String NO_ITEMS_FOUND = "No items found in the response.";
    public static final String ERROR_CREATING_THEME_DISPLAY = "Error creating ThemeDisplay manually";
    public static final String ERROR_PARSING_JSON = "Error parsing JSON: ";
    public static final String ERROR_FETCHING_ENTITY_RESPONSE = "Error while fetching entity response : ";

    // HTTP and API
    public static final String AMPERSAND = "&";
    public static final String QUESTION = "?";
    public static final String EQUAL = "=";
    public static final String FILTER_PARAM = "filter";
    public static final String FIELDS_PARAM = "fields";
    public static final String PAGE_SIZE_PARAM = "pageSize";
    public static final String PAGE_PARAM = "page";
    public static final String SEARCH_PARAM = "search";
    public static final String SORT_PARAM = "sort";
    public static final String NESTED_FIELDS_PARAM = "nestedFields";
    public static final String NESTED_FIELDS_DEPTH = "nestedFieldsDepth";
    public static final String FLATTEN = "flatten";
    public static final String RESTRICT_FIELDS_PARAM = "restrictFields";
    public static final String AGGREGATION_TERMS_PARAM = "aggregationTerms";
    public static final String VALUE = "value";
    public static final String OPERATOR = "operator";
    public static final String KEY = "key";
    public static final String DATE_CREATED = "dateCreated";
    public static final String ORDER = "order";
    public static final String LOGICAL_OPERATOR = "logicalOperator";
    public static final String SCREEN_FILTERS = "screenFilters";
    
    public static final String FILTER_EQUALS = " eq ";
    public static final String FILTER_EQUALS_STRING = " eq '";
    public static final String AND = "and";
    public static final String EQ = "eq";

    public static final String PARENTHESIS_OPEN = "(";
    public static final String PARENTHESIS_CLOSE = ")";
    public static final String QUOTE = "'";
    public static final String SPACE = " ";
    public static final String SLASH = "/";
    public static final String PLUS = "+";
    public static final String PERCENT_20 = "%20";

    // Common values
    public static final String TIMEZONE_ASIA_KOLKATA = "Asia/Kolkata";
    public static final String STATUS_CODE_200 = "200";
    public static final String STATUS_CODE_500 = "500";

    // Portlet names
    public static final String CX_ACCOUNT_MANAGEMENT = "CX Account Management";
    public static final String CX_USER_MANAGEMENT = "CX User Management";
    public static final String CX_MASTER = "CX Master";
    public static final String CX_MY_PROFILE = "CX My Profile";
    public static final String CX_SERVICES = "CX Services";
    public static final String CX_SERVICE_PERFORMANCE = "CX Service Performance";
    public static final String CX_SUPPORT = "CX Support";
    public static final String CX_ALL_MODULES = "CX All Modules";
    public static final String CX_INVOICES = "CX Invoices";
    public static final String CX_PORTAL_NOTIFICATION = "CX Portal Notification";
    public static final String CX_OAUTH2_TOKEN_GENERATION = "CX OAuth 2 Token Generation";
    public static final String CX_KRYPTON_PERMISSION = "CX Krypton Permission";
	public static final String KEY_USER_MANAGEMENT = "User Management";

    // Role
    public static final String ROLE_ADMINISTRATOR = "Administrator";

    // JSON field keys
    public static final String ACTION = "action";
    public static final String ACTIONS = "actions";
    public static final String IP_ADDRESS = "ipAddress";
    public static final String IS_ACTIVE ="isActive";
    public static final String IS_ARCHIVED = "isArchived";
    public static final String SYNC_TYPE = "syncType";
    public static final String SYNC_REFERENCE = "syncReference";
    public static final String IS_DELETED = "isDeleted";
    public static final String NW_COUNTS = "nwCounts";
    public static final String EXTRA_FIELD = "extraField";
    public static final String START_TIME = "startTime";
    public static final String END_TIME = "endTime";
    public static final String IS_2FA_ENABLED = "is2FAEnabled";
    public static final String CREATED_BY = "createdBy";
    public static final String REAL_USER_ID = "realUserId";
    public static final String EXTERNAL_SOURCE = "externalSource";
    public static final String CUSTOMER_ACCOUNT_NO = "customerAccountNo";
    public static final String DOCUMENTS = "documents";
    public static final String PARENT_CUSTOMER_ACCOUNT_NO = "parentCustomerAccountNo";
    public static final String PARENT_ID = "parentId";
    public static final String ADDRESS_ID = "addressId";
    public static final String FIELD_NAME = "fieldName";
    public static final String FREQUENCYPERIOD = "frequencyPeriod";
    public static final String REPORTS_FREQUENCY_TYPE_MASTER_RELATIONSHIP_FIELD_NAME = "r_frequencyTypeId_c_cstlfrequencytypemasterId";
    public static final String REPORTTYPE = "reportType";
    public static final String REPORTSID = "reportsId";
    public static final String CALENDARBOOKINGID = "calendarBookingId";
    public static final String CREATED_DATE = "createdDate";

    public static final String EXTERNAL_REFERENCE_ID = "externalReferenceId";
    public static final String EXTERNAL_REF_ENTITY_ID = "externalRefEntityId";
    public static final String MODIFIED_BY = "modifiedBy";
    public static final String PORTAL_COMPANY_ID = "portalCompanyId";
    public static final String PORTAL_SITE_ID = "portalSiteId";
    public static final String PORTAL_USER_ID = "portalUserId";
    public static final String PRIMARY_USER_ID = "primaryUserId";
    public static final String PORTAL_ORG_ID = "portalOrgId";
    public static final String PORTAL_ORG_SITE_ID = "portalOrgSiteId";
	public static final String API_USER_ID = "apiUserId";
    public static final String CUSTOMER_ID = "customerId";
    public static final String CUSTOMER_ENTITY_TYPE_ID = "customerEntityTypeId";
    public static final String CUSTOMER_NAME = "customerName";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String SCREEN_NAME = "screenName";
    public static final String EMAIL_ADDRESS = "emailAddress";
    public static final String EMAIL_ID = "emailId";
    public static final String MOBILE_NO = "mobileNo";
    public static final String COMPANY_EMAIL = "companyEmail";
    public static final String DEPARTMENT = "department";
    public static final String CUSTOMERFACINGROLE = "customerFacingRole";
    public static final String USER_TYPE = "userType";
    public static final String IS_ONBOARDED = "isOnboarded";
    public static final String IS_PARENT = "isParent";
    public static final String PORTAL_ACCOUNT_ADMIN_NAME = "portalAccountAdminName";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String SUCCESS_MESSAGE_KEY = "successMessage";
    public static final String SECURE_ACCESS_CODE = "secureAccessCode";
    public static final String TICKET_KEY = "ticketKey";
    public static final String FAILED_ATTEMPT_COUNT = "failedAttemptCount";
    public static final String EMPLOYEE_LR_USERID = "employeeLRUserId";
    public static final String CUSTOMER_LR_USERID = "customerLRUserId";
    public static final String REASON = "reason";
    
    public static final String NA_VALUE = "N/A";
    public static final String ERROR = "error";
    public static final String MESSAGE = "message";
    public static final String DESCRIPTION = "description";
    public static final String NAME = "name";
    public static final String ID = "id";
    public static final String ENTITY_ID = "entityId";
    public static final String MODULE = "module";
    public static final String PERFORMED_BY_USER_ID = "performedByUserId";
    public static final String PERFORMED_BY_USER_DETAILS = "performedByUserDetails";
    public static final String SESSION_ID = "sessionId";
    public static final String STATUS_VAL = "statusVal";
    public static final String STATUS_CODE = "statusCode";
    public static final String TYPE = "type";
    public static final String ORDER_ID = "orderId";
    public static final String OTS_LINK_ID = "otsLinkId";
    public static final String GIS_DEVICE_TYPE_ATTR_INTERNAL_NW_RELATIONSHIP_FILED_NAME = "r_gISDeviceTypeAttrInternalNWID_c_cstlgisinternalnwId";
    public static final String IS_INTERNAL_NW_URL = "isInternalNwURL";
    public static final String BUILDING_NAME = "buildingName";
    public static final String DEVICE_TYPE_IMAGE_URL = "deviceTypeImageUrl";
    public static final String SITE_CODE = "sitecode";
    public static final String BUILDING_NAME_KEY = "buildingname";
    public static final String SERVICE_STATUS = "serviceStatus";
    public static final String GEOMETRY = "geometry";
    public static final String COMPETITOR = "competitor";
    public static final String EMPLOYEE_USER_IDS = "employeeUserIds";
    public static final String KMZ_NAME = "kmzName";
    public static final String FEATURES = "features";
    public static final String A_END_NE = "aEndNE";
    public static final String GEOMETRY_TYPE = "geometryType";
    public static final String IS_DUPLICATE = "isDuplicate";
    public static final String GEOMETRY_CORDINATES = "geometryCoordinates";
    public static final String GEOMETRY_TYPE_POINT = "Point";
    public static final String GEOMETRY_TYPE_KEY = "type";
    public static final String GEOMETRY_CORDINATES_KEY = "coordinates";
    public static final String CABLE_ID ="cable_id";
    public static final String NETWORK_ID ="network_id";
    public static final String GIS_ENTITY_TYPE = "entity_type";
    public static final String PROPERTIES = "properties";
    public static final String DEVICE_TYPE_ENTITY_ID = "deviceTypeEntityID";
    public static final String ATTR_NAME = "attrName";
    public static final String ATTR_VALUE = "attrValue";
    public static final String DEVICE_TYPE_ID = "deviceTypeId";
    public static final String DEVICE_TYPE_OBJECT_ID = "deviceTypeObjectId";
    public static final String PROJECT_CODE_ID = "projectCodeID";
    public static final String DEVICE_TYPE = "deviceType";
    public static final String PROJECT_CODE = "projectCode";
    public static final String Z_END_NE = "zEndNE";
    public static final String A_END_PORT = "aEndPort";
    public static final String Z_END_PORT = "zEndPort";
    public static final String OTS_LINK_TYPE = "otsLinkType";
    public static final String PATH_TYPE = "pathType";
    public static final String DIRECTION = "direction";
    public static final String SERVICE_ID = "serviceId";
    public static final String TICKETS = "tickets";
    public static final String TOTAL_OPEN_TICKETS = "totalOpenTickets";
    public static final String TICKET_TYPE = "ticketType";
    public static final String ETR = "etr";
    public static final String TTR = "ttr";
    public static final String DATA = "data";
    
    
    public static final String API_RESPONSE = "apiResponse";
    public static final String ERROR_PARAM = "Error";
    public static final String REQUEST_URL = "Request URL";
    public static final String GRANT_TYPE_CLIENT_CREDENTIALS = "grant_type=client_credentials";
	public static final String ACCESS_TOKEN = "access_token";
	public static final String UTF_8 = "UTF-8";
    public static final String KEY_PAYMENT_ID = "PAYMENT_ID_";
    public static final String KEY_MODE_OF_PAYMENT = "MODE_OF_PAYMENT_";
    public static final String KEY_PAYMENT_DATE = "PAYMENT_DATE_";
	
    // Wrapper API constants
    public static final String FIELD = "field";
    public static final String IS_EMPTY = "isEmpty";
    public static final String EMPTY = "Empty";
    public static final String HEALTH = "health";
    public static final String HEALTH_PERCENT_100 = "100%";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String NO_CACHE = "no-cache";
    public static final String PERMISSIONS_POLICY = "Permissions-Policy";
    public static final String FULLSCREEN_GEOLOCATION = "fullscreen=(), geolocation=()";
    public static final String ERRORS = "errors";
    public static final String ENTITY = "entity";
    public static final String PERMISSIONS = "permissions";
    public static final String OPERATIONS = "operations";
    public static final String FILE_NAME = "fileName";
    public static final String FILE_TYPE = "fileType";
    public static final String FILE_SIZE = "fileSize";
    public static final String FILE_URL = "fileURL";
    public static final String BASE64_STRING = "base64String";
    public static final String TICKET_ID = "ticketId";
    public static final String DISPLAY_NAME = "displayName";
    public static final String ATTACHMENT_TYPE = "attachmentType";
    public static final String CONTACT_ID = "contactId";
    public static final String LAST_ACTIVITY = "lastActivity";
    public static final String ROLES = "roles";
    public static final String ROLE = "role";
    public static final String SEGMENT = "segment";
    public static final String SEGMENT_ID = "segmentId";
    public static final String SEGMENT_NAME = "segmentName";
    public static final String SEGMENT_TYPE = "segmentType";
    public static final String STATUS_NAME = "statusName";
    public static final String USER_MANAGEMENT = "User Management";
    public static final String ENTITY_TYPE = "entityType";
    public static final String NEW_VALUE = "newValue";
    public static final String PREVIOUS_VALUE = "previousValue";
    public static final String ERR_MESSAGE = "errMessage";
    public static final String IMPERSONATION_URL = "impersonationURL";
    public static final String PROFILE_URL = "profileUrl";
    public static final String ROLE_NAMES = "roleNames";
    public static final String CREATOR = "creator";
    public static final String SERVICE_TYPE = "serviceType";
    public static final String SUBJECT = "subject";
    public static final String ESCALATION_LEVEL = "escalationLevel";
    public static final String LEVEL = "level";
    public static final String HREF = "href";
    public static final String SERVICE_IMPACTED = "serviceImpacted";
    public static final String OPEN = "Open";
    public static final String SEVERITY = "severity";
    public static final String PRIORITY = "priority";
    public static final String ATTACHMENTS = "attachments";
    public static final String SUCCESS = "Success";
    public static final String IS_AUDIT_LOG = "isAuditLog";
    public static final String IS_IMPERSONATION = "isImpersonation";
    public static final String CREATOR_NAME = "creatorName";
    public static final String NO_ENTITIES = "No entities";
    public static final String PARTY_INFO_INVOICE_ID = "partyInfoInvoiceId";
    public static final String INVOICE_GST_TYPE_ID = "invoiceGSTTypeId";
    public static final String TAX_SUMMARY_INVOICE_ID = "taxSummaryInvoiceId";
    public static final String BILL_MODE = "billMode";
    public static final String TRANSACTION_ID = "transactionId";    
    public static final String PO_DATE = "poDate";
    public static final String BILL_FREQUENCY = "billFrequency";
    public static final String PAYMENT_TERM = "paymentTerm";
    public static final String BILLING_PERIOD_START_DATE = "billPeriodStartDate";
    public static final String BILLING_PERIOD_END_DATE = "billPeriodEndDate";
    public static final String PAYMENT_INVOICE_NO = "paymentInvoiceNo";
    public static final String CREDIT_NOTE_INVOICE_NO = "creditNotesInvoiceNo";
    public static final String PAYMENT_REMARKS = "paymentRemarks";
    public static final String MODE_OF_PAYMENT = "paymentMode";
    public static final String GST_TYPE_ID = "gstTypeId";
    public static final String R_PAYMENT_REMARKS = "r_paymentNotesId_c_cstlnotesId";
    public static final String R_CREDIT_REMARKS = "r_remarksCreditNoteId_c_cstlnotesId";    
    public static final String CREDIT_AMOUNT = "creditAmount";
    public static final String CREDIT_ISSUE_DATE = "issueDate";
    public static final String TAX_RATE = "taxRate";
    public static final String TAX_VALUE = "taxValue";   
    public static final String PARTY_NAME = "partyName";  
    public static final String GSTN = "gstn";   
    public static final String R_INVOICEPARTYENTITYTYPEID_C_CSTLENTITYTYPEMASTER = "r_invoicePartyEntityTypeId_c_cstlentitytypemaster";
    public static final String R_INVOICE_PARTY_ENTITY_TYPE = "r_invoicePartyEntityTypeId_c_cstlentitytypemasterId";   
    public static final String ENTITY_TYPE_SUPPLIER = "Supplier"; 
    public static final String ENTITY_TYPE_CUSTOMER = "Customer"; 
    public static final String ADDRESS_LINE_1 = "addressLine1";   
    public static final String ADDRESS_LINE_2 = "addressLine2";   
    public static final String CITY = "city";   
    public static final String R_COUNTRY_ADDRESS = "r_countryMasterId_c_cstlcountrymasterId"; 
    public static final String R_BILLADDRESSID_C_CSTLADDRESS = "r_billAddressId_c_cstladdress";   
    public static final String R_SHIPADDRESSID_C_CSTLADDRESS = "r_shipAddressId_c_cstladdress"; 
    public static final String R_BILL_ADDRESS_PARTY = "r_billAddressId_c_cstladdressId";   
    public static final String R_SHIP_ADDRESS_PARTY = "r_shipAddressId_c_cstladdressId";   
    public static final String CREDIT_NOTES_REMARKS = "remarks";    
    public static final String INVOICE_ID = "invoiceId";
    public static final String PAYMENT_AMOUNT = "paymentAmount";
    public static final String PAYMENT_DATE = "paymentDate";
    public static final String BILLING = "Billing";
    public static final String CUSTOMER = "Customer";
    public static final String EXTERNAL_ATTACHMENT_ID = "externalAttachmentId";
    public static final String HREF_URL = "hrefURL";
    public static final String CREDIT_NOTES = "Credit Notes";
    public static final String TITLE = "title";
    public static final String DATE_TIME = "dateTime";
    public static final String CUST_SITE_ID = "custSiteId";
    public static final String CUST_CONTACT_ID = "custContactId";
    public static final String CREATEDBY = "createdBy";
    public static final String GST_TYPE_CGST = "CGST";
    public static final String GST_TYPE_SGST = "SGST";
    public static final String GST_TYPE_IGST = "IGST";
    public static final String GST_TYPE = "gstType";
    public static final String ACTIVE = "Active";
    public static final String INACTIVE = "Inactive";
    public static final String SCHEDULED = "Scheduled";
    public static final String EXPIRED = "Expired";
    public static final String REVOKED = "Revoked";
    public static final String PENDING = "Pending";
    public static final String R_GST_TYPE_INVOICE_TAX = "r_invoiceGSTTypeId_c_cstlgsttypemasterId";        
    public static final String R_CUST_BILLING_ADDRESS_ID = "r_customerBillingAddressId_c_cstladdressId";
    public static final String KEY_SCHEDULED_REPORTS = "Scheduled Reports";
	public static final String KEY_REPORTS = "Reports";
	public static final String KEY_DATE_FORMATTER = "yyyy-MM-dd'T'HH:mm:ssX";
	public static final String KEY_ENDDATE = "endDate";
	public static final String KEY_STARTDATE = "startDate";
	public static final String KEY_DELIVERYMETHOD = "deliveryMethod";
	public static final String KEY_DELIVERYMETHODID = "r_deliveryMethodId_c_cstldeliverymethodmasterId";
	public static final String KEY_SCHEDULED_REPORT = "Scheduled Report";
	public static final String KEY_IMPERSONATION_DURATION_ID = "r_accessDurationMasterId_c_cstlimpersonationdurationmasterId";
	public static final String KEY_IMPERSONATION_CUSTOMER_ID = "r_customerID_c_cstlcustomersId";
	public static final String KEY_DURATION = "duration";
	public static final String KEY_REQUESTED_ON = "requestedOn";
	public static final String KEY_APPROVED_ON = "approvedOn";
	public static final String KEY_TICKET_KEY = "ticketKey";
	public static final String KEY_STATUS_ID = "r_statusID_c_cstlstatusmasterId";
	public static final String KEY_IMPERSONATION_ACCESS = "Impersonation Access";
	public static final String HAS_IMPERSONATION_EDIT_ACCESS = "hasImpersonationEditAccess";
	public static final String KEY_STATUS_MASTER_ID = "r_reportStatusId_c_cstlstatusmasterId";
	public static final String KEY_ATTRIBUTE_INVOICE_ID = "attributeInvoiceId";
	public static final String KEY_UPTIME = "uptime";
	public static final String KEY_FIBERCUT = "fibercut";
	public static final String KEY_USER = "User";
	public static final String KEY_USER_PREFERENCES = "User Preferences";
	public static final String REPORT_DATE_FORMATTER = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    
    public static final String NOTES = "notes";
    public static final String R_CREATEDBY_USERID = "r_createdBy_userId";
    
    public static final String TICKET_REF_ID = "ticketRefId";
    
    public static final String R_CUSTOMERCUSTOMERUSERDETAILSID_C_CSTLCUSTOMERSID = "r_customerCustomerUserDetailsId_c_cstlcustomersId";
    public static final String R_CUSTOMERADDRESSID_C_CSTLADDRESSID = "r_customerAddressId_c_cstladdressId";
    public static final String R_CUSTOMERCONTACTSID_C_CSTLCONTACTSID = "r_customerContactId_c_cstlcontactsId";
    public static final String R_CUSTOMERSUPPORTUSERDETAILSID_C_CSTLCONTACTSID = "r_contactSupportUserDetailsId_c_cstlcontactsId";
    public static final String R_CUSTOMERSEGMENTTYPEMASTERID_C_CSTLSEGMENTTYPEMASTERID = "r_customerSegmentTypeMasterId_c_cstlsegmenttypemasterId";
    public static final String R_CUSTOMERSTATUSMASTERID_C_CSTLSTATUSMASTERID = "r_customerStatusMasterId_c_cstlstatusmasterId";
    public static final String R_STATUSENTITYTYPEID_C_CSTLENTITYTYPEMASTERID = "r_statusEntityTypeId_c_cstlentitytypemasterId";
    public static final String R_ORDERCUSTOMERACCOUNTNO_C_CSTLCUSTOMERID = "r_orderCustomerAccountNo_c_cstlcustomersId";
    public static final String R_ORDERSERVICEID_C_CSTLSERVICESID = "r_orderServiceId_c_cstlservicesId";
    public static final String R_ORDERSTATUSMASTERID_C_CSTLSTATUSMASTERID = "r_orderStatusMasterId_c_cstlstatusmasterId";
    
    public static final String R_CUSTOMERCORPORATEADDRESSID_C_CSTLADDRESSID = "r_customerCorporateAddressId_c_cstladdressId";
    
    public static final String MILESTONE = "milestone";
	public static final String ORDER_TYPE = "orderType";
	public static final String PO_NUMBER = "poNumber";
	public static final String ORDER_DATE = "orderDate";
	public static final String COMPLETION_DATE = "completionDate";
	
    public static final String R_SERVICESTATUSID_C_CSTLSTATUSMASTERID = "r_serviceStatusId_c_cstlstatusmasterId";
    
    public static final String R_INVOICESTATUSMASTERID_C_CSTLSTATUSMASTERID = "r_invoiceStatusMasterId_c_cstlstatusmasterId";
    public static final String R_INVOICECREDITNOTEID_C_CSTLCREDITNOTESID = "r_invoiceCreditNoteId_c_cstlcreditnotesId";
    public static final String R_INVOICESTATUSMASTERID_C_CSTLSTATUSMASTER = "r_invoiceStatusMasterId_c_cstlstatusmaster";
    public static final String R_TICKETESCALATIONLEVELMASTERID_C_CSTLESCALATIONLEVELMASTER = "r_ticketEscalationLevelMasterId_c_cstlescalationlevelmaster";
    public static final String R_TICKETSEVERITYMASTERID_C_CSTLSEVERITYMASTER = "r_ticketSeverityMasterId_c_cstlseveritymaster";
    public static final String R_STATUSID_CSTLSTATUSMASTER = "r_statusId_c_cstlstatusmaster";
    public static final String R_TICKETPRIORITYMASTERID_C_CSTLSEVERITYMASTER = "r_ticketPriorityMasterId_c_cstlprioritymaster";
    public static final String R_TICKETSTATUSMASTERID_C_CSTLSTATUSMASTER = "r_ticketStatusMasterId_c_cstlstatusmaster";
    public static final String SOURCE_END_NAME = "sourceEndName";
    public static final String SOURCE_END_LATITUDE = "sourceEndLatitude";
    public static final String SOURCE_END_LONGITUDE = "sourceEndLongitude";
    public static final String DESTINATION_END_NAME = "destinationEndName";
    public static final String DESTINATION_END_LATITUDE = "destinationEndLatitude";
    public static final String DESTINATION_END_LONGITUDE = "destinationEndLongitude";
    
    public static final String STATUS_ACTIONS_CREATOR_EXTERNALREFERENCECODE = "status%2Cactions%2Ccreator%2CexternalReferenceCode";
    public static final String CUSTOMERS = "Customers";
    public static final String LOGO_URL_KEY = "logoUrl";
    
    public static final String YYYY_MM_DD_T_HH_MM_SS_SSSXXX = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final String CREDIT_NOTE_NO = "creditNoteNo";
    public static final String KEYWORDS = "keywords";
    public static final String TAXONOMY_CATEGORY_BRIEFS = "taxonomyCategoryBriefs";
    public static final String DASH = "====================================================";
    public static final String SERVICE_ID_PARAM_IS_MISSING = "Service Id parameter is missing";
    public static final String TICKET = "Ticket";
    public static final String ANNOUNCEMENT = "Announcement";
    public static final String ESCALATION_MATRIX = "Escalation Matrix";
    
    public static final String ERROR_FETCHING_SERVICE_DETAILS_MW_API = "Error fetching service details from Middleware API";
    public static final String UNABLE_TO_CREATE_JSON_OBJECT_FROM_API_RESPONSE = "Unable to create JSON object from object API response";
    public static final String CUSTOMER_ONBOARDING_SETTING_UP_CUSTOMER_FOR_CUSTOMERID = ":::: Customer Onboarding -> setting up customer for customerId ::";
    public static final String CUSTOMER_ONBOARDING_UPDATING_CUSTOMER_ENTRY_FOR_CUSTOMERID = ":::: Customer Onboarding -> Updating customer entry for customerId :: ";
    public static final String CUSTOMER_ONBOARDING_SENDING_EMAIL_TO_PRIMARY_USER = ":::: Customer Onboarding -> Sending welcome email to primary user :: ";
    public static final String CUSTOMER_ONBOARDING_SUPPORT_USER_JSON = ":::: Customer Onboarding -> supportUserJson :: ";
    public static final String CUSTOMER_ONBOARDING_RELATIONSHIP_MANAGER_SUPPORT_USER_ENTRY_UPDATED = ":::: Customer Onboarding -> relationshipManager -> support user entry is updated with supportUserId :: ";
    public static final String CUSTOMER_ONBOARDING_RELATIONSHIP_MANAGER_SUPPORT_USER_ENTRY_CREATED = ":::: Customer Onboarding -> relationshipManager -> support user entry is created with supportUserId :: ";
    public static final String CUSTOMER_ONBOARDING_SERVICE_MANAGER_SUPPORT_USER_ENTRY_UPDATED = ":::: Customer Onboarding -> serviceManager -> support user entry is updated with supportUserId :: ";
    public static final String CUSTOMER_ONBOARDING_SERVICE_MANAGER_SUPPORT_USER_ENTRY_CREATED = ":::: Customer Onboarding -> serviceManager -> support user entry is created with supportUserId :: ";
    public static final String CUSTOMER_ONBOARDING_CUSTOMER_USER_JSON = ":::: Customer Onboarding -> customerUserJson :: ";
    public static final String CUSTOMER_ONBOARDING_CONTACT_USER_CUSTOMER_USER_ENTRY_UPDATED = ":::: Customer Onboarding -> Contact/User -> customer user entry is updated with customerUserId :: ";
    public static final String CUSTOMER_ONBOARDING_CONTACT_USER_CUSTOMER_USER_ENTRY_CREATED = ":::: Customer Onboarding -> Contact/User -> customer user entry is created with customerUserId :: ";
    public static final String CUSTOMER_ONBOARDING_UPDATED_CUSTOMER_FOR_CUSTOMER_ID = ":::: Customer Onboarding -> updated customer for customerId :: ";
    public static final String CUSTOMER_ONBOARDING_FETCHING_EXISTING_CUSTOMER_SUPPORT_USERS_CUSTOMER_ID = ":::: Customer Onboarding -> Fetching existing customer support users customerId :: ";
    public static final String UNABLE_TO_CREATE_JSON_OBJECT_FROM_OBJECT_API_RESPONSE = "Unable to create JSON object from object API response";
    public static final String ERROR_WHILE_CREATING_A_SERVICE_FROM_BACKEND_SYSTEM = ":::: error while creating a service from backend system.";
    public static final String ERROR_COLON =  "Error ::: ";
    public static final String ATTACHMENT_ATTACHMENT_ENTRY_IS_CREATED_WITH_ATTACHMENTID =  ":::: Attchment -> Attchment entry is created with attchmentId :: ";
    public static final String SERVICE_ID_PARAMETER_IS_MISSING =  "Service Id parameter is missing.";
    public static final String TEST_REPORTS =  "testReports";
    public static final String ATTACHMENT =  "attachment";
    public static final String REPORT_DUPLICATION_MESSAGE = "A schedule with the same configuration already exists.";
    public static final String ADD_EDIT_ACCESS_FAILURE_MESSAGE = "Add edit access is failed due to some technical issue. Please try again after sometime.";
    public static final String ADD_EDIT_ACCESS_OTP_EXPIRED_MESSAGE = "Code has expired. Please submit a new request.";
    public static final String ADD_EDIT_ACCESS_OTP_MISMATCHED_MESSAGE = "Invalid verification code.";
    public static final String ADD_EDIT_ACCESS_NOT_FOUND_MESSAGE = "Request not valid or no longer active.";
    public static final String VALIDATE_OTP_EDIT_ACCESS_FAILURE_MESSAGE = "We are facing technical issue, while validation of OTP. Please submit a new request.";
    public static final String REVOKE_ACCESS_FAILURE_MESSAGE = "Revoke access is failed due to some technical issue. Please try again after sometime.";
    
    // Constants for file types
    public static final String FILE_TYPE_JSON = "json";
    public static final String FILE_TYPE_GEOJSON = "geojson";
    public static final String ZIP_CODE = "zipCode";
    
    public static final String R_STATEMASTERID_C_CSTLSTATEMASTER = "r_stateMasterId_c_cstlstatemaster";
    public static final String R_CUSTOMERUSERDETAILSCONTACTID_C_CSTLCONTACTSID = "r_customerUserDetailsContactId_c_cstlcontactsId";
    public static final String R_COUNTRYMASTERID_C_CSTLCOUNTRYMASTERID = "r_countryMasterId_c_cstlcountrymasterId";
    public static final String R_STATEMASTERID_C_CSTLSTATEMASTERID = "r_stateMasterId_c_cstlstatemasterId";
    public static final String R_CONTACTADDRESSID_C_CSTLADDRESSID = "r_contactAddressId_c_cstladdressId";
    public static final String ERROR_UPDATING_ADDRESS_OF_USER = "Error updating address of user";
    public static final String UNABLE_TO_SAVE_USER_DETAILS_ERROR = "Unable to save user details. Please try again later.";
    public static final String EXCEPTION_OCCURED_IN_CREATING_USER_ERROR = "Exception occured in creating user ----------- ";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String R_TICKETSTATUSMASTERID_C_CSTLSTATUSMASTERID = "r_ticketStatusMasterId_c_cstlstatusmasterId";
    public static final String KEY_LANGUAGE_EN_US = "en_US";

    public static final String OBJECT_API_RESTRICTED_FIELDS ="actions,creator,status";
	public static final String FROM_DATE = "fromDate";
	public static final String TO_DATE = "toDate";
	
	public static final String COLOR_SCHEME_SETTINGS = "colorSchemeSettings";
	public static final String DASHBOARD_SETTINGS = "dashboardSettings";
	public static final String SCHEDULE_MAINTENANCE_SETTINGS = "scheduleMaintenanceSetting";
	public static final String WATCHLIST_SETTINGS = "watchlistSettings";
	
	public static final String TICKET_URL = "ticketURL";
    public static final String PRIORITY_MASTER_MAP = "priorityMasterMap";
    public static final String ESCALATION_LEVEL_MASTER_MAP = "escalationLevelMasterMap";
    public static final String SEVERITY_MASTER_MAP = "severityMasterMap";
    public static final String STATUS_MASTER_MAP = "statusMasterMap";
    public static final String SERVICE_ID_MAP = "serviceIdMap";
    public static final String CUSTOMER_ID_MAP = "customerIdMap";
    public static final String PRIORITY_MASTER_ID = "priorityMasterId";
    public static final String ESCALATION_LEVEL_MASTER_ID = "escalationLevelMasterId";
    public static final String SEVERITY_MASTER_ID = "severityMasterId";
    public static final String STATUS_MASTER_ID = "statusMasterId";
    public static final String CUSTOMER_ACCOUNT_NO_MAP = "customerAccountNoMap";
    
    public static final String EMAIL = "email";
    public static final String YYYY_MM_DD_T_HH_MM_SS_SSS = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String ACCESS_LEVEL = "accessLevel";
    public static final String VIEW = "View";
    public static final String WORKSPACE_ID = "{workspaceId}";
    public static final String REPORT_ID = "{reportId}";
    public static final String WORKSPACEID = "workspaceId";
    public static final String REPORTID = "reportId";
    public static final String LAST_MODIFIED_DATE = "lastModifiedDate";
    
    public static final String DESIGNATION = "designation";
    public static final String TELEPHONE_NO = "telephoneNo";
    
    public static final String TOPOLOGY_URL = "topologyURL";
    public static final String TOPOLOGY_LOCATION_URL = "topologyLocationURL";
    public static final String TOPOLOGY_ROUTES_URL = "topologyRoutesURL";
    public static final String TOPOLOGY_ROUTES_OMS_URL = "topologyRoutesOmsURL";
    
    public static final String ROUTES_TOPOLOGY_ID = "r_routesTopologyId_c_cstltopologyId";
    public static final String CURRENT_ROUTE = "currentRoute";
    public static final String ROUTE_TYPE = "routeType";
    public static final String HOME_ROUTE = "homeRoute";
    public static final String ROUTE_ID = "routeId";
    public static final String BANDWIDTH = "bandwidth";
    public static final String AEND_PORT = "aendPort";
    public static final String ZEND_PORT = "zendPort";
    public static final String END_TYPE = "endType";
    
    public static final String ROUTE_TYPE_MAIN = "Main";
    public static final String ROUTE_TYPE_SECONDARY = "Secondary";
    public static final String ROUTE_TYPE_RESTORATION = "Restoration";
    
    public static final String KEY_DF_SERVICE_KMZ = "DF Service KMZ";
    public static final String KEY_DL_FILE_ENTRY_ID = "dlFileEntryId";
    public static final String KEY_UUID = "uuid";
    public static final String KEY_MIME_TYPE = "mimeType";
    public static final String KEY_MIME_KML = "application/vnd.google-earth.kml+xml";
    public static final String KEY_MIME_KMZ = "application/vnd.google-earth.kmz";
    public static final String KEY_IN = "in";

    public static final String AMOUNT_PAID = "amountPaid";
    public static final String BALANCE_DUE = "balanceDue";
    public static final String BILLING_PERIOD = "billingPeriod";

    //--- Invoice Tax Summary Attributes ---
    public static final String TOTAL_BASE_VALUE_EXCLUDING_TAX = "totalBaseValueExcludingTax";
    public static final String CGST_9_PERCENT = "cgstAmount";
    public static final String SGST_9_PERCENT = "sgstAmount";
    public static final String IGST_18_PERCENT = "igstAmount";
    public static final String TOTAL_TAX = "totalTaxAmount";
    public static final String TOTAL_INVOICE_VALUE_INCLUDING_TAX = "totalInvoiceValueIncludingTax";

    //--- Invoice Credit Note Attributes ---
    public static final String CREDIT_NOTE_ID_1 = "creditNotesId1";
    public static final String CN_ISSUE_DATE_1 = "cnIssueDate1";
    public static final String CREDIT_AMOUNT_DATE_1 = "creditAmountDate1";
    public static final String CREDIT_NOTE_ID_2 = "creditNotesId2";
    public static final String CN_ISSUE_DATE_2 = "cnIssueDate2";
    public static final String CREDIT_AMOUNT_DATE_2 = "creditAmountDate2";

    //--- Invoice Payment Attributes ---
    public static final String PAYMENT_ID_1 = "paymentId1";
    public static final String MODE_OF_PAYMENT_1 = "modeOfPayment1";
    public static final String PAYMENT_DATE_1 = "paymentDate1";
    public static final String PAYMENT_AMOUNT_1 = "paymentAmount1";
    public static final String PAYMENT_ID_2 = "paymentId2";
    public static final String MODE_OF_PAYMENT_2 = "modeOfPayment2";
    public static final String PAYMENT_DATE_2 = "paymentDate2";
    public static final String PAYMENT_AMOUNT_2 = "paymentAmount2";

    //--- Invoice Party Information Attributes ---
    public static final String SUPPLIER_NAME = "supplierName";
    public static final String SUPPLIER_GSTN = "supplierGstn";
    public static final String SUPPLIER_BILLING_ADDRESS = "supplierBillingAddress";
    public static final String CUSTOMER_GSTN = "customerGstn";
    public static final String BILL_TO_ADDRESS = "billToAddress";
    public static final String SHIP_TO_ADDRESS = "shipToAddress";

    public static final String NOT_AVAILABLE ="N/A";
    public static final String GIS_EXTERNAL_KMZ = "GIS External KMZ";
    public static final String FILE_TYPE_KML = "kml";
    public static final String FILE_TYPE_KMZ = "kmz";
    
    public static final String KEY_FILE_ENTRY_ID = "fileEntryId";
    public static final String KEY_FILE_URL = "fileUrl";

    //GIS Location constants
    public static final String CODE = "code";
    public static final String LABEL = "label";
    public static final String SYSTEM_ID = "systemid";
    public static final String LOCATION_TYPE = "locationtype";
    public static final String LOCATION_SUB_TYPE = "locationsubtype";
    public static final String ENTITY_TYPE_LOWERCASE = "entitytype";
    public static final String POP_DC_TYPE = "popdctype";
    public static final String LOCATION_OWNER = "locationowner";
    public static final String SRC_OF_LOCATION = "srcoflocation";
    public static final String CREATION_TIME = "creationtime";
    public static final String MODIFICATION_TIME = "modificationtime";
    public static final String PARENT_LOCATION_ID = "parentlocationid";
    public static final String PARENT_LOCATION_NAME = "parentlocationname";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String NETWORK_ID_LOWERCASE = "networkid";
    public static final String NETWORK_STATUS = "networkstatus";
    public static final String CAPABILITY = "capability";
    public static final String PROJECT_NAME = "projectname";
    public static final String PROJECT_CODE_LOWERCASE = "projectcode";
    public static final String ADDRESS = "address";
    public static final String BUILDING_NAME_LOWERCASE = "buildingname";
    public static final String BUILDING_CODE = "buildingcode";
    public static final String BLOCK_NAME = "blockname";
    public static final String BLOCK_CODE = "blockcode";
    public static final String FLOOR_NAME = "floorname";
    public static final String SITE_CODE_LOWERCASE = "sitecode";
    public static final String CITY_CODE = "citycode";
    public static final String CITY_NAME = "cityname";
    public static final String PROVINCE_CODE = "provincecode";
    public static final String PROVINCE_NAME = "provincename";
    public static final String STATE_CODE = "statecode";
    public static final String STATE_NAME = "statename";
    public static final String REGION_CODE = "regioncode";
    public static final String REGION_NAME = "regionname";
    public static final String LOCATION_ID = "locationid";
    public static final String CREATED_BY_LOWERCASE = "createby";
    
    public static final String ENTITY_SERVICE = "Service";
    public static final String ENTITY_ORDER = "Order";
    public static final String ENTITY_INVOICE = "Invoice";
    public static final String ENTITY_CREDIT_NOTES = "Credit Notes";
    public static final String ENTITY_PAYMENTS = "Payments";
    public static final String ENTITY_SCHEDULED_MAINTENANCE = "Scheduled Maintenance";
    public static final String STATUS_INPROGRESS = "In Progress";
    public static final String ENTITYTYPE = "entityType";
    public static final String LASTSYNCEDTIME = "lastSyncedTime";
    public static final String ENTITY_CUSTOMER = "Customer";
    public static final String REGISTERED_ADDRESS = "Registered Address";
    public static final String CORPORATE_ADDRESS = "Corporate Address";
    public static final String CONTACT_ADDRESS_ID = "Contact Address Id";
    public static final String CUSTOMER_CORPORATE_ADDRESS = "Customer Corporate Address";
    
    public static final String ONBOARD = "onboard";
    public static final String CUSTOMER_FACING_ROLE = "customerFacingRole";
    public static final String ORDERID = "orderId";
    public static final String ACCOUNT = "Account";
    
    public static final String SERVICE_IMPACTED_TYPE = "Service_impacted_type";
    
    public static final String LAST_LOGIN_DATE = "lastLoginDate";
    public static final String PERSONA = "persona";
    public static final String R_SCHEDULEMAINTENANCEID_C_CSTLSCHEDULEDMAINTENANCESID = "r_scheduleMaintenanceId_c_cstlscheduledmaintenancesId";
    public static final String SERVICEIMPACTEDTYPE = "serviceImpactedType";
    public static final String EXISTINGSERVICEIDS = "existingServiceIds";
    
    
	public static final String FECETS = "facets";
     
	public static final String AMPERSAND_CLIENT_SECRET = "&client_secret=";
	public static final String AMPERSAND_CLIENT_ID = "&client_id=";
 
    public static final String CUSTOMER_DISPLAY_FIELD_LIST="fields=id,displayName,parentCustomerAccountNo,segmentTypeId,primaryUserId,statusId";
    public static final String ENTITY_CUSTOMER_USER = "CUSTOMER_USER";
    
    public static final int STATUS_OK = 200;
    
	public static final String CONTENT_DISP = "Content-Disposition: form-data; name=";
    
}