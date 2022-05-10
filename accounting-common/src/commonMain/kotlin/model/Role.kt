package model

data class Role(
    var id: RoleId = RoleId.NONE,
    var title: String = "",
    var permissions: List<Permission> = emptyList()
) : ContextRequest, ContextResponse

