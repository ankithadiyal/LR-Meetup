package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.client.extension.model.ClientExtensionEntry;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.client.extension.constants.ClientExtensionEntryConstants;
import com.liferay.client.extension.exception.ClientExtensionEntryNameException;
import com.liferay.client.extension.exception.ClientExtensionEntryTypeSettingsException;
import com.liferay.client.extension.type.CommerceCheckoutStepCET;
import com.liferay.client.extension.type.CustomElementCET;
import com.liferay.client.extension.type.EditorConfigContributorCET;
import com.liferay.client.extension.type.FDSCellRendererCET;
import com.liferay.client.extension.type.FDSFilterCET;
import com.liferay.client.extension.type.GlobalCSSCET;
import com.liferay.client.extension.type.GlobalJSCET;
import com.liferay.client.extension.type.IFrameCET;
import com.liferay.client.extension.type.JSImportMapsEntryCET;
import com.liferay.client.extension.type.StaticContentCET;
import com.liferay.client.extension.type.ThemeCSSCET;
import com.liferay.client.extension.type.ThemeFaviconCET;
import com.liferay.client.extension.type.ThemeSpritemapCET;
import com.liferay.client.extension.type.annotation.CETProperty;
import com.liferay.client.extension.web.internal.constants.ClientExtensionAdminFDSNames;
import com.liferay.client.extension.web.internal.constants.ClientExtensionAdminWebKeys;
import com.liferay.client.extension.web.internal.display.context.ClientExtensionAdminDisplayContext;
import com.liferay.client.extension.web.internal.display.context.EditClientExtensionEntryDisplayContext;
import com.liferay.client.extension.web.internal.display.context.ViewClientExtensionEntryDisplayContext;
import com.liferay.learn.LearnMessageUtil;
import com.liferay.portal.kernel.feature.flag.FeatureFlagManagerUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import java.lang.reflect.Method;
import java.util.Collection;

public final class edit_005fclient_005fextension_005fentry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/init.jsp");
    _jspx_dependants.add("/init.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class) : new com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag();
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
        _jspx_th_liferay$1frontend_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
      _jspx_th_liferay$1frontend_defineObjects_0.release();
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.lang.String npmResolvedPackageName = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      npmResolvedPackageName = (java.lang.String) _jspx_page_context.findAttribute("npmResolvedPackageName");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.DefineObjectsTag.class) : new com.liferay.taglib.portlet.DefineObjectsTag();
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
        _jspx_th_portlet_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
      _jspx_th_portlet_defineObjects_0.release();
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

EditClientExtensionEntryDisplayContext editClientExtensionEntryDisplayContext = (EditClientExtensionEntryDisplayContext)renderRequest.getAttribute(ClientExtensionAdminWebKeys.EDIT_CLIENT_EXTENSION_ENTRY_DISPLAY_CONTEXT);

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(editClientExtensionEntryDisplayContext.getRedirect());

