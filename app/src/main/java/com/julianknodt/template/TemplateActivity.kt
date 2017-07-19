package com.julianknodt.template

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class TemplateActivity : AppCompatActivity() {

    // region Overrides
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template)
    }
    // endregion Overrides
}
