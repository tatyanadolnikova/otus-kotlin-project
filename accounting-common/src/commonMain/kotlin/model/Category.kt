package model

data class Category(
    var id: CategoryId = CategoryId.NONE,
    var title: String = "",
    var description: String = ""
) : ContextRequest, ContextResponse