renderResponse.setTitle(editClientExtensionEntryDisplayContext.getTitle());

      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("/client_extension_admin/edit_client_extension_entry");
      _jspx_th_portlet_actionURL_0.setVar("editClientExtensionEntryURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String editClientExtensionEntryURL = null;
      editClientExtensionEntryURL = (java.lang.String) _jspx_page_context.findAttribute("editClientExtensionEntryURL");
      out.write('\n');
      out.write('\n');
      //  liferay-frontend:edit-form
      com.liferay.frontend.taglib.servlet.taglib.EditFormTag _jspx_th_liferay$1frontend_edit$1form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormTag();
      _jspx_th_liferay$1frontend_edit$1form_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_edit$1form_0.setParent(null);
      _jspx_th_liferay$1frontend_edit$1form_0.setAction( editClientExtensionEntryURL );
      _jspx_th_liferay$1frontend_edit$1form_0.setMethod("post");
      int _jspx_eval_liferay$1frontend_edit$1form_0 = _jspx_th_liferay$1frontend_edit$1form_0.doStartTag();
      if (_jspx_eval_liferay$1frontend_edit$1form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_0.setName( Constants.CMD );
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( editClientExtensionEntryDisplayContext.getCmd() );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_1.setName("redirect");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( editClientExtensionEntryDisplayContext.getRedirect() );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_2.setName("externalReferenceCode");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( editClientExtensionEntryDisplayContext.getExternalReferenceCode() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1ui_error_0.setException( ClientExtensionEntryNameException.class );
        _jspx_th_liferay$1ui_error_0.setMessage("client-extension-name-is-required");
        int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
        if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_error_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1ui_error_1.setException( ClientExtensionEntryTypeSettingsException.class );
        int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
        if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object errorException = null;
          if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1ui_error_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1ui_error_1.doInitBody();
          }
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          do {
            out.write("\n");
            out.write("\n");
            out.write("\t\t");

		ClientExtensionEntryTypeSettingsException clientExtensionEntryTypeSettingsException = (ClientExtensionEntryTypeSettingsException)errorException;
		
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
            _jspx_th_liferay$1ui_message_0.setArguments( clientExtensionEntryTypeSettingsException.getMessageArguments() );
            _jspx_th_liferay$1ui_message_0.setKey( clientExtensionEntryTypeSettingsException.getMessageKey() );
            int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
            if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
              _jspx_th_liferay$1ui_message_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            out.write('\n');
            out.write('	');
            int evalDoAfterBody = _jspx_th_liferay$1ui_error_1.doAfterBody();
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1ui_error_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_error_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
        _jspx_th_liferay$1ui_error_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-frontend:edit-form-body
        com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag _jspx_th_liferay$1frontend_edit$1form$1body_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag();
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        int _jspx_eval_liferay$1frontend_edit$1form$1body_0 = _jspx_th_liferay$1frontend_edit$1form$1body_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_edit$1form$1body_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<h3 class=\"mb-3\">");
          out.print( HtmlUtil.escape(editClientExtensionEntryDisplayContext.getTitle()) );
          out.write("</h3>\n");
          out.write("\n");
          out.write("\t\t<p class=\"text-secondary\">");
          out.print( editClientExtensionEntryDisplayContext.getHelpLabel() );
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-learn:message
          com.liferay.learn.taglib.servlet.taglib.MessageTag _jspx_th_liferay$1learn_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.learn.taglib.servlet.taglib.MessageTag.class) : new com.liferay.learn.taglib.servlet.taglib.MessageTag();
          _jspx_th_liferay$1learn_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1learn_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1learn_message_0.setKey( editClientExtensionEntryDisplayContext.getLearnResourceKey() );
          _jspx_th_liferay$1learn_message_0.setResource("client-extension-web");
          int _jspx_eval_liferay$1learn_message_0 = _jspx_th_liferay$1learn_message_0.doStartTag();
          if (_jspx_th_liferay$1learn_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
            _jspx_th_liferay$1learn_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
          _jspx_th_liferay$1learn_message_0.release();
          out.write("\n");
          out.write("\t\t</p>\n");
          out.write("\n");
          out.write("\t\t<p class=\"text-secondary\">\n");
          out.write("\t\t\t");
          if (_jspx_meth_liferay$1learn_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_edit$1form$1body_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t</p>\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:panel-group
          com.liferay.frontend.taglib.clay.servlet.taglib.PanelGroupTag _jspx_th_clay_panel$1group_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.PanelGroupTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.PanelGroupTag();
          _jspx_th_clay_panel$1group_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_panel$1group_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          int _jspx_eval_clay_panel$1group_0 = _jspx_th_clay_panel$1group_0.doStartTag();
          if (_jspx_eval_clay_panel$1group_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  clay:panel
            com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag _jspx_th_clay_panel_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag();
            _jspx_th_clay_panel_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_panel_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel$1group_0);
            _jspx_th_clay_panel_0.setDisplayTitle( LanguageUtil.get(request, "identity") );
            _jspx_th_clay_panel_0.setExpanded( true );
            int _jspx_eval_clay_panel_0 = _jspx_th_clay_panel_0.doStartTag();
            if (_jspx_eval_clay_panel_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t<div class=\"panel-body\">\n");
              out.write("\t\t\t\t\t");
              //  aui:field-wrapper
              com.liferay.taglib.aui.FieldWrapperTag _jspx_th_aui_field$1wrapper_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldWrapperTag.class) : new com.liferay.taglib.aui.FieldWrapperTag();
              _jspx_th_aui_field$1wrapper_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_field$1wrapper_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_0);
              _jspx_th_aui_field$1wrapper_0.setLabel("name");
              _jspx_th_aui_field$1wrapper_0.setName("name");
              _jspx_th_aui_field$1wrapper_0.setRequired( true );
              int _jspx_eval_aui_field$1wrapper_0 = _jspx_th_aui_field$1wrapper_0.doStartTag();
              if (_jspx_eval_aui_field$1wrapper_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  liferay-ui:input-localized
                com.liferay.taglib.ui.InputLocalizedTag _jspx_th_liferay$1ui_input$1localized_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputLocalizedTag.class) : new com.liferay.taglib.ui.InputLocalizedTag();
                _jspx_th_liferay$1ui_input$1localized_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1ui_input$1localized_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
                _jspx_th_liferay$1ui_input$1localized_0.setAvailableLocales( editClientExtensionEntryDisplayContext.getAvailableLocales() );
                _jspx_th_liferay$1ui_input$1localized_0.setDefaultLanguageId( editClientExtensionEntryDisplayContext.getDefaultLanguageId() );
                _jspx_th_liferay$1ui_input$1localized_0.setName("name");
                _jspx_th_liferay$1ui_input$1localized_0.setXml( editClientExtensionEntryDisplayContext.getName() );
                int _jspx_eval_liferay$1ui_input$1localized_0 = _jspx_th_liferay$1ui_input$1localized_0.doStartTag();
                if (_jspx_th_liferay$1ui_input$1localized_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
                  _jspx_th_liferay$1ui_input$1localized_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
                _jspx_th_liferay$1ui_input$1localized_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
              }
              if (_jspx_th_aui_field$1wrapper_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
                _jspx_th_aui_field$1wrapper_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
              _jspx_th_aui_field$1wrapper_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-editor:editor
              com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag _jspx_th_liferay$1editor_editor_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag.class) : new com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag();
              _jspx_th_liferay$1editor_editor_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1editor_editor_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_0);
              _jspx_th_liferay$1editor_editor_0.setContents( editClientExtensionEntryDisplayContext.getDescription() );
              _jspx_th_liferay$1editor_editor_0.setEditorName("contentEditor");
              _jspx_th_liferay$1editor_editor_0.setName("description");
              _jspx_th_liferay$1editor_editor_0.setPlaceholder("description");
              int _jspx_eval_liferay$1editor_editor_0 = _jspx_th_liferay$1editor_editor_0.doStartTag();
              if (_jspx_th_liferay$1editor_editor_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_editor_0);
                _jspx_th_liferay$1editor_editor_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_editor_0);
              _jspx_th_liferay$1editor_editor_0.release();
              out.write("\n");
              out.write("\t\t\t\t</div>\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_clay_panel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_0);
              _jspx_th_clay_panel_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_0);
            _jspx_th_clay_panel_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
            //  clay:panel
            com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag _jspx_th_clay_panel_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag();
            _jspx_th_clay_panel_1.setPageContext(_jspx_page_context);
            _jspx_th_clay_panel_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel$1group_0);
            _jspx_th_clay_panel_1.setDisplayTitle( LanguageUtil.get(request, "content") );
            _jspx_th_clay_panel_1.setExpanded( true );
            int _jspx_eval_clay_panel_1 = _jspx_th_clay_panel_1.doStartTag();
            if (_jspx_eval_clay_panel_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t<div class=\"panel-body\">\n");
              out.write("\t\t\t\t\t");
              //  liferay-util:include
              com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
              _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_1);
              _jspx_th_liferay$1util_include_0.setPage( editClientExtensionEntryDisplayContext.getEditJSP() );
              _jspx_th_liferay$1util_include_0.setServletContext( application );
              int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
              if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
                _jspx_th_liferay$1util_include_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
              _jspx_th_liferay$1util_include_0.release();
              out.write("\n");
              out.write("\t\t\t\t</div>\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_clay_panel_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_1);
              _jspx_th_clay_panel_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_1);
            _jspx_th_clay_panel_1.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
            //  clay:panel
            com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag _jspx_th_clay_panel_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.PanelTag();
            _jspx_th_clay_panel_2.setPageContext(_jspx_page_context);
            _jspx_th_clay_panel_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel$1group_0);
            _jspx_th_clay_panel_2.setDisplayTitle( LanguageUtil.get(request, "additional-resources") );
            _jspx_th_clay_panel_2.setExpanded( true );
            int _jspx_eval_clay_panel_2 = _jspx_th_clay_panel_2.doStartTag();
            if (_jspx_eval_clay_panel_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t<div class=\"panel-body\">\n");
              out.write("\t\t\t\t\t");
              //  aui:field-wrapper
              com.liferay.taglib.aui.FieldWrapperTag _jspx_th_aui_field$1wrapper_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldWrapperTag.class) : new com.liferay.taglib.aui.FieldWrapperTag();
              _jspx_th_aui_field$1wrapper_1.setPageContext(_jspx_page_context);
              _jspx_th_aui_field$1wrapper_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_2);
              _jspx_th_aui_field$1wrapper_1.setCssClass("form-group");
              int _jspx_eval_aui_field$1wrapper_1 = _jspx_th_aui_field$1wrapper_1.doStartTag();
              if (_jspx_eval_aui_field$1wrapper_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  aui:input
                com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
                _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_1);
                _jspx_th_aui_input_3.setLabel("source-code-url");
                _jspx_th_aui_input_3.setName("sourceCodeURL");
                _jspx_th_aui_input_3.setType("text");
                _jspx_th_aui_input_3.setValue( editClientExtensionEntryDisplayContext.getSourceCodeURL() );
                int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
                if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
                  _jspx_th_aui_input_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
                _jspx_th_aui_input_3.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t<div class=\"form-text\">\n");
                out.write("\t\t\t\t\t\t\t");
                if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_field$1wrapper_1, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t");
              }
              if (_jspx_th_aui_field$1wrapper_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_1);
                _jspx_th_aui_field$1wrapper_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_1);
              _jspx_th_aui_field$1wrapper_1.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  aui:input
              com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
              _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
              _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_2);
              _jspx_th_aui_input_4.setName("type");
              _jspx_th_aui_input_4.setType("hidden");
              _jspx_th_aui_input_4.setValue( editClientExtensionEntryDisplayContext.getType() );
              int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
              if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
                _jspx_th_aui_input_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
              _jspx_th_aui_input_4.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
