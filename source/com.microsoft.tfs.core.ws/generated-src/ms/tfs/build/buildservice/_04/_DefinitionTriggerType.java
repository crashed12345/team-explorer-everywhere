// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _DefinitionTriggerType
    extends FlagSet
{
    /**
     * Constructs a _DefinitionTriggerType with no flags initially set.
     */
    public _DefinitionTriggerType()
    {
        super();
    }

    /**
     * Constructs a _DefinitionTriggerType with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _DefinitionTriggerType(final _DefinitionTriggerType_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _DefinitionTriggerType with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _DefinitionTriggerType(final String[] flagStrings)
    {
        super(flagStrings);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.microsoft.tfs.core.ws.runtime.types.FlagSet\#findFlagInstance(java.lang
     * .String)
     */
    protected Flag findFlagInstance(final String value)
        throws SOAPSerializationException
    {
        return _DefinitionTriggerType_Flag.fromString(
            value,
            _DefinitionTriggerType_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _DefinitionTriggerType_Flag[] getFlags()
    {
        return (_DefinitionTriggerType_Flag[]) this.toArray(new _DefinitionTriggerType_Flag[this.size()]);
    }

    public boolean add(_DefinitionTriggerType_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_DefinitionTriggerType_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_DefinitionTriggerType_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _DefinitionTriggerType.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _DefinitionTriggerType_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _DefinitionTriggerType_Flag None = new _DefinitionTriggerType_Flag("None");
        public static final _DefinitionTriggerType_Flag ContinuousIntegration = new _DefinitionTriggerType_Flag(
                    "ContinuousIntegration");
        public static final _DefinitionTriggerType_Flag BatchedContinuousIntegration = new _DefinitionTriggerType_Flag(
                    "BatchedContinuousIntegration");
        public static final _DefinitionTriggerType_Flag Schedule = new _DefinitionTriggerType_Flag("Schedule");
        public static final _DefinitionTriggerType_Flag ScheduleForced = new _DefinitionTriggerType_Flag(
                "ScheduleForced");
        public static final _DefinitionTriggerType_Flag GatedCheckIn = new _DefinitionTriggerType_Flag("GatedCheckIn");
        public static final _DefinitionTriggerType_Flag BatchedGatedCheckIn = new _DefinitionTriggerType_Flag(
                    "BatchedGatedCheckIn");
        public static final _DefinitionTriggerType_Flag All = new _DefinitionTriggerType_Flag("All");

        protected _DefinitionTriggerType_Flag(final String name)
        {
            super(name, _DefinitionTriggerType_Flag.VALUES_TO_INSTANCES);
        }
    }
}
