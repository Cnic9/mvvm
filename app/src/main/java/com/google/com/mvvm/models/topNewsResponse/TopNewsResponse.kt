package com.google.com.mvvm.models.topNewsResponse

data class TopNewsResponse(
	val totalResults: Int? = null,
	val articles: List<ArticlesItem?>? = null,
	val status: String? = null
)
