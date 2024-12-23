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

import sh.ory.kratos.models.UiText

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param id A unique identifier
 * @param text
 */
@Serializable
@SerialName("text")
data class UiNodeTextAttributes (

    /* A unique identifier */
    @SerialName(value = "id")
    val id: kotlin.String,

    @SerialName(value = "text")
    val text: UiText

) : UiNodeAttributes
