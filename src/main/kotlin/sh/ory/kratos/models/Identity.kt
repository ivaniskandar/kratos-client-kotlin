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

import sh.ory.kratos.models.IdentityCredentials
import sh.ory.kratos.models.RecoveryIdentityAddress
import sh.ory.kratos.models.VerifiableIdentityAddress

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import kotlinx.serialization.json.JsonObject

/**
 * An [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) represents a (human) user in Ory.
 *
 * @param id ID is the identity's unique identifier.  The Identity ID can not be changed and can not be chosen. This ensures future compatibility and optimization for distributed stores such as CockroachDB.
 * @param schemaId SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
 * @param schemaUrl SchemaURL is the URL of the endpoint where the identity's traits schema can be fetched from.  format: url
 * @param traits Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
 * @param createdAt CreatedAt is a helper struct field for gobuffalo.pop.
 * @param credentials Credentials represents all credentials that can be used for authenticating this identity.
 * @param metadataAdmin NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
 * @param metadataPublic NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
 * @param organizationId 
 * @param recoveryAddresses RecoveryAddresses contains all the addresses that can be used to recover an identity.
 * @param state State is the identity's state.  This value has currently no effect. active StateActive inactive StateInactive
 * @param stateChangedAt 
 * @param updatedAt UpdatedAt is a helper struct field for gobuffalo.pop.
 * @param verifiableAddresses VerifiableAddresses contains all the addresses that can be verified by the user.
 */
@Serializable

data class Identity (

    /* ID is the identity's unique identifier.  The Identity ID can not be changed and can not be chosen. This ensures future compatibility and optimization for distributed stores such as CockroachDB. */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. */
    @SerialName(value = "schema_id")
    val schemaId: kotlin.String,

    /* SchemaURL is the URL of the endpoint where the identity's traits schema can be fetched from.  format: url */
    @SerialName(value = "schema_url")
    val schemaUrl: kotlin.String,

    /* Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`. */
    @Contextual @SerialName(value = "traits")
    val traits: JsonObject?,

    /* CreatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant? = null,

    /* Credentials represents all credentials that can be used for authenticating this identity. */
    @Contextual @SerialName(value = "credentials")
    val credentials: kotlin.collections.Map<kotlin.String, IdentityCredentials>? = null,

    /* NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable- */
    @Contextual @SerialName(value = "metadata_admin")
    val metadataAdmin: JsonObject? = null,

    /* NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable- */
    @Contextual @SerialName(value = "metadata_public")
    val metadataPublic: JsonObject? = null,

    @SerialName(value = "organization_id")
    val organizationId: kotlin.String? = null,

    /* RecoveryAddresses contains all the addresses that can be used to recover an identity. */
    @SerialName(value = "recovery_addresses")
    val recoveryAddresses: kotlin.collections.List<RecoveryIdentityAddress>? = null,

    /* State is the identity's state.  This value has currently no effect. active StateActive inactive StateInactive */
    @SerialName(value = "state")
    val state: Identity.State? = null,

    @Contextual @SerialName(value = "state_changed_at")
    val stateChangedAt: kotlinx.datetime.Instant? = null,

    /* UpdatedAt is a helper struct field for gobuffalo.pop. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant? = null,

    /* VerifiableAddresses contains all the addresses that can be verified by the user. */
    @SerialName(value = "verifiable_addresses")
    val verifiableAddresses: kotlin.collections.List<VerifiableIdentityAddress>? = null

) {

    /**
     * State is the identity's state.  This value has currently no effect. active StateActive inactive StateInactive
     *
     * Values: ACTIVE,INACTIVE
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "active") ACTIVE("active"),
        @SerialName(value = "inactive") INACTIVE("inactive");
    }

}
