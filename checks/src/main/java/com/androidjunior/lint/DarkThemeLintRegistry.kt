package com.androidjunior.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue

class DarkThemeLintRegistry : IssueRegistry() {

    override val issues: List<Issue>
        get() = listOf(DirectColorUseIssue.ISSUE)

    override val api: Int = com.android.tools.lint.detector.api.CURRENT_API
}