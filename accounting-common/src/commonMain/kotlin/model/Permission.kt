package model

enum class Permission {
    CREATE,
    READ,
    UPDATE,
    DELETE;

    companion object {
        fun convert(permissionAsString: String) {

        }
    }
}
