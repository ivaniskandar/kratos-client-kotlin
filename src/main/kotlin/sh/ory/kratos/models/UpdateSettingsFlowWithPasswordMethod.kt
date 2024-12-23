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
 * Update Settings Flow with Password Method
 *
 * @param password Password is the updated password
 * @param csrfToken CSRFToken is the anti-CSRF token
 * @param transientPayload Transient data to pass along to any webhooks
 */
@Serializable
@SerialName("password")
data class UpdateSettingsFlowWithPasswordMethod (

    /* Password is the updated password */
    @SerialName(value = "password")
    val password: kotlin.String,

    /* CSRFToken is the anti-CSRF token */
    @SerialName(value = "csrf_token")
    val csrfToken: kotlin.String? = null,

    /* Transient data to pass along to any webhooks */
    @Contextual @SerialName(value = "transient_payload")
    val transientPayload: JsonObject? = null

) : UpdateSettingsFlowBody