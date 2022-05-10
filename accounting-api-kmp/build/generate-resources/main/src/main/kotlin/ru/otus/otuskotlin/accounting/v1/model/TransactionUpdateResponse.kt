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

import ru.otus.otuskotlin.accounting.v1.model.Error
import ru.otus.otuskotlin.accounting.v1.model.IResponse
import ru.otus.otuskotlin.accounting.v1.model.ResponseResult
import ru.otus.otuskotlin.accounting.v1.model.TransactionResponseObject
import ru.otus.otuskotlin.accounting.v1.model.TransactionResponseSingle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param responseType Поле-дескриминатор для вычисления типа запроса
 * @param requestId Идентификатор запроса для отладки
 * @param result 
 * @param errors 
 * @param transaction 
 */

data class TransactionUpdateResponse (

    /* Поле-дескриминатор для вычисления типа запроса */
    @field:JsonProperty("responseType")
    override val responseType: kotlin.String? = null,

    /* Идентификатор запроса для отладки */
    @field:JsonProperty("requestId")
    override val requestId: kotlin.String? = null,

    @field:JsonProperty("result")
    override val result: ResponseResult? = null,

    @field:JsonProperty("errors")
    override val errors: kotlin.collections.List<Error>? = null,

    @field:JsonProperty("transaction")
    val transaction: TransactionResponseObject? = null

) : IResponse

