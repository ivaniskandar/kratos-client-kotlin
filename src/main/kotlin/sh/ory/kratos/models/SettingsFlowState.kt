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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The experimental state represents the state of a settings flow. This field is EXPERIMENTAL and subject to change!
 *
 * Values: SHOW_FORM,SUCCESS
 */
@Serializable
enum class SettingsFlowState(val value: kotlin.String) {

    @SerialName(value = "show_form")
    SHOW_FORM("show_form"),

    @SerialName(value = "success")
    SUCCESS("success");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SettingsFlowState) "$data" else null

        /**
         * Returns a valid [SettingsFlowState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SettingsFlowState? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

