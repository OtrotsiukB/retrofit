package com.k7.retrofit

import com.google.gson.annotations.SerializedName

   
data class DataAPI (

   @SerializedName("Date") var Date : String,
   @SerializedName("PreviousDate") var PreviousDate : String,
   @SerializedName("PreviousURL") var PreviousURL : String,
   @SerializedName("Timestamp") var Timestamp : String,
   @SerializedName("Valute") var Valute : Valute

)