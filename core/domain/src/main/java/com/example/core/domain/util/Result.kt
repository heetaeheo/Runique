package com.example.core.domain.util

sealed interface Result<out D, out E: Error> {

    data class Success<out D>(val data: D): Result<D, Nothing>
    data class Error<out E: com.example.core.domain.util.Error>(val error: E): Result<Nothing, E>
}

enum class PasswordValidationError: Error {
    TOO_SHORT,
    MISSING_ONE_DIGIT
}