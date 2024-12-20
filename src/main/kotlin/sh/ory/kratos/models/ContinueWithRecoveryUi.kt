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

import sh.ory.kratos.models.ContinueWithRecoveryUiFlow

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Indicates, that the UI flow could be continued by showing a recovery ui
 *
 * @param flow
 */
@Serializable
@SerialName("show_recovery_ui")
data class ContinueWithRecoveryUi (

    @SerialName(value = "flow")
    val flow: ContinueWithRecoveryUiFlow

) : ContinueWith
