package model

@JvmInline
value class RoleId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = RoleId("")
    }
}
