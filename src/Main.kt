fun main() {
    var ahmed: UserRole = UserRole.ADMIN
    checkAccess(ahmed)
    for (entry in UserRole.entries) {
        println(entry)
    }
    println(UserRole.entries)
}

enum class UserRole(accessLevel: Int) {
    ADMIN(1), EDITOR(2), VIEWER(3)
}

fun checkAccess(accessLevel: UserRole) {
    when (accessLevel) {
        UserRole.ADMIN -> println("User role is admin")
        UserRole.EDITOR -> println("User role is editor")
        UserRole.VIEWER -> println("User role is viewer")
    }
}
