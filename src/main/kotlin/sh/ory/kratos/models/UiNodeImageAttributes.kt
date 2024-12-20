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
 * @param height Height of the image
 * @param id A unique identifier
 * @param src The image's source URL.  format: uri
 * @param width Width of the image
 */
@Serializable
@SerialName("img")
data class UiNodeImageAttributes (

    /* Height of the image */
    @SerialName(value = "height")
    val height: kotlin.Long,

    /* A unique identifier */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* The image's source URL.  format: uri */
    @SerialName(value = "src")
    val src: kotlin.String,

    /* Width of the image */
    @SerialName(value = "width")
    val width: kotlin.Long

) : UiNodeAttributes
