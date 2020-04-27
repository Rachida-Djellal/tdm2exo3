package com.example.myapplication

import androidx.room.*


@Dao
public interface IntervDAO {
    @Query("SELECT * FROM interv")
    fun getIntervs(): Array<Interv>

    @Query("SELECT * FROM interv WHERE id = :code")
    fun getInterv(code: Int): List<Interv>

    @Insert
    fun ajouter(interv : Interv)

    @Update
    fun modifier(interv : Interv)

    @Delete
    fun supprimer(interv: Interv)
}