/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ro.helator.einvoicer.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import ro.helator.einvoicer.scope.ScreenScope;

@Configuration
@ComponentScan("ro.helator.einvoicer")
//@PropertySource("config.properties")
public class AppContextConfig {
	
	private static final Logger log = Logger.getLogger(AppContextConfig.class);
	
    @Bean
    public static CustomScopeConfigurer getCustomScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        final Map<String, Object> scopeMap = new HashMap<>();
        scopeMap.put("screen", screenScope());
        configurer.setScopes(scopeMap);
        return configurer;
    }
    
    @Bean
    public static ScreenScope screenScope(){
        return new ScreenScope();
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    	if(log.isTraceEnabled()){
    		log.trace("Loading property file [config/config.properties]");
    	}
    	Properties prop = new Properties();
    	try {
			prop.load(new FileInputStream("config/config.properties"));
		} catch (FileNotFoundException e) {
			log.error("File [config/config.properties] not found!", e);
		} catch (IOException e) {
			log.error("Error while trying to load the property file!", e);
		}
    	PropertySourcesPlaceholderConfigurer propCfg = new PropertySourcesPlaceholderConfigurer();
    	propCfg.setProperties(prop);
    	return propCfg;
    }
    
}
