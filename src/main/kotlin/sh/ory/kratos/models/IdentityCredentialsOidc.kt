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

import sh.ory.kratos.models.IdentityCredentialsOidcProvider

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param providers 
 */
@Serializable

data class IdentityCredentialsOidc (

    @SerialName(value = "providers")
    val providers: kotlin.collections.List<IdentityCredentialsOidcProvider>? = null

) {


}
