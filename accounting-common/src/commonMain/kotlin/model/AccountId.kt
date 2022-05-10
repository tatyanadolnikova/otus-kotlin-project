package model

@JvmInline
value class AccountId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = AccountId("")
    }
}
