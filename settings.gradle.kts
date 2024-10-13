pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "Vocabra"
include(":app")
include(":core")
include(":core-ui")
include(":add_card")
include(":auth")
include(":navigation")
include(":navigation:navigation_data")
include(":navigation:navigation_domain")
include(":navigation:navigation_di")
include(":navigation:navigation_presentation")
include(":auth:feature_auth_data")
include(":auth:feature_auth_domain")
include(":auth:feature_auth_di")
include(":auth:feature_auth_presentation")
