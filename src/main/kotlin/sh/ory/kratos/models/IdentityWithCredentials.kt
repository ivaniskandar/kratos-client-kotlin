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

import sh.ory.kratos.models.IdentityWithCredentialsOidc
import sh.ory.kratos.models.IdentityWithCredentialsPassword

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Create Identity and Import Credentials
 *
 * @param oidc 
 * @param password 
 */
@Serializable

data class IdentityWithCredentials (

    @SerialName(value = "oidc")
    val oidc: IdentityWithCredentialsOidc? = null,

    @SerialName(value = "password")
    val password: IdentityWithCredentialsPassword? = null

) {


}
