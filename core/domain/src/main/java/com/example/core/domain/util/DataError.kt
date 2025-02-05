package com.example.core.domain.util

import com.example.core.domain.util.Result


sealed interface DataError: Error {

    enum class Network: DataError{
        REQUEST_TIMEOUT,
        UNAUTHORIZED,
        CONFLICT,
        TOO_MANY_REQUEST,
        NO_INTERNET,
        PAYLOAD_TOO_LARGE,
        SERVER_ERROR,
        SERIALIZATION,
        UNKNOWN
    }


    enum class Local: DataError {
        DISK_FULL
    }
}

inline fun <T, D, E: Error, R> Result<T, E>.map(map: (T) -> R): Result<R,E> {
    return when(this){
        is Result.Error -> Result.Error(error)
        is Result.Success -> Result.Success(map(data))
    }
}

typealias EmptyDataResult<E> = Result<Unit, E>