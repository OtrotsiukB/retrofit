package com.example.example

import com.google.gson.annotations.SerializedName

   
data class Example (

   @SerializedName("properties") var properties : Properties,
   @SerializedName("type") var type : String,
   @SerializedName("required") var required : List<String>,
   @SerializedName("description") var description : String

)