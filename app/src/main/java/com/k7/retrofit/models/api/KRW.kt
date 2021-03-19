package com.k7.retrofit

import com.google.gson.annotations.SerializedName

   
data class KRW (

   @SerializedName("ID") var ID : String,
   @SerializedName("NumCode") var NumCode : String,
   @SerializedName("CharCode") var CharCode : String,
   @SerializedName("Nominal") var Nominal : Int,
   @SerializedName("Name") var Name : String,
   @SerializedName("Value") var Value : Double,
   @SerializedName("Previous") var Previous : Double

)