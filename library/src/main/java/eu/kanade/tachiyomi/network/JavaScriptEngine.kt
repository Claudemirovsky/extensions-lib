package eu.kanade.tachiyomi.network

import android.content.Context

/**
 * Util for evaluating JavaScript in sources.
 */
class JavaScriptEngine(context: Context) {

    /**
     * Evaluate arbitrary JavaScript code and get the result as a primtive type
     * (e.g., String, Int).
     *
     * @since extensions-lib 14
     * @param script JavaScript to execute.
     * @return Result of JavaScript code as a primitive type.
     */
    suspend fun <T> evaluate(script: String): T = throw Exception("Stub!")
}
