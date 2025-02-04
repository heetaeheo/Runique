import com.android.build.api.dsl.LibraryExtension
import com.example.convetion.ExtensionType
import com.example.convetion.configureBuildTypes
import com.example.convetion.configureKotlinAndroid
import com.example.convetion.configureKotlinJvm
import com.example.convetion.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmKtorConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")

            dependencies {
                "implementation"(libs.findBundle("ktor").get())
            }
        }
    }
}