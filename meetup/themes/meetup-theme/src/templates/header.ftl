<#include init />
<header class="header">
  <div class="container">
    <div class="leftbar">
      <div class="logo">
        <#--<a href="#" title="Aixtor"
          ></a>-->
        <a href="${site_default_url}" title="Aixtor">

        </a>
      </div>
      <div class="page-title"></div>
        <#if has_navigation && is_setup_complete>
          <#include "${full_templates_path}/navigation.ftl" />
        </#if>
    </div>
    <div class="rightbar">
      <ul>
        <#--

        <li>
          <a
            href="javscript:void(0)"
            class="header-nav-btn search-btn"
            title="Search"
            >

          </a>
        </li>
        <li>
          <a
            href="javscript:void(0)"
            class="header-nav-btn email-btn"
            title="Emails"
            >
          </a>
        </li>
        -->
        <#-- Only show if site name is NOT 'Internal' -->
        <#if site_name?lower_case != "internal">
            <li class="desktop-view">
                <#-- Get first initial of site name -->
                <#assign siteInitial = site_name?substring(0,1) />

                <div class="company-header-name">
                    <div class="brand-logo">${siteInitial}</div>
                    <div class="brand-label">${site_name}</div>
                </div>
            </li>

        </#if>
        <li class="desktop-view">
          <@liferay_portlet["runtime"]
          portletName="com_liferay_client_extension_web_internal_portlet_ClientExtensionEntryPortlet_${company_id}_LXC_krypton_impersonation_customer_access_cx"
          />
        </li>

        <li class="">
          <#--<select class="custom-select" name="themeSwitcherDD" id="themeSwitcherDD">
	      	 <option>Loading...</option>
		  </select>-->
		  <@liferay_portlet["runtime"]
          portletName="com_liferay_client_extension_web_internal_portlet_ClientExtensionEntryPortlet_${company_id}_LXC_krypton_stylebook_cx"
          />
        </li>
        <li>
          <@liferay_portlet["runtime"]
          portletName="com_liferay_client_extension_web_internal_portlet_ClientExtensionEntryPortlet_${company_id}_LXC_krypton_notification_cx"
          />
        </li>
        <li>
          <#assign webContentId = getterUtil.getString(themeDisplay.getThemeSetting("web-content-article-id")) />
          <#assign journalArticleLocalService = serviceLocator.findService("com.liferay.journal.service.JournalArticleLocalService")>
          <#assign groupId = themeDisplay.getScopeGroupId() />
          <#if groupId?has_content && webContentId?has_content && journalArticleLocalService?has_content>
          <#attempt>
          <#assign article = journalArticleLocalService.fetchArticle(groupId?long, webContentId?string) />
          <#if article?has_content>
          <#assign articleContent = journalArticleLocalService.getArticleContent(article,article.getDDMTemplateKey(), "VIEW", themeDisplay.getLanguageId(), null, themeDisplay) />
          <#if articleContent?has_content>
          ${articleContent}
          </#if>
          </#if>
          <#recover>
          </#attempt>
          </#if>
        </li>
        <li>
          <div class="hamburger">
            <span class="bar"></span>
            <span class="bar"></span>
            <span class="bar"></span>
          </div>
        </li>
      </ul>
    </div>
  </div>
</header>