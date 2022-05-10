package model

data class UserFilter(
    val firstName: String = "",
    val middleName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val roleId: RoleId = RoleId.NONE
) : ContextFilter
