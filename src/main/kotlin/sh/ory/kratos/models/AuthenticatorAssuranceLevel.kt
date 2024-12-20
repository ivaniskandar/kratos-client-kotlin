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
 * The authenticator assurance level can be one of \"aal1\", \"aal2\", or \"aal3\". A higher number means that it is harder for an attacker to compromise the account.  Generally, \"aal1\" implies that one authentication factor was used while AAL2 implies that two factors (e.g. password + TOTP) have been used.  To learn more about these levels please head over to: https://www.ory.sh/kratos/docs/concepts/credentials
 *
 * Values: AAL0,AAL1,AAL2,AAL3
 */
@Serializable
enum class AuthenticatorAssuranceLevel(val value: kotlin.String) {

    @SerialName(value = "aal0")
    AAL0("aal0"),

    @SerialName(value = "aal1")
    AAL1("aal1"),

    @SerialName(value = "aal2")
    AAL2("aal2"),

    @SerialName(value = "aal3")
    AAL3("aal3");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AuthenticatorAssuranceLevel) "$data" else null

        /**
         * Returns a valid [AuthenticatorAssuranceLevel] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AuthenticatorAssuranceLevel? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

