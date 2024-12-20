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
 * Create Identity and Import Social Sign In Credentials Configuration
 *
 * @param provider The OpenID Connect provider to link the subject to. Usually something like `google` or `github`.
 * @param subject The subject (`sub`) of the OpenID Connect connection. Usually the `sub` field of the ID Token.
 */
@Serializable

data class IdentityWithCredentialsOidcConfigProvider (

    /* The OpenID Connect provider to link the subject to. Usually something like `google` or `github`. */
    @SerialName(value = "provider")
    val provider: kotlin.String,

    /* The subject (`sub`) of the OpenID Connect connection. Usually the `sub` field of the ID Token. */
    @SerialName(value = "subject")
    val subject: kotlin.String

) {


}

