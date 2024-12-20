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
 * @param id The ID of the verification flow
 * @param verifiableAddress The address that should be verified in this flow
 * @param url The URL of the verification flow  If this value is set, redirect the user's browser to this URL. This value is typically unset for native clients / API flows.
 */
@Serializable

data class ContinueWithVerificationUiFlow (

    /* The ID of the verification flow */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* The address that should be verified in this flow */
    @SerialName(value = "verifiable_address")
    val verifiableAddress: kotlin.String,

    /* The URL of the verification flow  If this value is set, redirect the user's browser to this URL. This value is typically unset for native clients / API flows. */
    @SerialName(value = "url")
    val url: kotlin.String? = null

) : ContinueWith
