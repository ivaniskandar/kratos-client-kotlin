-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt # core serialization annotations

# kotlinx-serialization-json specific. Add this if you have java.lang.NoClassDefFoundError kotlinx.serialization.json.JsonObjectSerializer
-keepclassmembers class kotlinx.serialization.json.** { *** Companion; }
-keepclasseswithmembers class kotlinx.serialization.json.** { kotlinx.serialization.KSerializer serializer(...); }

# project specific.
-keep,includedescriptorclasses class sh.ory.kratos.models.**$$serializer { *; }
-keepclassmembers class sh.ory.kratos.models.** { *** Companion; }
-keepclasseswithmembers class sh.ory.kratos.models.** { kotlinx.serialization.KSerializer serializer(...); }
