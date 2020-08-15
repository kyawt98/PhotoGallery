package com.kyawt.mycollection.service.repository

import com.kyawt.mycollection.service.model.collection.Collection
import com.kyawt.mycollection.service.model.collectionDetail.CollectionDetail
import com.kyawt.mycollection.service.model.detail.Detail
import com.kyawt.mycollection.service.model.photo.Photo
import retrofit2.http.GET
import retrofit2.http.Path

interface PhotoService {
    @GET("photos/?client_id=LUXItNFXZ3sV5SW_HCtr6olQfgxhBClz0PVWUfHtEBY")
    suspend fun getPhotoList(): Photo

    @GET("photos/{id}?client_id=LUXItNFXZ3sV5SW_HCtr6olQfgxhBClz0PVWUfHtEBY")
    suspend fun getPhotoDetail(
        @Path("id") photoId : String
    ) : Detail

    @GET("collections/?client_id=LUXItNFXZ3sV5SW_HCtr6olQfgxhBClz0PVWUfHtEBY")
    suspend fun getCategories() : Collection

    @GET("collections/{id}/photos?client_id=LUXItNFXZ3sV5SW_HCtr6olQfgxhBClz0PVWUfHtEBY")
    suspend fun getCategory(
        @Path("id") category_id : String
    ) : CollectionDetail
}