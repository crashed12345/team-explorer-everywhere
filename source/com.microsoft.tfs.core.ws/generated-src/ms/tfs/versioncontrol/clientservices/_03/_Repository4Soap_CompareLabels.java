// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CompareLabels;

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
public class _Repository4Soap_CompareLabels
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String startLabelName;
    protected String startLabelScope;
    protected String endLabelName;
    protected String endLabelScope;
    protected int minChangeSet;
    protected int maxCount;

    public _Repository4Soap_CompareLabels()
    {
        super();
    }

    public _Repository4Soap_CompareLabels(
        final String startLabelName,
        final String startLabelScope,
        final String endLabelName,
        final String endLabelScope,
        final int minChangeSet,
        final int maxCount)
    {
        // TODO : Call super() instead of setting all fields directly?
        setStartLabelName(startLabelName);
        setStartLabelScope(startLabelScope);
        setEndLabelName(endLabelName);
        setEndLabelScope(endLabelScope);
        setMinChangeSet(minChangeSet);
        setMaxCount(maxCount);
    }

    public String getStartLabelName()
    {
        return this.startLabelName;
    }

    public void setStartLabelName(String value)
    {
        this.startLabelName = value;
    }

    public String getStartLabelScope()
    {
        return this.startLabelScope;
    }

    public void setStartLabelScope(String value)
    {
        this.startLabelScope = value;
    }

    public String getEndLabelName()
    {
        return this.endLabelName;
    }

    public void setEndLabelName(String value)
    {
        this.endLabelName = value;
    }

    public String getEndLabelScope()
    {
        return this.endLabelScope;
    }

    public void setEndLabelScope(String value)
    {
        this.endLabelScope = value;
    }

    public int getMinChangeSet()
    {
        return this.minChangeSet;
    }

    public void setMinChangeSet(int value)
    {
        this.minChangeSet = value;
    }

    public int getMaxCount()
    {
        return this.maxCount;
    }

    public void setMaxCount(int value)
    {
        this.maxCount = value;
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
            "startLabelName",
            this.startLabelName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "startLabelScope",
            this.startLabelScope);
        XMLStreamWriterHelper.writeElement(
            writer,
            "endLabelName",
            this.endLabelName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "endLabelScope",
            this.endLabelScope);
        XMLStreamWriterHelper.writeElement(
            writer,
            "minChangeSet",
            this.minChangeSet);
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxCount",
            this.maxCount);

        writer.writeEndElement();
    }
}
