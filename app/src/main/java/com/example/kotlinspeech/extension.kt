package com.example.kotlinspeech

import kotlinx.coroutines.suspendCancellableCoroutine
import retrofit2.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun <T> Call<T>.awaitResponse(): Response<T> {
    return suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            cancel()
        }
        enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                continuation.resume(response)
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                continuation.resumeWithException(t)
            }
        })
    }
}

//suspend fun <T : Any> Call<T>.await(): T {
//    return suspendCancellableCoroutine { continuation ->
//        continuation.invokeOnCancellation {
//            cancel()
//        }
//        enqueue(object : Callback<T> {
//            override fun onResponse(call: Call<T>, response: Response<T>) {
//                if (response.isSuccessful) {
//                    val body = response.body()
//                    if (body == null) {
//                        val invocation = call.request().tag(Invocation::class.java)!!
//                        val method = invocation.method()
//                        val e = KotlinNullPointerException(
//                            "Response from " + method.declaringClass.name +
//                                    "." + method.name +
//                                    " was null but response body type was declared as non-null"
//                        )
//                        continuation.resumeWithException(e)
//                    } else {
//                        continuation.resume(body)
//                    }
//                } else {
//                    continuation.resumeWithException(HttpException(response))
//                }
//            }
//
//            override fun onFailure(call: Call<T>, t: Throwable) {
//                continuation.resumeWithException(t)
//            }
//        })
//    }
//}