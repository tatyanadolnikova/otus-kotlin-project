/**
 * Accounting
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ru.otus.otuskotlin.accounting.v1.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * Values: WITHDRAWAL,PAYMENT,REFILL
 */

enum class TransactionType(val value: kotlin.String) {

    @JsonProperty(value = "withdrawal")
    WITHDRAWAL("withdrawal"),

    @JsonProperty(value = "payment")
    PAYMENT("payment"),

    @JsonProperty(value = "refill")
    REFILL("refill");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TransactionType) "$data" else null

        /**
         * Returns a valid [TransactionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TransactionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
