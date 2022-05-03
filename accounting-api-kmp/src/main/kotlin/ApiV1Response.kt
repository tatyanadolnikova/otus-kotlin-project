package ru.otus.otuskotlin.accounting.api.v1

import ru.otus.otuskotlin.accounting.v1.model.IResponse

fun apiV1ResponseSerialize(response: IResponse): String = jacksonMapper.writeValueAsString(response)

@Suppress("UNCHECKED_CAST")
fun <T : IResponse> apiV1ResponseDeserialize(json: String): T =
    jacksonMapper.readValue(json, IResponse::class.java) as T
