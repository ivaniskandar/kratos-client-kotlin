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
 * Update Settings Flow with Profile Method
 *
 * @param traits Traits  The identity's traits.
 * @param csrfToken The Anti-CSRF Token  This token is only required when performing browser flows.
 * @param transientPayload Transient data to pass along to any webhooks
 */
@Serializable
@SerialName("profile")
data class UpdateSettingsFlowWithProfileMethod (

    /* Traits  The identity's traits. */
    @Contextual @SerialName(value = "traits")
    val traits: JsonObject,

    /* The Anti-CSRF Token  This token is only required when performing browser flows. */
    @SerialName(value = "csrf_token")
    val csrfToken: kotlin.String? = null,

    /* Transient data to pass along to any webhooks */
    @Contextual @SerialName(value = "transient_payload")
    val transientPayload: JsonObject? = null

) : UpdateSettingsFlowBody