if (
 editClientExtensionEntryDisplayContext.isPropertiesVisible() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              //  aui:input
              com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
              _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
              _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_panel_2);
              _jspx_th_aui_input_5.setLabel("properties");
              _jspx_th_aui_input_5.setName("properties");
              _jspx_th_aui_input_5.setPlaceholder("define-the-default-properties-that-are-included-in-all-instances-of-the-client-extension-these-properties-are-passed-to-the-application-as-additional-url-attributes-so-they-can-be-accessed-programmatically");
              _jspx_th_aui_input_5.setType("textarea");
              _jspx_th_aui_input_5.setValue( editClientExtensionEntryDisplayContext.getProperties() );
              int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
              if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
                _jspx_th_aui_input_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
              _jspx_th_aui_input_5.release();
              out.write("\n");
              out.write("\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t</div>\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_clay_panel_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_2);
              _jspx_th_clay_panel_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel_2);
            _jspx_th_clay_panel_2.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_panel$1group_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel$1group_0);
            _jspx_th_clay_panel$1group_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_panel$1group_0);
          _jspx_th_clay_panel$1group_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1frontend_edit$1form$1body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-frontend:edit-form-footer
        com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag _jspx_th_liferay$1frontend_edit$1form$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag();
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        int _jspx_eval_liferay$1frontend_edit$1form$1footer_0 = _jspx_th_liferay$1frontend_edit$1form$1footer_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_edit$1form$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  liferay-frontend:edit-form-buttons
          com.liferay.frontend.taglib.servlet.taglib.EditFormButtonsTag _jspx_th_liferay$1frontend_edit$1form$1buttons_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormButtonsTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormButtonsTag();
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.setRedirect( editClientExtensionEntryDisplayContext.getRedirect() );
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.setSubmitId("editClientExtensionEntrySubmitButton");
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.setSubmitLabel( WorkflowDefinitionLinkLocalServiceUtil.hasWorkflowDefinitionLink(themeDisplay.getCompanyId(), 0L, ClientExtensionEntry.class.getName()) ? "submit-for-workflow" : "publish" );
          int _jspx_eval_liferay$1frontend_edit$1form$1buttons_0 = _jspx_th_liferay$1frontend_edit$1form$1buttons_0.doStartTag();
          if (_jspx_th_liferay$1frontend_edit$1form$1buttons_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1buttons_0);
            _jspx_th_liferay$1frontend_edit$1form$1buttons_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1buttons_0);
          _jspx_th_liferay$1frontend_edit$1form$1buttons_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1frontend_edit$1form$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
        out.write('\n');
      }
      if (_jspx_th_liferay$1frontend_edit$1form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1frontend_edit$1form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
      _jspx_th_liferay$1frontend_edit$1form_0.release();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_liferay$1learn_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_edit$1form$1body_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-learn:message
    com.liferay.learn.taglib.servlet.taglib.MessageTag _jspx_th_liferay$1learn_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.learn.taglib.servlet.taglib.MessageTag.class) : new com.liferay.learn.taglib.servlet.taglib.MessageTag();
    _jspx_th_liferay$1learn_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1learn_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
    _jspx_th_liferay$1learn_message_1.setKey("learn-browser-based-client-extensions");
    _jspx_th_liferay$1learn_message_1.setResource("client-extension-web");
    int _jspx_eval_liferay$1learn_message_1 = _jspx_th_liferay$1learn_message_1.doStartTag();
    if (_jspx_th_liferay$1learn_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_1);
      _jspx_th_liferay$1learn_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_1);
    _jspx_th_liferay$1learn_message_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_field$1wrapper_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_1);
    _jspx_th_liferay$1ui_message_1.setKey("specify-the-source-code-repository-url-for-the-client-extension");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }
}
