package com.gabsee.amphibiansapp.data

interface AmphibianRepository {
    suspend fun getAmphibiansData(): List<Amphibian>
}

class NetworkAmphibianRepository(
    private val amphibianApiService: AmphibianApiService
) : AmphibianRepository {
    override suspend fun getAmphibiansData(): List<Amphibian> {
        return amphibianApiService.getData()
    }
}