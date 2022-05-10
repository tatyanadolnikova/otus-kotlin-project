package model

import NONE
import kotlinx.datetime.Instant

data class Context(
    var command: Command = Command.NONE,
    var state: AppState = AppState.NONE,
    val errors: MutableList<ResponseError> = mutableListOf(),
    var workMode: AppMode = AppMode.PROD,
    var stubCase: Stub = Stub.NONE,
    var requestId: RequestId = RequestId.NONE,
    var timeStart: Instant = Instant.NONE,

    var request: ContextRequest? = null,
    var filter: ContextFilter? = null,
    var response: ContextResponse? = null,
    var responses: MutableList<ContextResponse?> = mutableListOf(),
)

sealed interface ContextRequest
sealed interface ContextFilter
sealed interface ContextResponse
