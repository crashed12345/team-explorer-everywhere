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

import ms.tfs.build.buildservice._03._BuildDefinition;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._BuildWebServiceSoap_AddBuildDefinitions;
import ms.tfs.build.buildservice._03._ContinuousIntegrationType;
import ms.tfs.build.buildservice._03._DeleteOptions;
import ms.tfs.build.buildservice._03._ProcessTemplate;
import ms.tfs.build.buildservice._03._ProcessTemplateType;
import ms.tfs.build.buildservice._03._RetentionPolicy;
import ms.tfs.build.buildservice._03._Schedule;
import ms.tfs.build.buildservice._03._ScheduleDays;
import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;
import ms.tfs.build.buildservice._03._WorkspaceTemplate;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildWebServiceSoap_AddBuildDefinitions
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildDefinition[] definitions;

    public _BuildWebServiceSoap_AddBuildDefinitions()
    {
        super();
    }

    public _BuildWebServiceSoap_AddBuildDefinitions(final _BuildDefinition[] definitions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDefinitions(definitions);
    }

    public _BuildDefinition[] getDefinitions()
    {
        return this.definitions;
    }

    public void setDefinitions(_BuildDefinition[] value)
    {
        this.definitions = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.definitions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("definitions");

            for (int iterator0 = 0; iterator0 < this.definitions.length; iterator0++)
            {
                this.definitions[iterator0].writeAsElement(
                    writer,
                    "BuildDefinition");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
