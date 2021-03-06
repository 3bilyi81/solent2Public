/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.impl.web;

import org.solent.com504.factoryandfacade.impl.service.ServiceObjectFactoryImpl;
import org.solent.com504.factoryandfacade.model.service.FarmFacade;
import org.solent.com504.factoryandfacade.model.service.ServiceObjectFactory;

/**
 *
 * @author gallenc
 */
public class WebObjectFactory {

    
    private static FarmFacade farmFacade = null;

    public static FarmFacade getServiceFacade() {
        if (farmFacade == null) {
            synchronized (WebObjectFactory.class) {
                if (farmFacade == null) {
                    ServiceObjectFactory serviceObjectFactory = new ServiceObjectFactoryImpl();
                    farmFacade = serviceObjectFactory.getFarmFacade();
                }
            }
        }
        return farmFacade;
    }

}
