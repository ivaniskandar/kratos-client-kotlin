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

package sh.ory.kratos.models

import sh.ory.kratos.models.AuthenticatorAssuranceLevel
import sh.ory.kratos.models.Identity
import sh.ory.kratos.models.SessionAuthenticationMethod
import sh.ory.kratos.models.SessionDevice

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A Session
 *
 * @param id Session ID
 * @param active Active state. If false the session is no longer active.
 * @param authenticatedAt The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
 * @param authenticationMethods A list of authenticators which were used to authenticate the session.
 * @param authenticatorAssuranceLevel 
 * @param devices Devices has history of all endpoints where the session was used
 * @param expiresAt The Session Expiry  When this session expires at.
 * @param identity 
 * @param issuedAt The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.
 * @param tokenized Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the `tokenize` query parameter was set to a valid tokenize template during calls to `/session/whoami`.
 */
@Serializable

data class Session (

    /* Session ID */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* Active state. If false the session is no longer active. */
    @SerialName(value = "active")
    val active: kotlin.Boolean? = null,

    /* The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed). */
    @Contextual @SerialName(value = "authenticated_at")
    val authenticatedAt: kotlinx.datetime.Instant? = null,

    /* A list of authenticators which were used to authenticate the session. */
    @SerialName(value = "authentication_methods")
    val authenticationMethods: kotlin.collections.List<SessionAuthenticationMethod>? = null,

    @Contextual @SerialName(value = "authenticator_assurance_level")
    val authenticatorAssuranceLevel: AuthenticatorAssuranceLevel? = null,

    /* Devices has history of all endpoints where the session was used */
    @SerialName(value = "devices")
    val devices: kotlin.collections.List<SessionDevice>? = null,

    /* The Session Expiry  When this session expires at. */
    @Contextual @SerialName(value = "expires_at")
    val expiresAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "identity")
    val identity: Identity? = null,

    /* The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`. */
    @Contextual @SerialName(value = "issued_at")
    val issuedAt: kotlinx.datetime.Instant? = null,

    /* Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the `tokenize` query parameter was set to a valid tokenize template during calls to `/session/whoami`. */
    @SerialName(value = "tokenized")
    val tokenized: kotlin.String? = null

) {


}
