<nav class="constl-top-navigation" aria-label="<@liferay.language key="site-pages" />"  id="navigation" role="navigation">
	  <#if site_name?lower_case != "internal">
            <div class="mobile-view">
                <#-- Get first initial of site name -->
                <#assign siteInitial = site_name?substring(0,1) />
                <div class="company-header-name">
                    <div class="brand-logo">${siteInitial}</div>
                    <div class="brand-label">${site_name}</div>
                </div>
            </div>
        </#if>

	<@liferay_portlet["runtime"]
      portletName="com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet"
    />
	<#-- <ul class="navabar" role="menubar">
		<#list nav_items as nav_item>
			<#assign
				nav_item_attr_has_popup = ""
				nav_item_css_class = ""
				nav_item_layout = nav_item.getLayout()
			/>

			<#if nav_item.isSelected()>
				<#assign
					nav_item_attr_has_popup = "aria-haspopup='true'"
					nav_item_css_class = "selected"
				/>
			</#if>

			<li class="${nav_item_css_class} nav-item" id="layout_${nav_item.getLayoutId()}" role="presentation" data-tooltip="${nav_item.getName()}">
				<a ${nav_item_attr_has_popup} class="nav-link" href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem">
				<div class="nav-link-icon">
                  <@liferay_theme["layout-icon"] layout=nav_item_layout />
                </div>
				</a>

				<#if nav_item.hasChildren()>
					<ul class="child-menu" role="menu">
						<#list nav_item.getChildren() as nav_child>
							<#assign
								nav_child_css_class = ""
							/>

							<#if nav_item.isSelected()>
								<#assign
									nav_child_css_class = "selected"
								/>
							</#if>

							<li class="${nav_child_css_class}" id="layout_${nav_child.getLayoutId()}" role="presentation">
								<a href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">${nav_child.getName()}</a>
							</li>
						</#list>
					</ul>
				</#if>
			</li>
		</#list>
	</ul> -->



</nav>