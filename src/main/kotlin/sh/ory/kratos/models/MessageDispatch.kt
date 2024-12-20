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
 * MessageDispatch represents an attempt of sending a courier message It contains the status of the attempt (failed or successful) and the error if any occured
 *
 * @param createdAt CreatedAt is a helper struct field for gobuffalo.pop.
 * @param id The ID of this message dispatch
 * @param messageId The ID of the message being dispatched
 * @param status The status of this dispatch Either \"failed\" or \"success\" failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
 * @param updatedAt UpdatedAt is a helper struct field for gobuffalo.pop.
 * @param error 
 */
@Serializable

data class MessageDispatch (

    /* CreatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* The ID of this message dispatch */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* The ID of the message being dispatched */
    @SerialName(value = "message_id")
    val messageId: kotlin.String,

    /* The status of this dispatch Either \"failed\" or \"success\" failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess */
    @SerialName(value = "status")
    val status: MessageDispatch.Status,

    /* UpdatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "error")
    val error: JsonObject? = null

) {

    /**
     * The status of this dispatch Either \"failed\" or \"success\" failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
     *
     * Values: FAILED,SUCCESS
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "failed") FAILED("failed"),
        @SerialName(value = "success") SUCCESS("success");
    }

}
