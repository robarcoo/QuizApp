package com.daria.example.quizapp

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity for creating a new user account.
 *
 * This activity provides the user interface for entering the data required to create a new account.
 * The user must enter their first name, last name, email address, and password, and then confirm the password.
 * After successfully creating the account, the user will be redirected to the app login screen.
 */
class CreateAccountActivity : AppCompatActivity() {

    // Fields for UI elements
    private var toolbar: Toolbar? = null
    private var createAccountButton: Button? = null
    private var firstName: EditText? = null
    private var lastName: EditText? = null
    private var userEmail: EditText? = null
    private var userPassword: EditText? = null
    private var confirmUserPassword: EditText? = null


    // Progress dialog for displaying account creation process
    private var loadingBar: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        // Initialize UI elements
        InitializeFields()

        // Set click listener for create account button
        createAccountButton!!.setOnClickListener { CreateNewAccount() }

        // Set click listener for back button on toolbar
        toolbar!!.setNavigationOnClickListener { onBackPressed() }
    }

    /**
     * Initialize UI elements.
     */
    private fun InitializeFields() {
        toolbar = findViewById(R.id.toolbar)
        createAccountButton = findViewById(R.id.create_account_button)
        firstName = findViewById(R.id.first_name_edittext)
        lastName = findViewById(R.id.last_name_edittext)
        userEmail = findViewById(R.id.email_address_edittext)
        userPassword = findViewById(R.id.password_edittext)
        confirmUserPassword = findViewById(R.id.confirm_password_edittext)

        // Initialize progress dialog
        loadingBar = ProgressDialog(this)
    }

    /**
     * Create a new user account based on the entered data.
     */
    private fun CreateNewAccount() {
        // Get user-entered data
        val email = userEmail!!.text.toString()
        val password = userPassword!!.text.toString()
        val confirmPassword = confirmUserPassword!!.text.toString()
        val firstName = firstName!!.text.toString()
        val lastName = lastName!!.text.toString()

        // Check the correctness of the entered data
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Email Required...", Toast.LENGTH_LONG).show()
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Password Required...", Toast.LENGTH_LONG).show()
        } else if (TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(this, "Password Confirmation Required...", Toast.LENGTH_LONG).show()
        } else if (TextUtils.isEmpty(firstName)) {
            Toast.makeText(this, "First Name Required...", Toast.LENGTH_LONG).show()
        } else if (TextUtils.isEmpty(lastName)) {
            Toast.makeText(this, "Last Name Required...", Toast.LENGTH_LONG).show()
        } else if (password != confirmPassword) {
            Toast.makeText(this, "Passwords Mismatch...", Toast.LENGTH_LONG).show()
        } else {
            // Display progress dialog
            loadingBar!!.setTitle("Creating New Account")
            loadingBar!!.setMessage("Please wait, while we are creating a new account for you...")
            loadingBar!!.setCanceledOnTouchOutside(false)
            loadingBar!!.show()

        }
    }

    /**
     * Navigate to the specified activity.
     *
     * @param activityClass The activity class to navigate to.
     * @param backEnabled Flag indicating whether to allow returning to the previous activity when the Back button is pressed.
     */
    private fun SendToActivity(activityClass: Class<out Activity?>, backEnabled: Boolean) {
        val intent = Intent(this, activityClass)
        if (!backEnabled) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
    }
}
