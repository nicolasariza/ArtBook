package com.udemy.artbook.repo

import androidx.lifecycle.LiveData
import com.udemy.artbook.model.ImageResponse
import com.udemy.artbook.roomdb.Art
import com.udemy.artbook.utils.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun  deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString: String): Resource<ImageResponse>
}