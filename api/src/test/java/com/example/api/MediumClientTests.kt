package com.example.api

import org.junit.Assert.assertNotNull
import org.junit.Test

class MediumClientTests {
    private val mediumClient = MediumClient();
  @Test
  fun `get Articles`()  {
      val articles = mediumClient.api.getArticles().execute()
      assertNotNull(articles.body()?.articles)
  }

}