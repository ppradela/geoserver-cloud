/* (c) 2020 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.cloud.wfs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.geoserver.ows.Dispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
public @Controller class WFSController {

    private @Autowired Dispatcher geoserverDispatcher;

    @RequestMapping(method = RequestMethod.GET, path = "/wfs")
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        geoserverDispatcher.handleRequest(request, response);
    }
}
