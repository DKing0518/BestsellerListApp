package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    @SerializedName("rank")
    var rank = 0

    @SerializedName("title")
    var title: String? = null

    @SerializedName("author")
    var author: String? = null

    @SerializedName("book_image")
    var bookImageUrl: String? = null  // Added book image field

    @SerializedName("description")
    var description: String? = null  // Added description field

    @SerializedName("amazon_product_url")
    var amazonUrl: String? = null  // Added Amazon URL field
}