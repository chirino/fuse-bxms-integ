/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.camel.component;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfConstants;

public class PreCxfrs
    implements
    Processor {
    public void process(Exchange exchange) throws Exception {
        exchange.setPattern( ExchangePattern.InOut );
        Message inMessage = exchange.getIn();
        inMessage.setHeader( CxfConstants.CAMEL_CXF_RS_USING_HTTP_API,
                             Boolean.TRUE );
        inMessage.setHeader( Exchange.HTTP_METHOD,
                             "POST" );
        inMessage.setHeader( Exchange.HTTP_PATH,
                             "/execute" );
        inMessage.setHeader( Exchange.ACCEPT_CONTENT_TYPE,
                             "text/plain" );
        inMessage.setHeader( Exchange.CONTENT_TYPE,
                             "text/plain" );
    }
}
