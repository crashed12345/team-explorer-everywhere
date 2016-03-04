// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.authorization._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.authorization._03._AuthorizationServiceSoap_IsPermittedByActionListResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AuthorizationServiceSoap_IsPermittedByActionListResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected boolean[] isPermittedByActionListResult;

    public _AuthorizationServiceSoap_IsPermittedByActionListResponse()
    {
        super();
    }

    public _AuthorizationServiceSoap_IsPermittedByActionListResponse(final boolean[] isPermittedByActionListResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setIsPermittedByActionListResult(isPermittedByActionListResult);
    }

    public boolean[] getIsPermittedByActionListResult()
    {
        return this.isPermittedByActionListResult;
    }

    public void setIsPermittedByActionListResult(boolean[] value)
    {
        this.isPermittedByActionListResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("IsPermittedByActionListResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(new Boolean(XMLConvert.toBoolean(reader.getElementText())));
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.isPermittedByActionListResult = (boolean[]) PrimitiveArrayHelpers.toArray(
                            list0,
                            Boolean.TYPE);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}