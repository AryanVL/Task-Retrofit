package com.example.task_retrofit.common

import android.accounts.NetworkErrorException
import java.io.IOException

object ErrorHandling {

    val errorList = hashSetOf(
        IOException("An unexpected error occurred."),
        NetworkErrorException("Couldn't reach server. Check your internet connection."),
    )

}