package model

data class CategoryFilter(
    var roleId: CategoryId = CategoryId.NONE,
    var title: String = ""
) : ContextFilter
