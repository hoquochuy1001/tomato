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

rootProject.name = "Tomato"
include(":app")
include(":core-network")
include(":core-localstorage")
include(":core-data")
include(":core-common")
include(":core-theme")
include(":core-designSystem")
include(":core-model")
include(":core-navigation")
