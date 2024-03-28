pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "QuizApp"
include(":app")
include(":feature")
include(":feature:onboard")
include(":feature:signup")
include(":feature:login")
include(":feature:welcome")
include(":feature:reset")
include(":feature:newpassword")
include(":feature:links")
include(":feature:newemail")
include(":feature:home")
include(":feature:settings")
include(":feature:discovery")
include(":feature:category")
include(":feature:statistics")
include(":feature:test")
include(":feature:createtest")
include(":core")
include(":core:common")
include(":feature:splash")
