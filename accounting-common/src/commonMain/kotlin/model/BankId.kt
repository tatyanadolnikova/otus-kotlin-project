package model

@JvmInline
value class BankId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = BankId("")
    }
}
