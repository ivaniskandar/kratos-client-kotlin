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
import sh.ory.kratos.models.OAuth2LoginRequest
import sh.ory.kratos.models.UiContainer

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import kotlinx.serialization.json.JsonObject

/**
 * This object represents a login flow. A login flow is initiated at the \"Initiate Login API / Browser Flow\" endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
 *
 * @param expiresAt ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
 * @param id ID represents the flow's unique ID. When performing the login flow, this represents the id in the login UI's query parameter: http://<selfservice.flows.login.ui_url>/?flow=<flow_id>
 * @param issuedAt IssuedAt is the time (UTC) when the flow started.
 * @param requestUrl RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
 * @param state State represents the state of this request:  choose_method: ask the user to choose a method to sign in with sent_email: the email has been sent to the user passed_challenge: the request was successful and the login challenge was passed.
 * @param type The flow type can either be `api` or `browser`.
 * @param ui 
 * @param active The active login method  If set contains the login method used. If the flow is new, it is unset. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
 * @param createdAt CreatedAt is a helper struct field for gobuffalo.pop.
 * @param oauth2LoginChallenge Ory OAuth 2.0 Login Challenge.  This value is set using the `login_challenge` query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.
 * @param oauth2LoginRequest 
 * @param organizationId 
 * @param refresh Refresh stores whether this login flow should enforce re-authentication.
 * @param requestedAal 
 * @param returnTo ReturnTo contains the requested return_to URL.
 * @param sessionTokenExchangeCode SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the login flow.
 * @param transientPayload TransientPayload is used to pass data from the login to hooks and email templates
 * @param updatedAt UpdatedAt is a helper struct field for gobuffalo.pop.
 */
@Serializable

data class LoginFlow (

    /* ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated. */
    @Contextual @SerialName(value = "expires_at")
    val expiresAt: kotlinx.datetime.Instant,

    /* ID represents the flow's unique ID. When performing the login flow, this represents the id in the login UI's query parameter: http://<selfservice.flows.login.ui_url>/?flow=<flow_id> */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* IssuedAt is the time (UTC) when the flow started. */
    @Contextual @SerialName(value = "issued_at")
    val issuedAt: kotlinx.datetime.Instant,

    /* RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example. */
    @SerialName(value = "request_url")
    val requestUrl: kotlin.String,

    /* State represents the state of this request:  choose_method: ask the user to choose a method to sign in with sent_email: the email has been sent to the user passed_challenge: the request was successful and the login challenge was passed. */
    @Contextual @SerialName(value = "state")
    val state: LoginFlowState?,

    /* The flow type can either be `api` or `browser`. */
    @SerialName(value = "type")
    val type: kotlin.String,

    @SerialName(value = "ui")
    val ui: UiContainer,

    /* The active login method  If set contains the login method used. If the flow is new, it is unset. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode */
    @SerialName(value = "active")
    val active: LoginFlow.Active? = null,

    /* CreatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant? = null,

    /* Ory OAuth 2.0 Login Challenge.  This value is set using the `login_challenge` query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider. */
    @SerialName(value = "oauth2_login_challenge")
    val oauth2LoginChallenge: kotlin.String? = null,

    @SerialName(value = "oauth2_login_request")
    val oauth2LoginRequest: OAuth2LoginRequest? = null,

    @SerialName(value = "organization_id")
    val organizationId: kotlin.String? = null,

    /* Refresh stores whether this login flow should enforce re-authentication. */
    @SerialName(value = "refresh")
    val refresh: kotlin.Boolean? = null,

    @Contextual @SerialName(value = "requested_aal")
    val requestedAal: AuthenticatorAssuranceLevel? = null,

    /* ReturnTo contains the requested return_to URL. */
    @SerialName(value = "return_to")
    val returnTo: kotlin.String? = null,

    /* SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the login flow. */
    @SerialName(value = "session_token_exchange_code")
    val sessionTokenExchangeCode: kotlin.String? = null,

    /* TransientPayload is used to pass data from the login to hooks and email templates */
    @Contextual @SerialName(value = "transient_payload")
    val transientPayload: JsonObject? = null,

    /* UpdatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant? = null

) {

    /**
     * The active login method  If set contains the login method used. If the flow is new, it is unset. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
     *
     * Values: PASSWORD,OIDC,TOTP,LOOKUP_SECRET,WEBAUTHN,CODE,PASSKEY,PROFILE,LINK_RECOVERY,CODE_RECOVERY
     */
    @Serializable
    enum class Active(val value: kotlin.String) {
        @SerialName(value = "password") PASSWORD("password"),
        @SerialName(value = "oidc") OIDC("oidc"),
        @SerialName(value = "totp") TOTP("totp"),
        @SerialName(value = "lookup_secret") LOOKUP_SECRET("lookup_secret"),
        @SerialName(value = "webauthn") WEBAUTHN("webauthn"),
        @SerialName(value = "code") CODE("code"),
        @SerialName(value = "passkey") PASSKEY("passkey"),
        @SerialName(value = "profile") PROFILE("profile"),
        @SerialName(value = "link_recovery") LINK_RECOVERY("link_recovery"),
        @SerialName(value = "code_recovery") CODE_RECOVERY("code_recovery");
    }

}
