package com.project.mokotube.service

import com.project.mokotube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/57a21421-a95b-4598-b602-f75abf8e7012")
    fun listVideos(): Call<VideoDto>
}