package com.shellmonger.apps.familyphotos.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.shellmonger.apps.familyphotos.models.User
import com.shellmonger.apps.familyphotos.services.interfaces.IdentityHandler
import com.shellmonger.apps.familyphotos.services.interfaces.IdentityRepository

/**
 * ViewModel for the MainActivity - this is based on the Android Architecture Components
 */
class MainActivityViewModel(private val identityRepository: IdentityRepository) : ViewModel() {
    /**
     * Current user record, or null if the user is not logged in.
     */
    val currentUser: LiveData<User?>
        get() = identityRepository.currentUser

    /**
     * Sign-out operation
     */
    fun initiateSignout(handler: IdentityHandler) = identityRepository.initiateSignout(handler)
}