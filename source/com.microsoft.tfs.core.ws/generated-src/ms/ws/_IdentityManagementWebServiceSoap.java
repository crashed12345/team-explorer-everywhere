// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebServiceSoap_AddMemberToApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_AddMemberToApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_CreateApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_CreateApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_DeleteApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_DeleteApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_GetScopeName;
import ms.ws._IdentityManagementWebServiceSoap_GetScopeNameResponse;
import ms.ws._IdentityManagementWebServiceSoap_IsMember;
import ms.ws._IdentityManagementWebServiceSoap_IsMemberResponse;
import ms.ws._IdentityManagementWebServiceSoap_ListApplicationGroups;
import ms.ws._IdentityManagementWebServiceSoap_ListApplicationGroupsResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentities;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptor;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptorResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesById;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByIdResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesResponse;
import ms.ws._IdentityManagementWebServiceSoap_RefreshIdentity;
import ms.ws._IdentityManagementWebServiceSoap_RefreshIdentityResponse;
import ms.ws._IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_UpdateApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_UpdateApplicationGroupResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._PropertyValue;
import ms.ws._TeamFoundationIdentity;

import java.lang.Object;
import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://microsoft.com/webservices/}IdentityManagementWebServiceSoap
 */
public interface _IdentityManagementWebServiceSoap
{
    public _TeamFoundationIdentity[] readIdentitiesByDescriptor(
        final _IdentityDescriptor[] descriptors,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault;

    public _TeamFoundationIdentity[] readIdentitiesById(
        final String[] teamFoundationIds,
        final int queryMembership,
        final int features,
        final int options,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault;

    public _TeamFoundationIdentity[][] readIdentities(
        final int searchFactor,
        final String[] factorValues,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault;

    public _IdentityDescriptor createApplicationGroup(
        final String projectUri,
        final String groupName,
        final String groupDescription)
        throws TransportException, SOAPFault;

    public _TeamFoundationIdentity[] listApplicationGroups(
        final String projectUri,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault;

    public void updateApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final int groupProperty,
        final String newValue)
        throws TransportException, SOAPFault;

    public void deleteApplicationGroup(final _IdentityDescriptor groupDescriptor)
        throws TransportException, SOAPFault;

    public void addMemberToApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault;

    public void removeMemberFromApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault;

    public boolean isMember(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault;

    public boolean refreshIdentity(final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault;

    public String getScopeName(final String scopeId)
        throws TransportException, SOAPFault;
}
