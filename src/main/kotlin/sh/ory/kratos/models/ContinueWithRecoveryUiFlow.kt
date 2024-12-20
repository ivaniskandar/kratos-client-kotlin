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

/**
 * 
 *
 * @param id The ID of the recovery flow
 * @param url The URL of the recovery flow  If this value is set, redirect the user's browser to this URL. This value is typically unset for native clients / API flows.
 */
@Serializable
data class ContinueWithRecoveryUiFlow (

    /* The ID of the recovery flow */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* The URL of the recovery flow  If this value is set, redirect the user's browser to this URL. This value is typically unset for native clients / API flows. */
    @SerialName(value = "url")
    val url: kotlin.String? = null

)