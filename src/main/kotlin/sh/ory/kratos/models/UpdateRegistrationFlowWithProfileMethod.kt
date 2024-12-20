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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import kotlinx.serialization.json.JsonObject

/**
 * Update Registration Flow with Profile Method
 *
 * @param traits Traits  The identity's traits.
 * @param csrfToken The Anti-CSRF Token  This token is only required when performing browser flows.
 * @param screen Screen requests navigation to a previous screen.  This must be set to credential-selection to go back to the credential selection screen. credential-selection RegistrationScreenCredentialSelection nolint:gosec // not a credential previous RegistrationScreenPrevious
 * @param transientPayload Transient data to pass along to any webhooks
 */
@Serializable
@SerialName("profile")
data class UpdateRegistrationFlowWithProfileMethod (

    /* Traits  The identity's traits. */
    @Contextual @SerialName(value = "traits")
    val traits: JsonObject,

    /* The Anti-CSRF Token  This token is only required when performing browser flows. */
    @SerialName(value = "csrf_token")
    val csrfToken: kotlin.String? = null,

    /* Screen requests navigation to a previous screen.  This must be set to credential-selection to go back to the credential selection screen. credential-selection RegistrationScreenCredentialSelection nolint:gosec // not a credential previous RegistrationScreenPrevious */
    @SerialName(value = "screen")
    val screen: UpdateRegistrationFlowWithProfileMethod.Screen? = null,

    /* Transient data to pass along to any webhooks */
    @Contextual @SerialName(value = "transient_payload")
    val transientPayload: JsonObject? = null

) : UpdateRegistrationFlowBody {

    /**
     * Screen requests navigation to a previous screen.  This must be set to credential-selection to go back to the credential selection screen. credential-selection RegistrationScreenCredentialSelection nolint:gosec // not a credential previous RegistrationScreenPrevious
     *
     * Values: CREDENTIAL_MINUS_SELECTION,PREVIOUS
     */
    @Serializable
    enum class Screen(val value: kotlin.String) {
        @SerialName(value = "credential-selection") CREDENTIAL_MINUS_SELECTION("credential-selection"),
        @SerialName(value = "previous") PREVIOUS("previous");
    }

}
