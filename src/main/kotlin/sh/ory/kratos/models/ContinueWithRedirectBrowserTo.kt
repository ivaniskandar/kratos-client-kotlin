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
 * Indicates, that the UI flow could be continued by showing a recovery ui
 *
 * @param redirectBrowserTo The URL to redirect the browser to
 */
@Serializable
@SerialName("redirect_browser_to")
data class ContinueWithRedirectBrowserTo (

    /* The URL to redirect the browser to */
    @SerialName(value = "redirect_browser_to")
    val redirectBrowserTo: kotlin.String

): ContinueWith
