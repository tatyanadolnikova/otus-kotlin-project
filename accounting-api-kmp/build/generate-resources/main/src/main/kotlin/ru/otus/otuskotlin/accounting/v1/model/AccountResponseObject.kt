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

import ru.otus.otuskotlin.accounting.v1.model.BaseAccountUpdateable
import ru.otus.otuskotlin.accounting.v1.model.UserResponseObjectAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param contractId 
 * @param ownerName 
 * @param accountNumber 
 * @param bic 
 * @param recipientBankId 
 * @param correspondentAccountNumber 
 * @param inn 
 * @param currency 
 * @param id 
 */

data class AccountResponseObject (

    @field:JsonProperty("contractId")
    val contractId: kotlin.String? = null,

    @field:JsonProperty("ownerName")
    val ownerName: kotlin.String? = null,

    @field:JsonProperty("accountNumber")
    val accountNumber: kotlin.String? = null,

    @field:JsonProperty("bic")
    val bic: kotlin.String? = null,

    @field:JsonProperty("recipientBankId")
    val recipientBankId: kotlin.String? = null,

    @field:JsonProperty("correspondentAccountNumber")
    val correspondentAccountNumber: kotlin.String? = null,

    @field:JsonProperty("inn")
    val inn: kotlin.String? = null,

    @field:JsonProperty("currency")
    val currency: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null

)
