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

import ru.otus.otuskotlin.accounting.v1.model.TransactionResponseObject

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param transaction 
 */

data class TransactionResponseSingleAllOf (

    @field:JsonProperty("transaction")
    val transaction: TransactionResponseObject? = null

)

