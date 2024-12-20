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
 * Create Identity and Import Password Credentials Configuration
 *
 * @param hashedPassword The hashed password in [PHC format](https://www.ory.sh/docs/kratos/manage-identities/import-user-accounts-identities#hashed-passwords)
 * @param password The password in plain text if no hash is available.
 * @param usePasswordMigrationHook If set to true, the password will be migrated using the password migration hook.
 */
@Serializable

data class IdentityWithCredentialsPasswordConfig (

    /* The hashed password in [PHC format](https://www.ory.sh/docs/kratos/manage-identities/import-user-accounts-identities#hashed-passwords) */
    @SerialName(value = "hashed_password")
    val hashedPassword: kotlin.String? = null,

    /* The password in plain text if no hash is available. */
    @SerialName(value = "password")
    val password: kotlin.String? = null,

    /* If set to true, the password will be migrated using the password migration hook. */
    @SerialName(value = "use_password_migration_hook")
    val usePasswordMigrationHook: kotlin.Boolean? = null

) {


}

