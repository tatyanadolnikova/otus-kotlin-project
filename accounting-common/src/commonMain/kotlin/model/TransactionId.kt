package model

@JvmInline
value class TransactionId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = TransactionId("")
    }
}
