package model

enum class Currency {
    RUBLE,
    EURO,
    DOLLAR;

    companion object {
        fun default(): Currency = RUBLE
    }
}
