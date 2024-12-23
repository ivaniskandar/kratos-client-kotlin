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

import sh.ory.kratos.models.IdentityPatchResponse

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Patch identities response
 *
 * @param identities The patch responses for the individual identities.
 */
@Serializable

data class BatchPatchIdentitiesResponse (

    /* The patch responses for the individual identities. */
    @SerialName(value = "identities")
    val identities: kotlin.collections.List<IdentityPatchResponse>? = null

) {


}

