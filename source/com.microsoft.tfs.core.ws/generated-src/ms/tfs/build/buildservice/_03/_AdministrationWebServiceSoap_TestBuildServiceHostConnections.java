// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_TestBuildServiceHostConnections;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AdministrationWebServiceSoap_TestBuildServiceHostConnections
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String hostUri;

    public _AdministrationWebServiceSoap_TestBuildServiceHostConnections()
    {
        super();
    }

    public _AdministrationWebServiceSoap_TestBuildServiceHostConnections(final String hostUri)
    {
        // TODO : Call super() instead of setting all fields directly?
        setHostUri(hostUri);
    }

    public String getHostUri()
    {
        return this.hostUri;
    }

    public void setHostUri(String value)
    {
        this.hostUri = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "hostUri",
            this.hostUri);

        writer.writeEndElement();
    }
}
