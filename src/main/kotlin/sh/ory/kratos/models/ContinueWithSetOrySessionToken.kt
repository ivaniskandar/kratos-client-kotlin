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
 * Indicates that a session was issued, and the application should use this token for authenticated requests
 *
 * @param orySessionToken Token is the token of the session
 */
@Serializable
@SerialName("set_ory_session_token")
data class ContinueWithSetOrySessionToken (

    /* Token is the token of the session */
    @SerialName(value = "ory_session_token")
    val orySessionToken: kotlin.String

) : ContinueWith