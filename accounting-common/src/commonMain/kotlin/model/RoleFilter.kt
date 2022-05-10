package model

data class RoleFilter(
    var roleId: RoleId = RoleId.NONE,
    var title: String = ""
) : ContextFilter
