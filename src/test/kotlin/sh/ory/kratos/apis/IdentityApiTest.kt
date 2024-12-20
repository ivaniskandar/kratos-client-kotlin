/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.kratos.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.kratos.apis.IdentityApi
import sh.ory.kratos.models.BatchPatchIdentitiesResponse
import sh.ory.kratos.models.CreateIdentityBody
import sh.ory.kratos.models.CreateRecoveryCodeForIdentityBody
import sh.ory.kratos.models.CreateRecoveryLinkForIdentityBody
import sh.ory.kratos.models.ErrorGeneric
import sh.ory.kratos.models.Identity
import sh.ory.kratos.models.IdentitySchemaContainer
import sh.ory.kratos.models.JsonPatch
import sh.ory.kratos.models.PatchIdentitiesBody
import sh.ory.kratos.models.RecoveryCodeForIdentity
import sh.ory.kratos.models.RecoveryLinkForIdentity
import sh.ory.kratos.models.Session
import sh.ory.kratos.models.UpdateIdentityBody

class IdentityApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IdentityApi
        //val apiInstance = IdentityApi()

        // to test batchPatchIdentities
        should("test batchPatchIdentities") {
            // uncomment below to test batchPatchIdentities
            //val patchIdentitiesBody : PatchIdentitiesBody =  // PatchIdentitiesBody | 
            //val result : BatchPatchIdentitiesResponse = apiInstance.batchPatchIdentities(patchIdentitiesBody)
            //result shouldBe ("TODO")
        }

        // to test createIdentity
        should("test createIdentity") {
            // uncomment below to test createIdentity
            //val createIdentityBody : CreateIdentityBody =  // CreateIdentityBody | 
            //val result : Identity = apiInstance.createIdentity(createIdentityBody)
            //result shouldBe ("TODO")
        }

        // to test createRecoveryCodeForIdentity
        should("test createRecoveryCodeForIdentity") {
            // uncomment below to test createRecoveryCodeForIdentity
            //val createRecoveryCodeForIdentityBody : CreateRecoveryCodeForIdentityBody =  // CreateRecoveryCodeForIdentityBody | 
            //val result : RecoveryCodeForIdentity = apiInstance.createRecoveryCodeForIdentity(createRecoveryCodeForIdentityBody)
            //result shouldBe ("TODO")
        }

        // to test createRecoveryLinkForIdentity
        should("test createRecoveryLinkForIdentity") {
            // uncomment below to test createRecoveryLinkForIdentity
            //val returnTo : kotlin.String = returnTo_example // kotlin.String | 
            //val createRecoveryLinkForIdentityBody : CreateRecoveryLinkForIdentityBody =  // CreateRecoveryLinkForIdentityBody | 
            //val result : RecoveryLinkForIdentity = apiInstance.createRecoveryLinkForIdentity(returnTo, createRecoveryLinkForIdentityBody)
            //result shouldBe ("TODO")
        }

        // to test deleteIdentity
        should("test deleteIdentity") {
            // uncomment below to test deleteIdentity
            //val id : kotlin.String = id_example // kotlin.String | ID is the identity's ID.
            //apiInstance.deleteIdentity(id)
        }

        // to test deleteIdentityCredentials
        should("test deleteIdentityCredentials") {
            // uncomment below to test deleteIdentityCredentials
            //val id : kotlin.String = id_example // kotlin.String | ID is the identity's ID.
            //val type : kotlin.String = type_example // kotlin.String | Type is the type of credentials to delete. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
            //val identifier : kotlin.String = identifier_example // kotlin.String | Identifier is the identifier of the OIDC credential to delete. Find the identifier by calling the `GET /admin/identities/{id}?include_credential=oidc` endpoint.
            //apiInstance.deleteIdentityCredentials(id, type, identifier)
        }

        // to test deleteIdentitySessions
        should("test deleteIdentitySessions") {
            // uncomment below to test deleteIdentitySessions
            //val id : kotlin.String = id_example // kotlin.String | ID is the identity's ID.
            //apiInstance.deleteIdentitySessions(id)
        }

        // to test disableSession
        should("test disableSession") {
            // uncomment below to test disableSession
            //val id : kotlin.String = id_example // kotlin.String | ID is the session's ID.
            //apiInstance.disableSession(id)
        }

        // to test extendSession
        should("test extendSession") {
            // uncomment below to test extendSession
            //val id : kotlin.String = id_example // kotlin.String | ID is the session's ID.
            //val result : Session = apiInstance.extendSession(id)
            //result shouldBe ("TODO")
        }

        // to test getIdentity
        should("test getIdentity") {
            // uncomment below to test getIdentity
            //val id : kotlin.String = id_example // kotlin.String | ID must be set to the ID of identity you want to get
            //val includeCredential : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Include Credentials in Response  Include any credential, for example `password` or `oidc`, in the response. When set to `oidc`, This will return the initial OAuth 2.0 Access Token, OAuth 2.0 Refresh Token and the OpenID Connect ID Token if available.
            //val result : Identity = apiInstance.getIdentity(id, includeCredential)
            //result shouldBe ("TODO")
        }

        // to test getIdentitySchema
        should("test getIdentitySchema") {
            // uncomment below to test getIdentitySchema
            //val id : kotlin.String = id_example // kotlin.String | ID must be set to the ID of schema you want to get
            //val result : kotlin.Any = apiInstance.getIdentitySchema(id)
            //result shouldBe ("TODO")
        }

        // to test getSession
        should("test getSession") {
            // uncomment below to test getSession
            //val id : kotlin.String = id_example // kotlin.String | ID is the session's ID.
            //val expand : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | ExpandOptions is a query parameter encoded list of all properties that must be expanded in the Session. Example - ?expand=Identity&expand=Devices If no value is provided, the expandable properties are skipped.
            //val result : Session = apiInstance.getSession(id, expand)
            //result shouldBe ("TODO")
        }

        // to test listIdentities
        should("test listIdentities") {
            // uncomment below to test listIdentities
            //val perPage : kotlin.Long = 789 // kotlin.Long | Deprecated Items per Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This is the number of items per page.
            //val page : kotlin.Long = 789 // kotlin.Long | Deprecated Pagination Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist. The first page can be retrieved by omitting this parameter. Following page pointers will be returned in the `Link` header.
            //val pageSize : kotlin.Long = 789 // kotlin.Long | Page Size  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val pageToken : kotlin.String = pageToken_example // kotlin.String | Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val consistency : kotlin.String = consistency_example // kotlin.String | Read Consistency Level (preview)  The read consistency level determines the consistency guarantee for reads:  strong (slow): The read is guaranteed to return the most recent data committed at the start of the read. eventual (very fast): The result will return data that is about 4.8 seconds old.  The default consistency guarantee can be changed in the Ory Network Console or using the Ory CLI with `ory patch project --replace '/previews/default_read_consistency_level=\"strong\"'`.  Setting the default consistency level to `eventual` may cause regressions in the future as we add consistency controls to more APIs. Currently, the following APIs will be affected by this setting:  `GET /admin/identities`  This feature is in preview and only available in Ory Network.  ConsistencyLevelUnset  ConsistencyLevelUnset is the unset / default consistency level. strong ConsistencyLevelStrong  ConsistencyLevelStrong is the strong consistency level. eventual ConsistencyLevelEventual  ConsistencyLevelEventual is the eventual consistency level using follower read timestamps.
            //val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of ids used to filter identities. If this list is empty, then no filter will be applied.
            //val credentialsIdentifier : kotlin.String = credentialsIdentifier_example // kotlin.String | CredentialsIdentifier is the identifier (username, email) of the credentials to look up using exact match. Only one of CredentialsIdentifier and CredentialsIdentifierSimilar can be used.
            //val previewCredentialsIdentifierSimilar : kotlin.String = previewCredentialsIdentifierSimilar_example // kotlin.String | This is an EXPERIMENTAL parameter that WILL CHANGE. Do NOT rely on consistent, deterministic behavior. THIS PARAMETER WILL BE REMOVED IN AN UPCOMING RELEASE WITHOUT ANY MIGRATION PATH.  CredentialsIdentifierSimilar is the (partial) identifier (username, email) of the credentials to look up using similarity search. Only one of CredentialsIdentifier and CredentialsIdentifierSimilar can be used.
            //val includeCredential : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Include Credentials in Response  Include any credential, for example `password` or `oidc`, in the response. When set to `oidc`, This will return the initial OAuth 2.0 Access Token, OAuth 2.0 Refresh Token and the OpenID Connect ID Token if available.
            //val result : kotlin.collections.List<Identity> = apiInstance.listIdentities(perPage, page, pageSize, pageToken, consistency, ids, credentialsIdentifier, previewCredentialsIdentifierSimilar, includeCredential)
            //result shouldBe ("TODO")
        }

        // to test listIdentitySchemas
        should("test listIdentitySchemas") {
            // uncomment below to test listIdentitySchemas
            //val perPage : kotlin.Long = 789 // kotlin.Long | Deprecated Items per Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This is the number of items per page.
            //val page : kotlin.Long = 789 // kotlin.Long | Deprecated Pagination Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist. The first page can be retrieved by omitting this parameter. Following page pointers will be returned in the `Link` header.
            //val pageSize : kotlin.Long = 789 // kotlin.Long | Page Size  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val pageToken : kotlin.String = pageToken_example // kotlin.String | Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val result : kotlin.collections.List<IdentitySchemaContainer> = apiInstance.listIdentitySchemas(perPage, page, pageSize, pageToken)
            //result shouldBe ("TODO")
        }

        // to test listIdentitySessions
        should("test listIdentitySessions") {
            // uncomment below to test listIdentitySessions
            //val id : kotlin.String = id_example // kotlin.String | ID is the identity's ID.
            //val perPage : kotlin.Long = 789 // kotlin.Long | Deprecated Items per Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This is the number of items per page.
            //val page : kotlin.Long = 789 // kotlin.Long | Deprecated Pagination Page  DEPRECATED: Please use `page_token` instead. This parameter will be removed in the future.  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist. The first page can be retrieved by omitting this parameter. Following page pointers will be returned in the `Link` header.
            //val pageSize : kotlin.Long = 789 // kotlin.Long | Page Size  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val pageToken : kotlin.String = pageToken_example // kotlin.String | Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val active : kotlin.Boolean = true // kotlin.Boolean | Active is a boolean flag that filters out sessions based on the state. If no value is provided, all sessions are returned.
            //val result : kotlin.collections.List<Session> = apiInstance.listIdentitySessions(id, perPage, page, pageSize, pageToken, active)
            //result shouldBe ("TODO")
        }

        // to test listSessions
        should("test listSessions") {
            // uncomment below to test listSessions
            //val pageSize : kotlin.Long = 789 // kotlin.Long | Items per Page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val pageToken : kotlin.String = pageToken_example // kotlin.String | Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val active : kotlin.Boolean = true // kotlin.Boolean | Active is a boolean flag that filters out sessions based on the state. If no value is provided, all sessions are returned.
            //val expand : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | ExpandOptions is a query parameter encoded list of all properties that must be expanded in the Session. If no value is provided, the expandable properties are skipped.
            //val result : kotlin.collections.List<Session> = apiInstance.listSessions(pageSize, pageToken, active, expand)
            //result shouldBe ("TODO")
        }

        // to test patchIdentity
        should("test patchIdentity") {
            // uncomment below to test patchIdentity
            //val id : kotlin.String = id_example // kotlin.String | ID must be set to the ID of identity you want to update
            //val jsonPatch : kotlin.collections.List<JsonPatch> =  // kotlin.collections.List<JsonPatch> | 
            //val result : Identity = apiInstance.patchIdentity(id, jsonPatch)
            //result shouldBe ("TODO")
        }

        // to test updateIdentity
        should("test updateIdentity") {
            // uncomment below to test updateIdentity
            //val id : kotlin.String = id_example // kotlin.String | ID must be set to the ID of identity you want to update
            //val updateIdentityBody : UpdateIdentityBody =  // UpdateIdentityBody | 
            //val result : Identity = apiInstance.updateIdentity(id, updateIdentityBody)
            //result shouldBe ("TODO")
        }

    }
}
