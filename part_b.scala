object part_b {
  def cipher_encrypt(input: String): String = {
    val encryptInput = new StringBuilder
    for (i <- 0 until input.length) {
      val char = input.charAt(i)
      var base = if (char.isUpper) 'A' else 'a'
      val inputValue = char - base
      if(inputValue<13){
        val encryptWord = ((inputValue+ base)+13).toChar
        encryptInput.append(encryptWord)
      }
      else{
        val encryptWord = ((inputValue + base) - 13).toChar
        encryptInput.append(encryptWord)
      }
    }
    encryptInput.toString
  }

  def cipher_decrypt(encryptedText: String): String = {
    val decryptInput = new StringBuilder
    for (i <- 0 until encryptedText.length) {
      val char = encryptedText.charAt(i)
      var base = if (char.isUpper) 'A' else 'a'
      val encryptedValue = char - base
      if (encryptedValue < 13) {
        val decryptedWord = ((char + 13).toChar)
        decryptInput.append(decryptedWord)
      } else {
        val decryptedWord = ((char - 13).toChar)
        decryptInput.append(decryptedWord)
      }
    }
    decryptInput.toString
  }

  def main(args: Array[String]): Unit = {
    println(cipher_encrypt("hello"))
    println(cipher_decrypt("uryyb"))
  }
}



