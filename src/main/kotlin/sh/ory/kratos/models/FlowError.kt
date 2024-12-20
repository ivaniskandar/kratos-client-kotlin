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
 * 
 *
 * @param id ID of the error container.
 * @param createdAt CreatedAt is a helper struct field for gobuffalo.pop.
 * @param error 
 * @param updatedAt UpdatedAt is a helper struct field for gobuffalo.pop.
 */
@Serializable

data class FlowError (

    /* ID of the error container. */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* CreatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant? = null,

    @Contextual @SerialName(value = "error")
    val error: JsonObject? = null,

    /* UpdatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant? = null

) {


}
