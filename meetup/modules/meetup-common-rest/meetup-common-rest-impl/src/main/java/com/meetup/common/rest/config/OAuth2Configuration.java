package com.meetup.common.rest.config;


import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition.Scope;

import aQute.bnd.annotation.metatype.Meta.AD;
import aQute.bnd.annotation.metatype.Meta.OCD;

/**
 * The Interface OAuth2Configuration.
 */
@ExtendedObjectClassDefinition(category = "meetup-configuration", scope = Scope.SYSTEM)
@OCD(id = "com.meetup.common.rest.config.OAuth2Configuration", localization = "content/Language", name = "OAuth2 Configuration")
public interface OAuth2Configuration {

  
   @AD(deflt = "", name = "Client Id", description = "Client Id for OAuth Token", required = false)
   public String getClientId();

   /**
    * Gets the client secret.
    *
    * @return the client secret
    */
   @AD(deflt = "", name = "Client Secret", description = "Client Secret for OAuth Token", required = false)
   public String getClientSecret();
   
    
}
