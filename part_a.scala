object part_a {
  def main(args: Array[String]): Unit={

    def caesar_cipher_encrypt(input: String, shift: Int): String={
      val encryptInput = new StringBuilder
      for(i<- 0 until input.length) {
        val char = input.charAt(i)
        val base = if(char.isUpper) 'A' else 'a'
        val inputValue = char-base
        val encryptWord = ((inputValue+shift)%26 + base).toChar
        encryptInput.append(encryptWord)
      }
      encryptInput.toString
    }

    def caesar_cipher_decrypt(input: String, shift: Int): String={
      caesar_cipher_encrypt(input, 26-shift)
    }


    println(caesar_cipher_encrypt("zoo", 1));
    println(caesar_cipher_decrypt("app", 1));
  }
}
