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
import kotlinx.serialization.json.JsonObject

/**
 * Update Recovery Flow with Code Method
 *
 * @param code Code from the recovery email  If you want to submit a code, use this field, but make sure to _not_ include the email field, as well.
 * @param csrfToken Sending the anti-csrf token is only required for browser login flows.
 * @param email The email address of the account to recover  If the email belongs to a valid account, a recovery email will be sent.  If you want to notify the email address if the account does not exist, see the [notify_unknown_recipients flag](https://www.ory.sh/docs/kratos/self-service/flows/account-recovery-password-reset#attempted-recovery-notifications)  If a code was already sent, including this field in the payload will invalidate the sent code and re-send a new code.  format: email
 * @param transientPayload Transient data to pass along to any webhooks
 */
@Serializable
@SerialName("code")
data class UpdateRecoveryFlowWithCodeMethod (

    /* Code from the recovery email  If you want to submit a code, use this field, but make sure to _not_ include the email field, as well. */
    @SerialName(value = "code")
    val code: kotlin.String? = null,

    /* Sending the anti-csrf token is only required for browser login flows. */
    @SerialName(value = "csrf_token")
    val csrfToken: kotlin.String? = null,

    /* The email address of the account to recover  If the email belongs to a valid account, a recovery email will be sent.  If you want to notify the email address if the account does not exist, see the [notify_unknown_recipients flag](https://www.ory.sh/docs/kratos/self-service/flows/account-recovery-password-reset#attempted-recovery-notifications)  If a code was already sent, including this field in the payload will invalidate the sent code and re-send a new code.  format: email */
    @SerialName(value = "email")
    val email: kotlin.String? = null,

    /* Transient data to pass along to any webhooks */
    @Contextual @SerialName(value = "transient_payload")
    val transientPayload: JsonObject? = null

) : UpdateRecoveryFlowBody